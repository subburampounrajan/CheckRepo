package com.miniproject;

import java.io.IOException;

import org.openqa.selenium.WebDriver;

import com.BaseClass.BaseClass;
import com.PageObjectModel.Login_page;
import com.PageObjectModel.PaymentPage;
import com.PageObjectModel.SearchHotelPage;
import com.PageObjectModel.SelectHotelPage;

public class Runner_PageObjectModel extends BaseClass{

	public static void main(String[] args) throws IOException {
	    launchBrowser("firefox");
	    implicitWait(30);
		launchUrl("http://adactinhotelapp.com/");
		
		Login_page lp=new Login_page(driver);
		passtext(lp.getUname(),"subburam1234");
		//Login_page.getUname();
		passtext(lp.getPword(),"@Sanjana1618");
		click(lp.getLogin());
		
		SearchHotelPage sh=new SearchHotelPage(driver);
		selectBy(sh.getCon(),"value","Los Angeles");
		selectBy(sh.getRoomcount(),"value", "3");
		clear(sh.getDatein());
		passtext(sh.getDatein(), "16/09/2022");
		clear(sh.getDateout());
		passtext(sh.getDateout(), "25/09/2022");
		selectBy(sh.getNofA(), "visibletext","3 - Three");
		click(sh.getSearch());
		
		SelectHotelPage shp=new SelectHotelPage(driver);
		radioButtonClick(shp.getClickradio());
		click(shp.getCtnbtn());
		
		PaymentPage pp=new PaymentPage(driver);
		passtext(pp.getFn(), "subburam");
		passtext(pp.getLn(), "pounrajan");
		passtext(pp.getAddress(),"4/97,Ground floor, Rajarajan nagar, Moulivakkam, 600125");
		passtext(pp.getCardno(),"1234567891234567");
		selectByIndex(pp.getCardtype(), 2);
		selectBy(pp.getMon(), "visibletext", "December");
		selectBy(pp.getYear(), "visibletext","2022");
		passtext(pp.getCcno(), "123");
		click(pp.getBtnclick());
		scrolldown(pp.getElement());
		screenShot("C:\\Users\\ELCOT\\SeleniumCourse\\Maven_Project\\ScreenShots\\hotelbook2.png");
		click(pp.getLogout());
	
	}

}
