package com.properties;

import java.io.IOException;

public class File_Reader_Manager {
	
	    //private contructor
	private File_Reader_Manager() {
		//private contructor
		//in order to prevent object cereation 
		//for File_Reader_Manager in another class
	}
	
	//static method
	public static File_Reader_Manager getInstanceFRM() {
		File_Reader_Manager frm=new File_Reader_Manager();
		return frm;
	}
	//non static method
	public Configuration_Reader getInstanceCR() throws Exception {
		Configuration_Reader cr=new Configuration_Reader();
      return cr;
	}
	

}
