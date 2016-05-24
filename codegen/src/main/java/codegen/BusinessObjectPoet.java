package codegen;


import java.io.IOException;

import javax.lang.model.element.Modifier;

import com.squareup.javapoet.*;

public class BusinessObjectPoet {

	public static void main(String[] args) throws IOException {
		
		MethodSpec main = MethodSpec.methodBuilder("main")
				.addModifiers(Modifier.PUBLIC, Modifier.STATIC)
				.returns(void.class)
				.addParameter(String[].class, "args")
				.addStatement("$T.out.println($S)", System.class, "Hello JavaPoet")
				.build();
		
		FieldSpec field = FieldSpec.builder(String.class,"nbr", Modifier.PRIVATE)
				.build();
		
		TypeSpec boType = TypeSpec.classBuilder("BusinessObject")
				.addModifiers(Modifier.PUBLIC)
				.addMethod(main)
				.addField(field)
				.build();
		
		JavaFile javaFile = JavaFile.builder("com.crimsonpig.ebcdic.business", boType)
				.build();
		
		javaFile.writeTo(System.out);
		
	}

}
