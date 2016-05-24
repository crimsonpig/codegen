package codegen;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import org.jboss.forge.roaster.Roaster;
import org.jboss.forge.roaster.model.source.JavaClassSource;

import codetypes.FieldFormat;
import codetypes.FieldGroup;
import codetypes.RecordFormat;

public class Generator {

	private String packageName;
	
	private String typeName;
	
	private String outputPath;
	
	private Set<String> imports = new TreeSet<String>();

	public void setPackageName(String packageName) {
		this.packageName = packageName;
	}

	public void setTypeName(String typeName) {
		this.typeName = typeName;
	}

	public void setOutputPath(String outputPath) {
		this.outputPath = outputPath;
	}

	public void buildBo(RecordFormat simple) throws IOException {
	
		JavaClassSource boClass = Roaster.create(JavaClassSource.class);
		boClass.setName(typeName);
		boClass.setPackage(packageName);
		
		simple.getFields().forEach(field -> {
			String type = "String";
			if(field instanceof FieldGroup){
				
			} else if(field instanceof FieldFormat){
				FieldFormat ff = (FieldFormat) field;
				String name = toCamelCase(ff.getName());
				if("9".equals(ff.getType()) || "3".equals(ff.getType())){
					if(ff.isImpliedDecimal()){
						type = "BigDecimal";
						imports.add("java.math.BigDecimal");
					} else {
						type = "Integer";
					}
				}
				if(ff.getOccurs() > 1){
					String typeParam = "<" + type + ">";
					type = "List<" + type + ">";
					name = name + "s";
					imports.add("java.util.List");
					imports.add("java.util.ArrayList");
					
					boClass.addProperty(type, name).getField().setLiteralInitializer("new ArrayList" + typeParam + "(" + ff.getOccurs() + ")");		
				} else {
					boClass.addProperty(type, name);		
				}
		
			}

			
		});
		
		imports.forEach(imp -> boClass.addImport(imp));
		
		File output = new File(outputPath);
		PrintWriter classWriter = new PrintWriter(new FileWriter(output));
		classWriter.print(boClass.getOrigin().toString());
		classWriter.flush();
		classWriter.close();
	}

	private String toCamelCase(String name) {
		String[] parts = name.split("_");
		StringBuilder camel = new StringBuilder();
		for(int i=0; i< parts.length; i++){
			String part = parts[i];
			char firstChar = part.charAt(0);
			if(i==0){
				firstChar = Character.toLowerCase(firstChar);
			}
			camel.append(firstChar);
			camel.append(part.substring(1).toLowerCase());
		}

		return camel.toString();
	}
	
}
