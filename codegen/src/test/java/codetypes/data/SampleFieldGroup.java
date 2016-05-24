package codetypes.data;

import codetypes.FieldGroup;

public class SampleFieldGroup {

	
	public static FieldGroup getFieldGroup(){
		FieldGroup grp = new FieldGroup();
		
		grp.getSubFields().add(FieldFormats.getThingId());
		grp.getSubFields().add(FieldFormats.getThingAmt());
		grp.getSubFields().add(FieldFormats.getThingTotal());
		grp.setName("THINGS");
		grp.setOccurs(8);

		return grp;
	}
	
}
