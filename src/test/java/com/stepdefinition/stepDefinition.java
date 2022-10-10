package com.stepdefinition;

import com.BaseClass.BaseClass;
import com.PageObjectManger_SDP.Page_Object_Manager;
import com.properties.File_Reader_Manager;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class stepDefinition extends BaseClass {
	
	public static Page_Object_Manager pom=new Page_Object_Manager(driver);
	
@Given("^user Must Launch The Url$")
public void user_Must_Launch_The_Url() throws Throwable {
		implicitWait(30);
		String url = File_Reader_Manager.getInstanceFRM().getInstanceCR().getUrl();
	    launchUrl(url);
	    
	}

@When("^user Enter The Username In The Username Field$")
public void user_Enter_The_Username_In_The_Username_Field() throws Throwable {
		String username = File_Reader_Manager.getInstanceFRM().getInstanceCR().getUsername();
		passtext(pom.getInstancelogin().getUname(),username);
	}

@When("^user Enter The Password In The Password Field$")
public void user_Enter_The_Password_In_The_Password_Field() throws Throwable {
		String password = File_Reader_Manager.getInstanceFRM().getInstanceCR().getPassword();
		passtext(pom.getInstancelogin().getPword(),password);
	   
	}

@Then("^user Click The Login Button And It Navigates To The Search Hotel Page$")
public void user_Click_The_Login_Button_And_It_Navigates_To_The_Search_Hotel_Page() throws Throwable {
	    click(pom.getInstancelogin().getLogin());
	   
	}

@When("^user Select The Location In Select Location Option$")
public void user_Select_The_Location_In_Select_Location_Option() throws Throwable {
	selectBy(pom.getInstanceSearchHotelPage().getCon(),"value","Los Angeles");
}

@When("^user Select Number Of Rooms From Number Of Rooms Option$")
public void user_Select_Number_Of_Rooms_From_Number_Of_Rooms_Option() throws Throwable {
	selectBy(pom.getInstanceSearchHotelPage().getRoomcount(),"value", "3");
}

@When("^user Clear the Defult Date from Check In Date Field$")
public void user_Clear_the_Defult_Date_from_Check_In_Date_Field() throws Throwable {
	clear(pom.getInstanceSearchHotelPage().getDatein());
}

@When("^user Enter the Date Of CheckIn  In Check In Date Field$")
public void user_Enter_the_Date_Of_CheckIn_In_Check_In_Date_Field() throws Throwable {
	String dateIn = File_Reader_Manager.getInstanceFRM().getInstanceCR().getDateIn();
	passtext(pom.getInstanceSearchHotelPage().getDatein(), dateIn);
  }

@When("^user Clear the Defult Date from Check Out Date Field$")
public void user_Clear_the_Defult_Date_from_Check_Out_Date_Field() throws Throwable {
	clear(pom.getInstanceSearchHotelPage().getDateout());
  }

@When("^user Enter the Date Of CheckOut  In Check Out Date Field$")
public void user_Enter_the_Date_Of_CheckOut_In_Check_Out_Date_Field() throws Throwable {
	String dateOut= File_Reader_Manager.getInstanceFRM().getInstanceCR().getDateOut();
	passtext(pom.getInstanceSearchHotelPage().getDateout(), dateOut);
}

@When("^user Select Adult Per Room From Adult Per Room Option$")
public void user_Select_Adult_Per_Room_From_Adult_Per_Room_Option() throws Throwable {
	selectBy(pom.getInstanceSearchHotelPage().getNofA(), "visibletext","3 - Three");
}

@Then("^user Click The Search Button And It Navigates To Select Hotel Page$")
public void user_Click_The_Search_Button_And_It_Navigates_To_Select_Hotel_Page() throws Throwable {
	click(pom.getInstanceSearchHotelPage().getSearch());
    
}

@When("^user Select The Hotel And Click the Radio Button In Select Hotel Page$")
public void user_Select_The_Hotel_And_Click_the_Radio_Button_In_Select_Hotel_Page() throws Throwable {
	radioButtonClick(pom.getInstanceSelectHotelPage().getClickradio());
}

@Then("^user Click The Continue Button And It Navigates To Book A Hotel Page$")
public void user_Click_The_Continue_Button_And_It_Navigates_To_Book_A_Hotel_Page() throws Throwable {
	click(pom.getInstanceSelectHotelPage().getCtnbtn());
  }

@When("^user Enter The Firstname In The Firstname Field$")
public void user_Enter_The_Firstname_In_The_Firstname_Field() throws Throwable {
	String fn= File_Reader_Manager.getInstanceFRM().getInstanceCR().getFirstName();
	passtext(pom.getInstancePaymentPage().getFn(), fn);
    }

@When("^user Enter The Lastname In The Lastname Field$")
public void user_Enter_The_Lastname_In_The_Lastname_Field() throws Throwable {
	String ln= File_Reader_Manager.getInstanceFRM().getInstanceCR().getLastName();
	passtext(pom.getInstancePaymentPage().getLn(), ln);    
}

@When("^user Enter The BillingAddress In The BillingAddress Field$")
public void user_Enter_The_BillingAddress_In_The_BillingAddress_Field() throws Throwable {
	String addr= File_Reader_Manager.getInstanceFRM().getInstanceCR().getAddress();
	passtext(pom.getInstancePaymentPage().getAddress(),addr);
    }

@When("^user Enter The Credit Card No In The Credit Card No  Field$")
public void user_Enter_The_Credit_Card_No_In_The_Credit_Card_No_Field() throws Throwable {
	String ccn= File_Reader_Manager.getInstanceFRM().getInstanceCR().getCreditCardNo();
	passtext(pom.getInstancePaymentPage().getCardno(),ccn);
    }

@When("^user Select The Credit Card type From The Credit Card Type Option$")
public void user_Select_The_Credit_Card_type_From_The_Credit_Card_Type_Option() throws Throwable {
	selectByIndex(pom.getInstancePaymentPage().getCardtype(), 2);
   }

@When("^user Select The Expire Month From  Expire Month Option$")
public void user_Select_The_Expire_Month_From_Expire_Month_Option() throws Throwable {
	selectBy(pom.getInstancePaymentPage().getMon(), "visibletext", "December");
    }

@When("^user Select The Expire Year From  Expire Year Option$")
public void user_Select_The_Expire_Year_From_Expire_Year_Option() throws Throwable {
	selectBy(pom.getInstancePaymentPage().getYear(), "visibletext","2022");
 }

@When("^user Enter The CVV Number In The CVV Number Field$")
public void user_Enter_The_CVV_Number_In_The_CVV_Number_Field() throws Throwable {
	String cvv= File_Reader_Manager.getInstanceFRM().getInstanceCR().getCVV();
	passtext(pom.getInstancePaymentPage().getCcno(), cvv);
   }

@Then("^user Click Book Now Button It Navigates To Booking Confirmation Page$")
public void user_Click_Book_Now_Button_It_Navigates_To_Booking_Confirmation_Page() throws Throwable {
	click(pom.getInstancePaymentPage().getBtnclick());    
}

@When("^user Take A Snap Shot Of order Confirm Page With My Itinery As Reference Field$")
public void user_Take_A_Snap_Shot_Of_order_Confirm_Page_With_My_Itinery_As_Reference_Field() throws Throwable {
	implicitWait(30);
	scrolldown(pom.getInstancePaymentPage().getElement());
	screenShot("C:\\Users\\ELCOT\\SeleniumCourse\\Maven_Project\\ScreenShots\\hotelbookByCCM.png");
  }

@Then("^User Click Logout Button$")
public void user_Click_Logout_Button() throws Throwable {
	click(pom.getInstancePaymentPage().getLogout());
   }

}
