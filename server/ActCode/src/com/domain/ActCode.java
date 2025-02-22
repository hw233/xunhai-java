package com.domain;

import java.io.Serializable;
import java.sql.Timestamp;
import java.util.Date;

import com.util.CodeUtil;

/**
 * @author barsk
 * 2014-5-10
 * 激活码	
 */
public class ActCode implements Serializable {

	private static final long serialVersionUID = 9136023605666589080L;

	/** 激活码编号 */
	private int codeID;
	/** 激活码 */
	private String code;
	/** 站点 */
	private String site;
	/** 类型 */
	private int type;
	/** 奖励编号 */
	private int rewardID;
	/** 当前类型数量 */
	private int typeNum;
	/** 是否专属 */
	private int exclusive;
	/** 状态(0.未使用 1.已使用) */
	private int state;
	/** 创建时间 */
	private Date createTime;
	/** 使用时间 */
	private Date useTime;
	
	/** 得到创建sql */
	public String getInsertSql() {
		
		StringBuffer sb = new StringBuffer();
		
		sb.append("INSERT INTO "+CodeUtil.GEN_CODE_TABLE_NAME+"(CODE,SITE,TYPE,REWARD_ID,TYPE_NUM,EXCLUSIVE,CREATE_TIME) VALUES ");
		sb.append("(");
		sb.append("'");
		sb.append(code);
		sb.append("'");
		sb.append(",");
		sb.append("'");
		sb.append(site);
		sb.append("'");
		sb.append(",");
		sb.append(type);
		sb.append(",");
		sb.append(rewardID);
		sb.append(",");
		sb.append(typeNum);
		sb.append(",");
		sb.append(exclusive);
		sb.append(",");
		sb.append("'");
		sb.append(new Timestamp(createTime.getTime()));
		sb.append("'");
		sb.append(")");
		
		return sb.toString();
	}
	
	/** 得到更新sql */
	public String getUpdateSql() {
		
		StringBuffer sb = new StringBuffer();
		
		sb.append("UPDATE T_ACT_CODE SET ");
		sb.append(" STATE = 1 ");
		sb.append(",");
		sb.append(" USE_TIME = ");
		sb.append("'");
		sb.append(new Timestamp(System.currentTimeMillis()));
		sb.append("'");
		sb.append(" WHERE CODE_ID = "+codeID);
		
		return sb.toString();
	}
	
	public int getCodeID() {
		return codeID;
	}
	public void setCodeID(int codeID) {
		this.codeID = codeID;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getSite() {
		return site;
	}
	public void setSite(String site) {
		this.site = site;
	}
	public int getType() {
		return type;
	}
	public void setType(int type) {
		this.type = type;
	}
	public int getTypeNum() {
		return typeNum;
	}
	public void setTypeNum(int typeNum) {
		this.typeNum = typeNum;
	}
	public int getExclusive() {
		return exclusive;
	}
	public void setExclusive(int exclusive) {
		this.exclusive = exclusive;
	}
	public Date getCreateTime() {
		return createTime;
	}
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
	public Date getUseTime() {
		return useTime;
	}
	public void setUseTime(Date useTime) {
		this.useTime = useTime;
	}

	public int getState() {
		return state;
	}

	public void setState(int state) {
		this.state = state;
	}

	public int getRewardID() {
		return rewardID;
	}

	public void setRewardID(int rewardID) {
		this.rewardID = rewardID;
	}

}
