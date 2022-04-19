package com.yezhiyuan.imports;


import org.springframework.context.annotation.ImportSelector;
import org.springframework.core.type.AnnotationMetadata;

public class MyImportBean implements ImportSelector {


public 	MyImportBean(){
	System.out.println("MyImportBean 构造方法被调用了" );
}

	@Override
	public String[] selectImports(AnnotationMetadata importingClassMetadata) {
		System.out.println("调用了 selectImports");
		return new String[0];
	}
}
