package com.PageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PaymentPage {

	public WebDriver driver;
	
	@FindBy(id="first_name")
	private WebElement fn;
	@FindBy(id="last_name")
	private WebElement ln;
	@FindBy(id="address")
	private WebElement address;
	@FindBy(id="cc_num")
	private WebElement cardno;
	@FindBy(id="cc_type")
	private WebElement cardtype;
	@FindBy(id="cc_exp_month")
	private WebElement mon;
	@FindBy(id="cc_exp_year")
	private WebElement year;
	@FindBy(id="cc_cvv")
	private WebElement ccno;
	@FindBy(id="book_now")
	private WebElement btnclick;
	@FindBy(id="my_itinerary")
	private WebElement element;
	@FindBy(id="logout")
	private WebElement logout;
	
	
	public PaymentPage(WebDriver driver2) {
		this.driver=driver2;
		PageFactory.initElements(driver, this);
	}
	public WebElement getFn() {
		return fn;
	}
	public WebElement getLn() {
		return ln;
	}
	public WebElement getAddress() {
		return address;
	}
	public WebElement getCardno() {
		return cardno;
	}
	public WebElement getCardtype() {
		return cardtype;
	}
	public WebElement getMon() {
		return mon;
	}
	public WebElement getYear() {
		return year;
	}
	public WebElement getCcno() {
		return ccno;
	}
	public WebElement getBtnclick() {
		return btnclick;
	}
	public WebElement getElement() {
		return element;
	}
	public WebElement getLogout() {
		return logout;
	}
}
