package com.PageObjectModel;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
public class SearchHotelPage {
	public WebDriver driver;
	@FindBy(id="location")
	private WebElement con;
	@FindBy(id="room_nos")
	private WebElement roomcount;
	@FindBy(id="datepick_in")
	private WebElement datein;
	@FindBy(id="datepick_out")
	private WebElement dateout;
	@FindBy(id="adult_room")
	private WebElement nofA;
	@FindBy(id="Submit")
	private WebElement search;
	
	   public SearchHotelPage(WebDriver driver2) {
	   this.driver=driver2;
	   PageFactory.initElements(driver, this);
	}
	public WebElement getCon() {
		return con;
	}
	public WebElement getRoomcount() {
		return roomcount;
	}
	public WebElement getDatein() {
		return datein;
	}
	public WebElement getDateout() {
		return dateout;
	}
	public WebElement getNofA() {
		return nofA;
	}
	public WebElement getSearch() {
		return search;
	}
	
}
