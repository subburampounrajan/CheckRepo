package com.miniproject;

import java.io.IOException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.BaseClass.BaseClass;

public class Adactin extends BaseClass {

	public static void main(String[] args) throws IOException {
		
    launchBrowser("chrome");
    implicitWait(30);
    launchUrl("http://adactinhotelapp.com/");
    
    WebElement uname = driver.findElement(By.id("username"));
    passtext(uname,"subburam1234");
    WebElement pword = driver.findElement(By.id("password"));
    passtext(pword,"@Sanjana1618");
    WebElement login = driver.findElement(By.id("login"));
    click(login);
    
    
    WebElement con = driver.findElement(By.id("location"));
    selectBy(con, "value", "Los Angeles");
    WebElement roomcount = driver.findElement(By.id("room_nos"));
    selectBy(roomcount,"value", "3");
    WebElement datein = driver.findElement(By.id("datepick_in"));
    clear(datein);
    passtext(datein, "15/09/2022");
    WebElement dateout = driver.findElement(By.id("datepick_out"));
    clear(dateout);
    passtext(dateout, "25/09/2022");
    WebElement nofA = driver.findElement(By.id("adult_room"));
	selectBy(nofA, "visibletext","3 - Three");	
	WebElement search = driver.findElement(By.id("Submit"));
	click(search);
	
	WebElement clickradio = driver.findElement(By.id("radiobutton_4"));
	radioButtonClick(clickradio);
	WebElement ctnbtn = driver.findElement(By.id("continue"));
	click(ctnbtn);
	
	WebElement fn = driver.findElement(By.id("first_name"));
	passtext(fn, "subburam");
	WebElement ln = driver.findElement(By.id("last_name"));
	passtext(ln, "pounrajan");
	WebElement address = driver.findElement(By.id("address"));
	passtext(address,"4/97,Ground floor, Rajarajan nagar, Moulivakkam, 600125");
	WebElement cardno = driver.findElement(By.id("cc_num"));
	passtext(cardno,"1234567891234567");
	WebElement cardtype = driver.findElement(By.id("cc_type"));
	selectByIndex(cardtype, 2);
	WebElement mon = driver.findElement(By.id("cc_exp_month"));
	selectBy(mon, "visibletext", "December");
	WebElement year = driver.findElement(By.id("cc_exp_year"));
	selectBy(year, "visibletext","2022");
	WebElement ccno = driver.findElement(By.id("cc_cvv"));
	passtext(ccno, "123");
	WebElement btnclick = driver.findElement(By.id("book_now"));
	click(btnclick);
	WebElement element = driver.findElement(By.id("my_itinerary"));
	scrolldown(element);
	screenShot("C:\\Users\\ELCOT\\SeleniumCourse\\Maven_Project\\ScreenShots\\hotelbook.png");
	WebElement logout = driver.findElement(By.id("logout"));
	click(logout);
	}
}
