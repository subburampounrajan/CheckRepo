package com.TestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Retry_Concept_1 {

	@Test
	public void username() {
		String exp="subbu";
		String act ="subbu";
		Assert.assertEquals(act, exp);
		}
	
	@Test(retryAnalyzer = Rerun_1.class)
	public void password() {
		String exp="123";
		String act ="456";
		Assert.assertEquals(act, exp);
		}
}
