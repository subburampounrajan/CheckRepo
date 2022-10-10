package com.runner1;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MyInterviewQuestion {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\ELCOT\\SeleniumCourse\\SeleniumPractice\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.flipkart.com/");
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		WebElement element = driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']"));
		element.click();
		
		Actions act=new Actions(driver);
		WebElement ele = driver.findElement(By.xpath("(//div[@class='xtXmba'])[5]"));
		act.moveToElement(ele).build().perform();
		WebElement element2 = driver.findElement(By.xpath("//a[text()='Cameras & Accessories']"));
		act.moveToElement(element2).build().perform();
		WebElement element3 = driver.findElement(By.xpath("//a[text()='DSLR & Mirrorless']"));
		act.moveToElement(element3).build().perform();
		act.click(element3).build().perform();
        List<WebElement> findElements = driver.findElements(By.xpath("(//div[@class='_2kHMtA'])[1]//img"));
        int size = findElements.size();
        System.out.println(size);
		for(WebElement list1:findElements) {
			System.out.println(list1);
		}
			
		
		
	}

}
