package com.Habeshaschool.AutomationTesting;

import org.testng.annotations.Test;

public class InvocationCountTest {
    
	
	@Test(invocationCount=4)
	public void Sum() {
		
		int a =10;
		int b=20;
		int c= a+b;
		System.out.println("sum is =="+c);
		
	}
}
