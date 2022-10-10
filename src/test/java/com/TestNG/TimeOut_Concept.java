package com.TestNG;

import org.testng.annotations.Test;

public class TimeOut_Concept {
	@Test(timeOut = 5025)
	public void login() throws InterruptedException {
		
		Thread.sleep(2000);
		System.out.println("Browser launch");
		
		Thread.sleep(1000);
		System.out.println("url launch");
		
		Thread.sleep(2000);
		System.out.println("Login");
		
		
		
	}

}
