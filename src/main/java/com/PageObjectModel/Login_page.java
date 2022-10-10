package com.PageObjectModel;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
public class Login_page {
	
  public static WebDriver driver;
  
	@FindBy(id="username")
	private WebElement uname;
	
	@FindBy(id="password")
	private WebElement pword;
	
	@FindBy(id="login")
	private WebElement login;
	
	public Login_page(WebDriver driver2) {
	this.driver= driver2;
	PageFactory.initElements(driver, this);	
	}

	public WebElement getUname() {
		return uname;
	}
	public WebElement getPword() {
		return pword;
	}
	public WebElement getLogin() {
		return login;
	}	
}
