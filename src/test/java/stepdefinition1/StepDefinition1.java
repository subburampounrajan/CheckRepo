package stepdefinition1;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.BaseClass.BaseClass;
import com.PageObjectManger_SDP.Page_Object_Manager;
import com.properties.File_Reader_Manager;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefinition1 extends BaseClass {
	
	public static Page_Object_Manager pom=new Page_Object_Manager(driver);
	
	@Before
	public void beforeHooks(Scenario s) {
		String name = s.getName();
		System.out.println("Scenario Name :" +name);
	}
	
	@After
	public void afterHooks(Scenario s) throws IOException {
		String status = s.getStatus();
		System.out.println("Scenario Status :"+ status);
		if(s.isFailed()) {
			screenShot("C:\\Users\\ELCOT\\SeleniumCourse\\Maven_Project\\ScreenShots\\failedtestcase.png");
		}
	}
	@Given("^user Must Launch The Url$")
	public void user_Must_Launch_The_Url() throws Throwable {
		String url = File_Reader_Manager.getInstanceFRM().getInstanceCR().getUrl();
	    launchUrl(url);
	}
	
	@When("^user Enter The \"([^\"]*)\" In The Username Field$")
	public void user_Enter_The_In_The_Username_Field(String uname) throws Throwable {
		passtext(pom.getInstancelogin().getUname(),uname);
	}

	@When("^user Enter The \"([^\"]*)\" In The Password Field$")
	public void user_Enter_The_In_The_Password_Field(String pword) throws Throwable {
		passtext(pom.getInstancelogin().getPword(),pword);
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
	

}
