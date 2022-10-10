package com.TestNG;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;
public class GroupingConcept {

	@Test(groups = "Fruits")
	public void mango() {
		System.out.println("Mango");
			}
	@Test(groups = "Fruits")
	public void apple() {
		System.out.println("Apple");
			}
	@Test(groups = "Fruits")
	public void strawberry() {
		System.out.println("Strawberry");
			}
	@Test(groups = "Vegetables")
	public void carrot() {
		System.out.println("Carrot");
			}
	
	@Test(groups = "Vegetables")
	public void beans() {
		System.out.println("Beans");
			}
	@Test(groups = "Animals")
	public void cat() {
		System.out.println("Cat");
			}
	@Test(groups = "Animals")
	public void dog() {
		System.out.println("Dog");
			}
		
	}





