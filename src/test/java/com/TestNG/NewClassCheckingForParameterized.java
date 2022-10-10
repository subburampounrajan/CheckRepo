package com.TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class NewClassCheckingForParameterized {
	
		@Test
	public void broswer() {
	System.setProperty("webdriver.chrome.driver",
			"C:\\Users\\ELCOT\\SeleniumCourse\\SeleniumPractice\\Drivers\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("http://adactinhotelapp.com/");
	driver.manage().window().maximize();
	WebElement uname = driver.findElement(By.id("username"));
	uname.sendKeys("subburam1234");
	WebElement pword = driver.findElement(By.id("password"));
	pword.sendKeys("@Sanjana1618");
	WebElement login = driver.findElement(By.id("login"));
	login.click();
	
	}
	
			}


