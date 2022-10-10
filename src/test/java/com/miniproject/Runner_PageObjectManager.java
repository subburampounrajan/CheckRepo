package com.miniproject;

import java.io.IOException;

import org.openqa.selenium.WebDriver;

import com.BaseClass.BaseClass;

import com.PageObjectManger_SDP.Page_Object_Manager;

public class Runner_PageObjectManager extends BaseClass {
	
	public static WebDriver driver= launchBrowser("chrome");
	
	public static Page_Object_Manager pom=new Page_Object_Manager(driver);
	
	public static void main(String[] args) throws IOException {
		
		implicitWait(30);
		launchUrl("http://adactinhotelapp.com/");
		
		passtext(pom.getInstancelogin().getUname(),"subburam1234");
		passtext(pom.getInstancelogin().getPword(),"@Sanjana1618");
		click(pom.getInstancelogin().getLogin());
		
		selectBy(pom.getInstanceSearchHotelPage().getCon(),"value","Los Angeles");
		selectBy(pom.getInstanceSearchHotelPage().getRoomcount(),"value", "3");
		clear(pom.getInstanceSearchHotelPage().getDatein());
		passtext(pom.getInstanceSearchHotelPage().getDatein(), "16/09/2022");
		clear(pom.getInstanceSearchHotelPage().getDateout());
		passtext(pom.getInstanceSearchHotelPage().getDateout(), "25/09/2022");
		selectBy(pom.getInstanceSearchHotelPage().getNofA(), "visibletext","3 - Three");
		click(pom.getInstanceSearchHotelPage().getSearch());
		
		radioButtonClick(pom.getInstanceSelectHotelPage().getClickradio());
		click(pom.getInstanceSelectHotelPage().getCtnbtn());
		
		passtext(pom.getInstancePaymentPage().getFn(), "subburam");
		passtext(pom.getInstancePaymentPage().getLn(), "pounrajan");
		passtext(pom.getInstancePaymentPage().getAddress(),"4/97,Ground floor, Rajarajan nagar, Moulivakkam, 600125");
		passtext(pom.getInstancePaymentPage().getCardno(),"1234567891234567");
		selectByIndex(pom.getInstancePaymentPage().getCardtype(), 2);
		selectBy(pom.getInstancePaymentPage().getMon(), "visibletext", "December");
		selectBy(pom.getInstancePaymentPage().getYear(), "visibletext","2022");
		passtext(pom.getInstancePaymentPage().getCcno(), "123");
		click(pom.getInstancePaymentPage().getBtnclick());
		scrolldown(pom.getInstancePaymentPage().getElement());
		screenShot("C:\\Users\\ELCOT\\SeleniumCourse\\Maven_Project\\ScreenShots\\hotelbook3.png");
		click(pom.getInstancePaymentPage().getLogout());	
	
	}

}
