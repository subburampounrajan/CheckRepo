package com.interview;

import java.util.Iterator;

import org.testng.xml.LaunchSuite.ExistingSuite;

public class InterviewExm {

	public static void main(String[] args) {
		char c;
        char d;
		String a = "abc";
        String b = "xyz";
        
           for(int i=0;i <= a.length()-1; i++) {
        	
        	for(int j=0;j <= b.charAt(i)-1; j++) {
        		
        		if(i==j) {
        			c= a.charAt(i);
        			d= b.charAt(j);
        		 	
        			System.out.println("output:"+a.charAt(i)+b.charAt(j));
            		break;
        					}	
        		
        }
        	}
           
           
        }} 
		
        	        	
    	
       	
      