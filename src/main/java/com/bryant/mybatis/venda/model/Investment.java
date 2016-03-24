package com.bryant.mybatis.venda.model;

import java.math.BigInteger;
import java.util.Date;

public class Investment {
	private String investmentid;
	private String tenderid;
	private String userid;
	private BigInteger investmentmoney;
	private Date investmentdate;
	private Integer status;
	private String holdnumber;
	private BigInteger yincome;
	private String username;
	private String usermobile;
	private Integer moneystatus;
	private String successflag;
	private Integer progress;
	private String chinapnrusrcustid;
	private Integer transferstatus;
	private BigInteger actualincome;
	public String getInvestmentid() {
		return investmentid;
	}
	public void setInvestmentid(String investmentid) {
		this.investmentid = investmentid;
	}
	public String getTenderid() {
		return tenderid;
	}
	public void setTenderid(String tenderid) {
		this.tenderid = tenderid;
	}
	public String getUserid() {
		return userid;
	}
	public void setUserid(String userid) {
		this.userid = userid;
	}
	public BigInteger getInvestmentmoney() {
		return investmentmoney;
	}
	public void setInvestmentmoney(BigInteger investmentmoney) {
		this.investmentmoney = investmentmoney;
	}
	public Date getInvestmentdate() {
		return investmentdate;
	}
	public void setInvestmentdate(Date investmentdate) {
		this.investmentdate = investmentdate;
	}
	public Integer getStatus() {
		return status;
	}
	public void setStatus(Integer status) {
		this.status = status;
	}
	public String getHoldnumber() {
		return holdnumber;
	}
	public void setHoldnumber(String holdnumber) {
		this.holdnumber = holdnumber;
	}
	public BigInteger getYincome() {
		return yincome;
	}
	public void setYincome(BigInteger yincome) {
		this.yincome = yincome;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getUsermobile() {
		return usermobile;
	}
	public void setUsermobile(String usermobile) {
		this.usermobile = usermobile;
	}
	public Integer getMoneystatus() {
		return moneystatus;
	}
	public void setMoneystatus(Integer moneystatus) {
		this.moneystatus = moneystatus;
	}
	public String getSuccessflag() {
		return successflag;
	}
	public void setSuccessflag(String successflag) {
		this.successflag = successflag;
	}
	public Integer getProgress() {
		return progress;
	}
	public void setProgress(Integer progress) {
		this.progress = progress;
	}
	public String getChinapnrusrcustid() {
		return chinapnrusrcustid;
	}
	public void setChinapnrusrcustid(String chinapnrusrcustid) {
		this.chinapnrusrcustid = chinapnrusrcustid;
	}
	public Integer getTransferstatus() {
		return transferstatus;
	}
	public void setTransferstatus(Integer transferstatus) {
		this.transferstatus = transferstatus;
	}
	public BigInteger getActualincome() {
		return actualincome;
	}
	public void setActualincome(BigInteger actualincome) {
		this.actualincome = actualincome;
	}
	@Override
	public String toString() {
		return "Investment [investmentid=" + investmentid + ", tenderid="
				+ tenderid + ", userid=" + userid + ", investmentmoney="
				+ investmentmoney + ", investmentdate=" + investmentdate
				+ ", status=" + status + ", holdnumber=" + holdnumber
				+ ", yincome=" + yincome + ", username=" + username
				+ ", usermobile=" + usermobile + ", moneystatus=" + moneystatus
				+ ", successflag=" + successflag + ", progress=" + progress
				+ ", chinapnrusrcustid=" + chinapnrusrcustid
				+ ", transferstatus=" + transferstatus + ", actualincome="
				+ actualincome + "]";
	}
	
	
}
