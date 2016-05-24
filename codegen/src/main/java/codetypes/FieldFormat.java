package codetypes;

public class FieldFormat implements Field {

	private int occurs;
	
	private String name;
	
	private String type;
	
	private int decimalPoints;
	
	private boolean impliedDecimal;
	
	private int size;

	public int getOccurs() {
		return occurs;
	}

	public void setOccurs(int occurs) {
		this.occurs = occurs;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getDecimalPoints() {
		return decimalPoints;
	}

	public void setDecimalPoints(int decimalPoints) {
		this.decimalPoints = decimalPoints;
	}

	public boolean isImpliedDecimal() {
		return impliedDecimal;
	}

	public void setImpliedDecimal(boolean impliedDecimal) {
		this.impliedDecimal = impliedDecimal;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}
	
	
	
}
