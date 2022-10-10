package com.TestNG;

import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Parameterized_Concept {
	@Test
	@Parameters({"uname","pword"})
	public void credentials(@Optional("xyz")String uname,String pword) {
		System.out.println("Username is :" +uname);
		System.out.println("Password is :" +pword);
		System.out.println("success");
		}

}
