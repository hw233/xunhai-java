package com.service.impl;

import java.util.Collections;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

import org.json.JSONObject;

import com.common.CacheService;
import com.constant.CacheConstant;
import com.constant.CodeConstant;
import com.dao.CodeDAO;
import com.domain.ActCode;
import com.domain.CodeUseLog;
import com.service.ICodeService;

/**
 * @author barsk
 * 2014-5-10
 * 激活码	
 */
public class CodeService implements ICodeService {

	private CodeDAO codeDAO = new CodeDAO();
	
	@Override
	public void initActCodeCache() {
		
		Map<String, ActCode> codeMap = new ConcurrentHashMap<String, ActCode>(1 << 22);
		List<ActCode> codeList = codeDAO.getCodeList();
		for (ActCode code :codeList) {
			codeMap.put(code.getCode(), code);
		}
		
		CacheService.putToCache(CacheConstant.CODE_CACHE, codeMap);
		CacheService.putToCache(CacheConstant.SYN_ACT_CODE, Collections.synchronizedSet(new HashSet<ActCode>()));
	}

	@SuppressWarnings("unchecked")
	@Override
	public ActCode getActCodeByCode(String code) {
		Map<String, ActCode> codeMap = (Map<String, ActCode>) CacheService.getFromCache(CacheConstant.CODE_CACHE);
		return codeMap.get(code);
	}

	@SuppressWarnings("unchecked")
	@Override
	public void updateActCode(ActCode actCode) {
		Set<ActCode> codeSet = (Set<ActCode>) CacheService.getFromCache(CacheConstant.SYN_ACT_CODE);
		codeSet.add(actCode);
	}

	@Override
	public JSONObject useCode(Integer playerID, String site, String code) throws Exception {
		
		JSONObject resultJson = new JSONObject();
		
		ActCode actCode = getActCodeByCode(code);
		if (actCode == null || actCode.getState() == 1) {
			resultJson.put("result", 0);
			return resultJson;
		}
		
		// 同类型只能使用一个
		if (actCode.getType() != CodeConstant.CODE_10) {
			if (codeDAO.checkUseTypeCode(playerID, site, actCode.getType())) {
				resultJson.put("result", 1);
				return resultJson;
			}
		}
		
		/*
		// 运营商专属
		if (actCode.getExclusive() == 1) {
			String aa = site.substring(0, 2);
			String bb = actCode.getSite().substring(0,2);
			if (!aa.equalsIgnoreCase(bb)) {
				return null;
			}
		}*/
		
		actCode.setState(1);
		actCode.setUseTime(new Date());
		updateActCode(actCode);
		
		// 使用日志
		CodeUseLog log = new CodeUseLog();
		log.setCode(code);
		log.setType(actCode.getType());
		log.setPlayerID(playerID);
		log.setSite(site);
		log.setCreateTime(new Date());
		codeDAO.createCodeLog(log);
		
		resultJson.put("result", 10);
		resultJson.put("rewardID", actCode.getRewardID());
		
		return resultJson;
	}

}
