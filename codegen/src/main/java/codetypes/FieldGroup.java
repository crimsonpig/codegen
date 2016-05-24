package codetypes;

import java.util.ArrayList;
import java.util.List;

public class FieldGroup implements Field {

	private int occurs;
	
	private String name;
	
	private List<Field> subFields = new ArrayList<Field>();

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

	public List<Field> getSubFields() {
		return subFields;
	}

	public void setSubFields(List<Field> subFields) {
		this.subFields = subFields;
	}
	
	
	
}
