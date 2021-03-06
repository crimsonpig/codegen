package codegen;

import static org.junit.Assert.*;

import java.io.IOException;

import org.junit.Test;

import codetypes.RecordFormat;
import codetypes.data.SampleRecordFormats;

public class BusinessObjectTests {

	
	@Test
	public void simpleBoTest() {
		
		RecordFormat simple = SampleRecordFormats.getSimpleRecordFormat();
		Generator boGen = new Generator();
		boGen.setPackageName("com.crimsonpig.business");
		boGen.setTypeName("Simple");
		boGen.setOutputPath("src/main/java/com/crimsonpig/business");
		try {
			boGen.buildBo(simple);
		} catch (IOException e) {
			e.printStackTrace();
			fail();
		}
		
	}
	
	@Test
	public void complexBoTest() {
		
		RecordFormat simple = SampleRecordFormats.getComplexRecordFormat();
		Generator boGen = new Generator();
		boGen.setPackageName("com.crimsonpig.business");
		boGen.setTypeName("Complex");
		boGen.setOutputPath("src/main/java/com/crimsonpig/business");
		try {
			boGen.buildBo(simple);
		} catch (IOException e) {
			e.printStackTrace();
			fail();
		}
		
	}
	
}
