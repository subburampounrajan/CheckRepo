package com.PageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SelectHotelPage {
	
	public WebDriver driver;
	@FindBy(id="radiobutton_4")
	private WebElement clickradio;
	
	@FindBy(id="continue")
	private WebElement ctnbtn;
	
	public SelectHotelPage(WebDriver driver2) {
	this.driver=driver2;
	PageFactory.initElements(driver, this);
	}

	public WebElement getClickradio() {
		return clickradio;
	}

	public WebElement getCtnbtn() {
		return ctnbtn;
	}
	
	

}
