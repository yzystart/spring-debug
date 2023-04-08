package com.yezhiyuan.aoptest;


import com.yezhiyuan.annotation.MyAnnotation;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Component
@Service
public class TestAopService {


	@MyAnnotation
	public void doSomething(){
		System.out.println("TestAopService doSomething");
	}
}
