package com.PageObjectManger_SDP;

import org.openqa.selenium.WebDriver;

import com.PageObjectModel.Login_page;
import com.PageObjectModel.PaymentPage;
import com.PageObjectModel.SearchHotelPage;
import com.PageObjectModel.SelectHotelPage;

public class Page_Object_Manager {

	  public WebDriver driver;
	
	 public Page_Object_Manager(WebDriver driver2) {
		 this.driver=driver2;
	}
	// private //classname of the page of the model //object refernce name ;
	private Login_page lp;
	public Login_page getInstancelogin() {
		 if(lp==null) {
			 lp=new Login_page(driver);
		 }
		 return lp;
	     }
	 
	 private SearchHotelPage sh;
	 public SearchHotelPage getInstanceSearchHotelPage() {
		 if(sh==null) {
			 sh=new SearchHotelPage(driver);
		 }
		 return sh;
		 }
	 
	 private SelectHotelPage shp;
	 public SelectHotelPage getInstanceSelectHotelPage() {
		 if(shp==null) {
			 shp=new SelectHotelPage(driver);
		 }
		 return shp;
    	 }
	 private PaymentPage pp;
	 public PaymentPage getInstancePaymentPage() {
		 if(pp==null) {
			 pp=new PaymentPage(driver);
		 }
		 return pp;
		 
	 }
}
