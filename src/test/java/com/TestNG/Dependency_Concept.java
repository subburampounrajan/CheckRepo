package com.TestNG;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class Dependency_Concept {
	@Ignore
	@Test
	public void tenth() {
		System.out.println("Tenth");
	}
	
	@Test(dependsOnMethods = "tenth")
	public void twelth() {
		System.out.println("Twelth");
	}

}
