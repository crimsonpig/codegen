package codetypes.data;

import codetypes.RecordFormat;

public class SampleRecordFormats {

	
	public static RecordFormat getSimpleRecordFormat(){
		RecordFormat record = new RecordFormat();
		record.getFields().add(FieldFormats.getStuffNbr());
		record.getFields().add(FieldFormats.getStuffAmt());
		record.getFields().add(FieldFormats.getThingCodes());
		return record;
	}
	
	public static RecordFormat getComplexRecordFormat(){
		RecordFormat record = new RecordFormat();
		record.getFields().add(FieldFormats.getStuffNbr());
		record.getFields().add(FieldFormats.getStuffAmt());
		record.getFields().add(FieldFormats.getMoreStuffAmt());
		record.getFields().add(FieldFormats.getStuffTotalAmt());
		record.getFields().add(SampleFieldGroup.getFieldGroup());
		record.getFields().add(FieldFormats.getFiller());
		record.getFields().add(FieldFormats.getThingAddr());
		record.getFields().add(FieldFormats.getThingStCd());
		return record;
	}
	
}
