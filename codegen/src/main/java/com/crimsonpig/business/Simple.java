package com.crimsonpig.business;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Simple {

	private String stuffNbr;
	private BigDecimal stuffAmt;
	private List<String> thingCodes = new ArrayList<String>(5);

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

	public List<String> getThingCodes() {
		return thingCodes;
	}

	public void setThingCodes(List<String> thingCodes) {
		this.thingCodes = thingCodes;
	}
}