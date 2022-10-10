package com.runner1;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.BaseClass.BaseClass;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
//
//with pretty ***************************

//@RunWith(Cucumber.class)
//@CucumberOptions(features= "src\\test\\java\\feature1", glue="stepdefinition1",
//monochrome = true,dryRun =false,strict = true,
//     tags = ("@SmokeTest1,~@SmokeTest2"),
//     plugin = {"html:Report" , "json:Report/cucumber.json",
//    		  "pretty","com.cucumber.listener.ExtentCucumberFormatter:Report/Adactin1.html"})

//with out pretty ***************************

@RunWith(Cucumber.class)
@CucumberOptions(features= "src\\test\\java\\feature1", glue="stepdefinition1",
monochrome = false,dryRun =false,strict = true,
     tags = ("@SmokeTest1,@SmokeTest2"),
     plugin = {"html:Report" , "json:Report/cucumber.json",
    		  "com.cucumber.listener.ExtentCucumberFormatter:Report/Adactin1.html"})

public class Runner1 {
	public static WebDriver driver;
	@BeforeClass
	 public static void setup() {
		 driver= BaseClass.launchBrowser("chrome");

	}
		@AfterClass
	public static void tearDown() {
	        BaseClass.closeBrowser();
	        //driver.close();
	
		}
}
