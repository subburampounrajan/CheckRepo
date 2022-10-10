package com.TestNG;

import org.apache.poi.ss.formula.functions.NumericFunction.TwoArg;
import org.testng.annotations.Test;

public class Expected_Exception_Concept {
	@Test(expectedExceptions = ArithmeticException.class)
	
	/*@Test(expectedExceptions = Throwable.class)
	  @Test(expectedExceptions = Exception.class)
	  the above Two parent exxcetion should not be used 
	  because we could not idendify what 
	   type of exception is there and
	    if have null pointer exception also it run the program  */
	
	public void expected_Exception_Demo() {
		int a=10;
		System.out.println(a/0);

	}

	
}
