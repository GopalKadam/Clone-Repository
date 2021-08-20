package com.cjc;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class Test 
{
	public static void main(String[] args) {
		
		/*ApplicationContext ap=new ClassPathXmlApplicationContext("bean.xml");
	
		Demo d=(Demo) ap.getBean("s");
		System.out.println(d);
		d.m1();
		System.out.println(d);
		
		System.out.println("");

		Demo d1=(Demo) ap.getBean("s");
		System.out.println(d1);
		d1.m1();
		System.out.println(d1);*/
		
		Resource rs=new ClassPathResource("bean.xml");
		BeanFactory bf=new XmlBeanFactory(rs);
		
		Demo d=(Demo) bf.getBean("s");
		d.m1();
		System.out.println(d);
		
		System.out.println("");
		
		Demo d1=(Demo) bf.getBean("s");
		d1.m1();
		System.out.println(d1);
		
		
	}

}
