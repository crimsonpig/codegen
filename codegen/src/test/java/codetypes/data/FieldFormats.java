package codetypes.data;

import codetypes.FieldFormat;

public class FieldFormats {

	public static FieldFormat getStuffNbr(){
		FieldFormat nbr = new FieldFormat();
		nbr.setDecimalPoints(0);
		nbr.setImpliedDecimal(false);
		nbr.setType("X");
		nbr.setSize(8);
		nbr.setOccurs(1);
		nbr.setName("STUFF_NBR");
		return nbr;
	}
	
	public static FieldFormat getThingId(){
		FieldFormat nbr = new FieldFormat();
		nbr.setDecimalPoints(0);
		nbr.setImpliedDecimal(false);
		nbr.setType("X");
		nbr.setSize(5);
		nbr.setOccurs(1);
		nbr.setName("THING_ID");
		return nbr;
	}
	
	
	public static FieldFormat getStuffAmt(){
		FieldFormat nbr = new FieldFormat();
		nbr.setDecimalPoints(2);
		nbr.setImpliedDecimal(true);
		nbr.setType("9");
		nbr.setSize(5);
		nbr.setOccurs(1);
		nbr.setName("STUFF_AMT");
		return nbr;
	}
	
	public static FieldFormat getThingAmt(){
		FieldFormat nbr = new FieldFormat();
		nbr.setDecimalPoints(2);
		nbr.setImpliedDecimal(true);
		nbr.setType("3");
		nbr.setSize(5);
		nbr.setOccurs(1);
		nbr.setName("THING_AMT");
		return nbr;
	}
	
	public static FieldFormat getThingTotal(){
		FieldFormat nbr = new FieldFormat();
		nbr.setDecimalPoints(2);
		nbr.setImpliedDecimal(true);
		nbr.setType("3");
		nbr.setSize(6);
		nbr.setOccurs(1);
		nbr.setName("THING_TOTAL_AMT");
		return nbr;
	}
	
	public static FieldFormat getFiller(){
		FieldFormat nbr = new FieldFormat();
		nbr.setDecimalPoints(0);
		nbr.setImpliedDecimal(false);
		nbr.setType("X");
		nbr.setSize(86);
		nbr.setOccurs(1);
		nbr.setName("FILLER1");
		return nbr;		
	}
	
	public static FieldFormat getThingAddr(){
		FieldFormat nbr = new FieldFormat();
		nbr.setDecimalPoints(0);
		nbr.setImpliedDecimal(false);
		nbr.setType("X");
		nbr.setSize(30);
		nbr.setOccurs(1);
		nbr.setName("THING_ADDR");
		return nbr;
	}	
	
	public static FieldFormat getThingCodes(){
		FieldFormat nbr = new FieldFormat();
		nbr.setDecimalPoints(0);
		nbr.setImpliedDecimal(false);
		nbr.setType("X");
		nbr.setSize(5);
		nbr.setOccurs(5);
		nbr.setName("THING_CODE");
		return nbr;
	}	
	
	public static FieldFormat getThingStCd(){
		FieldFormat nbr = new FieldFormat();
		nbr.setDecimalPoints(0);
		nbr.setImpliedDecimal(false);
		nbr.setType("X");
		nbr.setSize(2);
		nbr.setOccurs(1);
		nbr.setName("THING_ST_CD");
		return nbr;
	}	
	
	public static FieldFormat getMoreStuffAmt(){
		FieldFormat nbr = new FieldFormat();
		nbr.setDecimalPoints(2);
		nbr.setImpliedDecimal(true);
		nbr.setType("3");
		nbr.setSize(6);
		nbr.setOccurs(1);
		nbr.setName("MORE_STUFF_AMT");
		return nbr;
	}
	
	public static FieldFormat getStuffTotalAmt(){
		FieldFormat nbr = new FieldFormat();
		nbr.setDecimalPoints(2);
		nbr.setImpliedDecimal(true);
		nbr.setType("3");
		nbr.setSize(7);
		nbr.setOccurs(1);
		nbr.setName("STUFF_TOTAL_AMT");
		return nbr;
	}
}
