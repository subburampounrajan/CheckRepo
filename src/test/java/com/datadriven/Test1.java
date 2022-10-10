package com.datadriven;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Test1 {

	

			public static void main(String[] args) throws AWTException, InterruptedException {
				System.setProperty("webdriver.chrome.driver", 
						"C:\\Users\\ELCOT\\SeleniumCourse\\Maven_Project\\Drivers\\chromedriver.exe");
				WebDriver driver=new ChromeDriver();
				
				driver.get("https://www.amazon.in/");                                      //parent window
				driver.manage().window().maximize();
				
				WebElement bs = driver.findElement(By.xpath("//a[text()='Best Sellers']")); //child window 1
				Actions act =new Actions(driver);
				act.contextClick(bs).build().perform();
				
				Robot robo=new Robot();
				robo.keyPress(KeyEvent.VK_PAGE_DOWN);
				robo.keyRelease(KeyEvent.VK_PAGE_DOWN);
				
				robo.keyPress(KeyEvent.VK_ENTER);
				robo.keyRelease(KeyEvent.VK_ENTER);
				
				Thread.sleep(4000);
				WebElement td = driver.findElement(By.xpath("//a[contains(text(),'Today')]"));//child window 2
				act.contextClick(td).build().perform();
				
				robo.keyPress(KeyEvent.VK_PAGE_DOWN);
				robo.keyRelease(KeyEvent.VK_PAGE_DOWN);
				
				robo.keyPress(KeyEvent.VK_ENTER);
				robo.keyRelease(KeyEvent.VK_ENTER);
				
				Thread.sleep(4000);
				WebElement mob = driver.findElement(By.xpath("//a[text()='Mobiles']"));//child window 3
				act.contextClick(mob).build().perform();
				
				robo.keyPress(KeyEvent.VK_PAGE_DOWN);
				robo.keyRelease(KeyEvent.VK_PAGE_DOWN);
				
				robo.keyPress(KeyEvent.VK_ENTER);
				robo.keyRelease(KeyEvent.VK_ENTER);
				
				Thread.sleep(4000);
				WebElement cs = driver.findElement(By.xpath("//a[text()='Customer Service']"));//child window 4
				act.contextClick(cs).build().perform();
				
				robo.keyPress(KeyEvent.VK_PAGE_DOWN);
				robo.keyRelease(KeyEvent.VK_PAGE_DOWN);
				
				robo.keyPress(KeyEvent.VK_ENTER);
				robo.keyRelease(KeyEvent.VK_ENTER);
				
				Thread.sleep(4000);
				WebElement books = driver.findElement(By.xpath("//a[text()='Books']"));//child window 5
				act.contextClick(books).build().perform();
				
				robo.keyPress(KeyEvent.VK_PAGE_DOWN);
				robo.keyRelease(KeyEvent.VK_PAGE_DOWN);
				
				robo.keyPress(KeyEvent.VK_ENTER);
				robo.keyRelease(KeyEvent.VK_ENTER);
				
				System.out.println("------------------------------------------------------------------");
				
				int size = driver.getWindowHandles().size();
				System.out.println("total number of window is: " +size);
				
				String pw = driver.getWindowHandle();
				System.out.println("The parent window ID is :"+pw);
				
				System.out.println("------------------------------------------------------------------");
				
				Set<String> allwin = driver.getWindowHandles();
				
				//for each loop and return type of window handle is set since in window id no duplicate
				
				for (String  cp: allwin) {
					
					String title = driver.switchTo().window(cp).getTitle();
					System.out.println(title);
					
				}
				System.out.println("------------------------------------------------------------------");
				
				for (String  cp: allwin) {
					
					if(!cp.equals(pw)) {
						
						driver.switchTo().window(cp);
						
						driver.close();	
				
			              }
//		               }
				System.out.println("------------------------------------------------------------------");
				
//				String atd="Amazon.in - Today's Deals";
//				
//		       for (String  cp: allwin) {
//					
//					if(driver.switchTo().window(cp).getTitle().equals(atd)) {
//						break;
//					}
		       }
		       
			}
		
	}


