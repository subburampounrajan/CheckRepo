package com.TestNG;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProvider_concept {
	@Test (dataProvider = "input")
	public void credentials(String uname,String pword) {
	System.out.println("Username is :" +uname);
	System.out.println("Password is :" +pword);
}

@DataProvider
public Object[][] input() {
	return new Object[][] {
		{"abcd","1234"},{"efgh","5678"},{"ijkl","9876"}
	};
}
}


