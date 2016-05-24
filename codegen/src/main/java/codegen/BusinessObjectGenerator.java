package codegen;

import java.io.Serializable;

import org.jboss.forge.roaster.Roaster;
import org.jboss.forge.roaster.model.source.JavaClassSource;

import codetypes.RecordFormat;

public class BusinessObjectGenerator {

	public static void main(String... args){
		
		final JavaClassSource boClass = Roaster.create(JavaClassSource.class);
		
		boClass.setPackage("com.crimsonpig.ebcdic.bos");
		boClass.setName("BusinessObject");
		
		boClass.addInterface(Serializable.class);
		boClass.addField()
			.setName("serialVersionUID")
			.setType("long")
			.setLiteralInitializer("1L")
			.setPrivate()
			.setStatic(true)
			.setFinal(true);
		

		
		boClass.addMethod()
			.setConstructor(true)
			.setPublic()
			.setBody("");
		
		boClass.addProperty("String", "nbr");
		boClass.addProperty("String", "extNbr");
		boClass.addField()
			.setName("taxId")
			.setPrivate()
			.setType("String");
		boClass.addProperty("List<String>", "codes").getField().setLiteralInitializer("new ArrayList<String>()");
		
		boClass.addMethod()
			.setName("tokenize")
			.setPublic()
			.setReturnTypeVoid()
			.setBody("System.out.println(1);"
					+ "System.out.println(2);"
					+ "System.out.println(3);");
		
		System.out.println(boClass.getOrigin());
	}

}
