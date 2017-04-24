package com.crimsonpig.business;

import java.math.BigDecimal;

public class Complex {

	private String stuffNbr;
	private BigDecimal stuffAmt;
	private BigDecimal moreStuffAmt;
	private BigDecimal stuffTotalAmt;
	private String thingAddr;
	private String thingStCd;

	public String getStuffNbr() {
		return stuffNbr;
	}

	public void setStuffNbr(String stuffNbr) {
		this.stuffNbr = stuffNbr;
	}

	public BigDecimal getStuffAmt() {
		return stuffAmt;
	}

	public void setStuffAmt(BigDecimal stuffAmt) {
		this.stuffAmt = stuffAmt;
	}

	public BigDecimal getMoreStuffAmt() {
		return moreStuffAmt;
	}

	public void setMoreStuffAmt(BigDecimal moreStuffAmt) {
		this.moreStuffAmt = moreStuffAmt;
	}

	public BigDecimal getStuffTotalAmt() {
		return stuffTotalAmt;
	}

	public void setStuffTotalAmt(BigDecimal stuffTotalAmt) {
		this.stuffTotalAmt = stuffTotalAmt;
	}

	public String getThingAddr() {
		return thingAddr;
	}

	public void setThingAddr(String thingAddr) {
		this.thingAddr = thingAddr;
	}

	public String getThingStCd() {
		return thingStCd;
	}

	public void setThingStCd(String thingStCd) {
		this.thingStCd = thingStCd;
	}
}