package com.properties;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Configuration_Reader { 
	
	public static Properties p;
	public Configuration_Reader() throws IOException {
		
		File f=new File("C:\\Users\\ELCOT\\SeleniumCourse\\Maven_Project"
				+ "\\src\\main\\java\\com\\properties\\Adactin.properties");
		FileInputStream fis=new FileInputStream(f);
		p=new Properties();
		p.load(fis);
	}
	public String getUrl() throws IOException {
		String url = p.getProperty("url");
		return url;
	}
	public String getUsername() throws IOException{
	    String uname = p.getProperty("uname");
	    return uname;
    }
	public String getPassword() throws IOException{
		String pword = p.getProperty("pword");
		return pword;
	}
	
	public String getDateIn() throws IOException{
		String dateIn = p.getProperty("datein");
		return dateIn;
	}
	public String getDateOut() throws IOException{
		String dateOut = p.getProperty("dateout");
		return dateOut;
		
	}public String getFirstName() throws IOException{
		String fn = p.getProperty("firstname");
		return fn;
	}
	public String getLastName() throws IOException{
		String ln = p.getProperty("lastname");
		return ln;
	}
	public String getAddress() throws IOException{
		String addr = p.getProperty("address");
		return addr;
	}
	public String getCreditCardNo() throws IOException{
		String ccn = p.getProperty("creditcardno");
		return ccn;
	}
	public String getCVV() throws IOException{
		String cvv = p.getProperty("cvv");
		return cvv;
	}
	}
	
