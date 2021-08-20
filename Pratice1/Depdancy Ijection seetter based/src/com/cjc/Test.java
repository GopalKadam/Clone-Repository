package com.cjc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test 
{
	public static void main(String[] args) {
		
		ApplicationContext ap=new ClassPathXmlApplicationContext("bean.xml");
		
		Student s=(Student) ap.getBean("s");
		System.out.println(s.getRollno());
		System.out.println(s.getName());
		System.out.println(s.getAddr());
		System.out.println(s.getBatch().bid);
		System.out.println(s.getBatch().bname);
		
	}

}
