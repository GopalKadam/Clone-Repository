package com.byyType;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test 
{
	public static void main(String[] args) {
		
		ApplicationContext ap=new AnnotationConfigApplicationContext(AppConfig.class);
		
		Employee e=(Employee) ap.getBean("e");
		System.out.println(e.getEid());
		System.out.println(e.getEname());
		System.out.println(e.getEdept().getDid());
		System.out.println(e.getEdept().getDname());
		
	}

}
