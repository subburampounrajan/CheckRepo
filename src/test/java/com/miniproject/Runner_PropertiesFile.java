package com.miniproject;
import java.io.IOException;
import org.openqa.selenium.WebDriver;
import com.BaseClass.BaseClass;
import com.PageObjectManger_SDP.Page_Object_Manager;
import com.properties.File_Reader_Manager;

public class Runner_PropertiesFile extends BaseClass {
    public static WebDriver driver= launchBrowser("chrome");
	public static Page_Object_Manager pom=new Page_Object_Manager(driver);
	public static void main(String[] args) throws IOException, Exception {
		
		implicitWait(30);
	    
		String url = File_Reader_Manager.getInstanceFRM().getInstanceCR().getUrl();
	    launchUrl(url);
	   
		
		String username = File_Reader_Manager.getInstanceFRM().getInstanceCR().getUsername();
		passtext(pom.getInstancelogin().getUname(),username);
		String password = File_Reader_Manager.getInstanceFRM().getInstanceCR().getPassword();
		passtext(pom.getInstancelogin().getPword(),password);
		click(pom.getInstancelogin().getLogin());
		
		
		selectBy(pom.getInstanceSearchHotelPage().getCon(),"value","Los Angeles");
		selectBy(pom.getInstanceSearchHotelPage().getRoomcount(),"value", "3");
		clear(pom.getInstanceSearchHotelPage().getDatein());
		String dateIn = File_Reader_Manager.getInstanceFRM().getInstanceCR().getDateIn();
		passtext(pom.getInstanceSearchHotelPage().getDatein(), dateIn);
		clear(pom.getInstanceSearchHotelPage().getDateout());
		String dateOut= File_Reader_Manager.getInstanceFRM().getInstanceCR().getDateOut();
		passtext(pom.getInstanceSearchHotelPage().getDateout(), dateOut);
		selectBy(pom.getInstanceSearchHotelPage().getNofA(), "visibletext","3 - Three");
		click(pom.getInstanceSearchHotelPage().getSearch());
		
		radioButtonClick(pom.getInstanceSelectHotelPage().getClickradio());
		click(pom.getInstanceSelectHotelPage().getCtnbtn());
		
		String fn= File_Reader_Manager.getInstanceFRM().getInstanceCR().getFirstName();
		passtext(pom.getInstancePaymentPage().getFn(), fn);
		String ln= File_Reader_Manager.getInstanceFRM().getInstanceCR().getLastName();
		passtext(pom.getInstancePaymentPage().getLn(), ln);
		String addr= File_Reader_Manager.getInstanceFRM().getInstanceCR().getAddress();
		passtext(pom.getInstancePaymentPage().getAddress(),addr);
		String ccn= File_Reader_Manager.getInstanceFRM().getInstanceCR().getCreditCardNo();
		passtext(pom.getInstancePaymentPage().getCardno(),ccn);
		selectByIndex(pom.getInstancePaymentPage().getCardtype(), 2);
		selectBy(pom.getInstancePaymentPage().getMon(), "visibletext", "December");
		selectBy(pom.getInstancePaymentPage().getYear(), "visibletext","2022");
		String cvv= File_Reader_Manager.getInstanceFRM().getInstanceCR().getCVV();
		passtext(pom.getInstancePaymentPage().getCcno(), cvv);
		click(pom.getInstancePaymentPage().getBtnclick());
		scrolldown(pom.getInstancePaymentPage().getElement());
		screenShot("C:\\Users\\ELCOT\\SeleniumCourse\\Maven_Project\\ScreenShots\\hotelbook4.png");
		click(pom.getInstancePaymentPage().getLogout());
		}
}
