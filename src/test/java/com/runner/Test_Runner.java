package com.runner;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import com.BaseClass.BaseClass;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src\\test\\java\\com\\feature",glue = "com.stepdefinition",
  plugin = {"html:Report","com.cucumber.listener.ExtentCucumberFormatter:Report/Adactin.html"})

public class Test_Runner {
	public static WebDriver driver;
	
	@BeforeClass
 public static void setup() {
	 driver= BaseClass.launchBrowser("chrome");

}
	@AfterClass
public static void tearDown() {
        BaseClass.closeBrowser();
	}

}
