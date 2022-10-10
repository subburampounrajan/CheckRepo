package com.datadriven;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class StaticMethodsTest {
	public static WebDriver driver;
	 //launchBrowser -------> (1)
	public static WebDriver launchBrowser(String browsername) {
	if(browsername.equalsIgnoreCase("chrome")) {
		System.setProperty("webdriver.chrome.driver", 
				System.getProperty("user.dir")+"\\Drivers\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		
	}
	else if(browsername.equalsIgnoreCase("firefox")) {
		System.setProperty("webdriver.gecko.driver", 
				System.getProperty("user.dir")+"\\Drivers\\geckodriver.exe");
					driver=new FirefoxDriver();
		driver.manage().window().maximize();
	}
	return driver;
 	}
	
	//get -------> (2)
	public static void launchUrl(String url) {
    driver.get(url);
	}       
	}


