package com.BaseClass;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BaseClass {
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
		
		//close-------> (3)
		public static void closeBrowser() {
	    driver.close();
		}
		
		//quit-------> (4)
		public static void terminateBrowser() {
		driver.quit();
		}
		
		//clear-------> (5) Additionl methods
		public static void clear(WebElement element) {
		element.clear();
		}
	
		//sendKeys-------> (6)
		public static void passtext(WebElement element, String input) {
		element.sendKeys(input);
		}
		
		//click-------> (7)
		public static void click(WebElement element) {
		element.click();
		}
		
		//navigate to-------> (8)
		public static void navigateTo(String url) {
		driver.navigate().to(url);
		}
		
		//navigate back-------> (9)
		public static void navigateBack() {
		driver.navigate().back();
		}
		
		//navigate Forward-------> (10)
		public static void navigateForward() {
		driver.navigate().forward();
		}
		
		//navigate Refresh-------> (11)
		public static void navigaterefresh() {
		driver.navigate().refresh();
		}
		
		//Alert-------> (12)
		
		public static void alert(String type){
			
		Alert alt = driver.switchTo().alert();
		
		if(type.equalsIgnoreCase("accept")) {
		alt.accept();
		}
		else if(type.equalsIgnoreCase("dismiss")) {
			alt.dismiss();
			}
		
		}
		public static void alertGetText() {        
			Alert alt = driver.switchTo().alert();
			String text = alt.getText();
			System.out.println(text);
		}
		public static void alertText(String text) {
			Alert alt = driver.switchTo().alert();
			alt.sendKeys(text);
			alt.accept();
			}
		
		//Actions All methods -------> (13)
		   //actionsClick
		    public static void actionsClick(WebElement element) {
			Actions act=new Actions(driver);
            act.click(element).build().perform();
	    	}
		  //actionsContextClick
		    public static void actionsContextClick(WebElement element) {
			Actions act=new Actions(driver);
	        act.contextClick(element).build().perform();
            }
		    
		  //actionsDoubleClick
		    public static void actionsDoubleClick(WebElement element) {
			Actions act=new Actions(driver);
	        act.doubleClick(element).build().perform();
            }
		    
		  //actionsMoveToElement
		    public static void actionsMoveToElement(WebElement element) {
			Actions act=new Actions(driver);
	        act.moveToElement(element).build().perform();
	        
            }
		  //actionsDragAndDrop
		    public static void actionsDragAndDrop(WebElement source,WebElement target) {
		    	Actions act=new Actions(driver);
		        act.dragAndDrop(source,target).build().perform();
		    	
		    }
		  //actionsdragAndDrop1
		    public static void actionsDragAndDrop1(WebElement source,WebElement target) {
		    	Actions act=new Actions(driver);
		        act.clickAndHold(source).moveToElement(target).release().build().perform();
            }
		    //actionsSendKeys
		    public static void actionsSendKeys(WebElement element,String text) {
		    	Actions act=new Actions(driver);
		        act.sendKeys(element,text).build().perform();    
            }
		    //actionskeyUp
		    public static void actionskeyUp(WebElement element) {  // need to work out
		    	Actions act=new Actions(driver);
		        act.keyUp(element,Keys.SHIFT).build().perform();
            }
		    //actionskeyDown
		        public static void actionskeyDown(WebElement element) {
		    	Actions act=new Actions(driver);
		        act.keyDown(element,Keys.SHIFT).build().perform();	
		        }
		              //Frames  -------> (14)
		        
		    //Frames identify by using (id,name ,xpath) 
		        public static void framesByLocators(String locator, WebElement element) {
		        	
		    	if(locator.equalsIgnoreCase("id")) {
		   		driver.switchTo().frame(element);
		        }
		    	else if (locator.equalsIgnoreCase("name")) {
		        driver.switchTo().frame(element);
		    	}
			    else if (locator.equalsIgnoreCase("xpath")) {
		    	driver.switchTo().frame(element);
				}}
		           	    		    
		   //Frames identify by using (Index)
		          public static void framesByIndex(int index) {
		    		  driver.switchTo().frame(index);
		    	  }
		    	  
		   //Frames identify by using (frameElement)                                            // need to practice
		    	  public static void framesByWebElement(WebElement frameElement){ 
		    		  driver.switchTo().frame(frameElement);
		    	  }
		    	  
		   //Frames defaultContent
		    	  public static void defaultContent(){ 
		    		  driver.switchTo().defaultContent();
		    	  }
		    	  
		    //Frames parentFrame
		    	  public static void parentFrame(){ 
		    		  driver.switchTo().parentFrame();
		    	  }

               //Robot class-------> (15)
           //RobotClass by virtualkeyBoard_PAGEDOWN
				  public static void robotDown() throws AWTException{ 
					  Robot robo=new Robot();
					  robo.keyPress(KeyEvent.VK_PAGE_DOWN);
					  robo.keyRelease(KeyEvent.VK_PAGE_DOWN);
				  }
					  
			 //RobotClass by virtualkeyBoard_PAGEDOWN
					  public static void robotUP() throws AWTException{ 
						  Robot robo=new Robot();
						  robo.keyPress(KeyEvent.VK_PAGE_UP);
						  robo.keyRelease(KeyEvent.VK_PAGE_UP); 
				  }
			 //RobotClass by virtualkeyBoard_ENTER
					  public static void robotEnter() throws AWTException{ 
						  Robot robo=new Robot();
						  robo.keyPress(KeyEvent.VK_ENTER);
						  robo.keyRelease(KeyEvent.VK_ENTER);
					  }

					    //windowHandles-------> (16)
              //windowHandleParentID
                     public static void windowHandleParentId() {
                     String pw = driver.getWindowHandle();
                     System.out.println("The parent window ID is :"+pw);
                     
                 }
            
              //getAllWindowsTitle   
                     public static void getAllWindowsTitle() {
                    	 Set<String> allwin = driver.getWindowHandles();                 		
                 		for (String  cp: allwin) {
                 			
                 			String title = driver.switchTo().window(cp).getTitle();
                 			System.out.println(title);
                 			
                 		}
                     }
                     
              //getSizeOfWindowHandle
                     public static void getSizeOFWindowHandles() {
                    	 int size = driver.getWindowHandles().size();
                    	 System.out.println(size);
                     }
                     
              //closeAllWindowExceptParentWindow                                 //need to check parent window also closing
                     public static void closeAllWindowExceptParentWindow() {
                    	 
                    	 String pw = driver.getWindowHandle();
                    	 
                    	 System.out.println("The parent window ID is :"+pw);
                    	 
                    	 Set<String> allwin = driver.getWindowHandles();
                    	
                         for (String cp : allwin) {
                    		String title = driver.switchTo().window(cp).getTitle();
                 			System.out.println(title);					
       			         	}
                    	 
                            for (String  cp: allwin) {
            		 	
             			    if(!cp.equals(pw)) {
             				
             				driver.switchTo().window(cp);
             				
             				driver.close();	
                       }
             			    }
                            }
                     // DROPDOWN-------> (17)
                     
                     //dropDownForSelectBY
                     //selectByIndex
                     public static void selectByIndex(WebElement element,int index){
                     Select sc1=new Select(element);
                     sc1.selectByIndex(index);
                     }
                     
                     //selectBy
                     //selectByValue
                     public static void selectBy(WebElement element,String type,String value){
                     Select sc1=new Select(element);
                     if(type.equalsIgnoreCase("value")) {
                     sc1.selectByValue(value);
                     }
                     else  if(type.equalsIgnoreCase("visibleText")) {
                         sc1.selectByVisibleText(value);
                     }
                     }
                     
                     //dropDownForDeSelectBY
                     //deselectByIndex
                     public static void deSelectByIndex(WebElement element,int index){
                     Select sc1=new Select(element);
                     sc1.deselectByIndex(index);
                     }
                     
                     //deselectBy
                     //deselectByValue
                     public static void deSelectBy(WebElement element,String type,String value){
                     Select sc1=new Select(element);
                     if(type.equalsIgnoreCase("value")) {
                     sc1.deselectByValue(value);
                     }
                     else  if(type.equalsIgnoreCase("visibleText")) {
                         sc1.deselectByVisibleText(value);
                     }
                     }
                  
                   //deselectAll
                     public static void deSelectAll(WebElement element){
                     Select sc1=new Select(element);
                     sc1.deselectAll();
                    
                     }
                     
                   //getSizeOfAlloptions
                     public static void getSize(WebElement element){
                     Select sc1=new Select(element);
                     int size = sc1.getOptions().size();
                     System.out.println("Total options are:"+size);
                     }

                   //checkbox-------> (18)
                     public static void checkBoxClick (WebElement element){          
                     element.click();
                       }

                    //  radioButton -------> (19)
                        public static void radioButtonClick (WebElement element){          
                        element.click();
                      }
                    
                    //isEnabled-------> (20)
                         public static void CheckisEnabled(WebElement element){   
                    	 boolean enabled = element.isEnabled();
                    	 System.out.println(enabled);
                         }
                   //isDisplayed -------> (21)
                         public static void CheckisDisplayed(WebElement element){   
                    	 boolean displayed = element.isDisplayed();
                    	 System.out.println(displayed);
                     }
                   //isSelected -------> (22)
                         public static void CheckisSelected(WebElement element){   
                         boolean selected = element.isSelected();
                    	 System.out.println(selected);
                        }
                    //getAllOptions  -------> (23)
                         public static void getAllOptions(WebElement element){
                             Select sc1=new Select(element);
                             List<WebElement> allOptions = sc1.getOptions();
                             for (WebElement it2 : allOptions) {
                            	 System.out.println(it2.getText());
        					 }
                             }
                    //windowHandleParentTitle -------> (24)
                         public static void windowHandleParentTitle() {
                         String pw = driver.getWindowHandle();
                         System.out.println("The parent window ID is :"+pw);
                         String parentWindowTitle = driver.switchTo().window(pw).getTitle();
                         System.out.println("The parent window Title is :"+parentWindowTitle);
                         }
                   //getcurrentURl -------> (25)
                         public static void getCurrentUrl(){
                        	 String currentUrl = driver.getCurrentUrl();
                        	 System.out.println("your current URL is: "+currentUrl);
                         }
                         
                   //getText   -------> (26)
                         public static void getText (WebElement element){          
                         element.getText();
                         }
                         
                   //getAttribute -------> (27)
                         public static void getAttribute(WebElement element, String value){
                         element.getAttribute(value);
					   }
                         
                    // Waits -------> (28)
                    //thread.Sleep (static wait)
                         public static void thread_Sleep(int milliSec) throws InterruptedException {
                        	 Thread.sleep(milliSec);
                         }
                         
                   // implicitWait (dynamic wait) (globalwait)
                         
                         public static void implicitWait(int sec) {
                        	 
                         driver.manage().timeouts().implicitlyWait(sec,TimeUnit.SECONDS);
                                                  
                         }
                         
                   // ExplicitWait (dynamic wait)(for particular action to be perform for that purpose)
                        public static void ExplicitWait(String value, int sec) {
                        	
                        WebDriverWait wait=new WebDriverWait(driver, 30);

                        WebElement until = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(value)));
                        
                        }
                        	
                    // ScreenShots-------> (29)
                        public static void screenShot(String path) throws IOException {
                        TakesScreenshot ss=(TakesScreenshot) driver;
                    	File source = ss.getScreenshotAs(OutputType.FILE);
                    	File des=new File(path);
                    	FileUtils.copyFile(source, des);
                        }
                    	
                    //scrolldown -------> (30)
                        
                    	public static void scrolldown(WebElement element){
                        JavascriptExecutor je=(JavascriptExecutor) driver;
                        je.executeScript("arguments[0].scrollIntoView()",element);
                    	}
                    //getFirstSelectedOptions  -------> (31)
                        public static void getFirstSelectedOption(WebElement element){
                        Select sc1=new Select(element);
                        String text = sc1.getFirstSelectedOption().getText();
                        System.out.println("your First selected option is :"+ text);
                        }
                        
                    //getAllSelectedOptions  -------> (32)
                        public static void getAllSelectedOption(WebElement element){
                            Select sc1=new Select(element);
                            List<WebElement> allSelectedOptions = sc1.getAllSelectedOptions();
                            for (WebElement it1 : allSelectedOptions) {
                           	 System.out.println(it1.getText());
       					 }
                            }
                     //dropDownIsMultiple -------> (33)
                        public static void isMultiple(WebElement element) {
                       	 Select sc1=new Select(element);
                            boolean multiple = sc1.isMultiple();
                            System.out.println(multiple);
                        }
                   
              }
                        	 

                  

                     
                     
                    



		    	  
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
