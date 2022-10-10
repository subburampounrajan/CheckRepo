package com.TestNG;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;


public class SoftAssert_Concept {
	@Test
	public void SoftAssert_Demo() {
		String exp="abcd";
		String act="abcde";
		SoftAssert soft =new SoftAssert();
		/* in this soft assert even when the test 
		 * case fails it countinously go fot next statement
		 */
		soft.assertEquals(act, exp);
		System.out.println("validation done successfully");
		soft.assertAll();
		//THE ABOVE FUNCTION IS USED TPO VALIDATE THE EXCEPTION CAUSED.
	}
}
