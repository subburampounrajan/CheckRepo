package com.TestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Hard_Assert_Concept {
	@Test
	public void hardAssert_Demo() {
		String exp="abcd";
		String act="abcd";
		Assert.assertEquals(act, exp);
		System.out.println("validation done successfully");

	}

}
