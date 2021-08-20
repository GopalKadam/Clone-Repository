package com.byyType;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig 
{
	@Bean
	public Employee e()
	{
		Employee em=new Employee();
		em.setEid(115);
		em.setEname("Sanjay");
		return em;
		
	}
	@Bean
	public Department d()
	{
		Department dp=new Department();
		dp.setDid(1001);
		dp.setDname("Maintance");
		return dp;

	}
	

}
