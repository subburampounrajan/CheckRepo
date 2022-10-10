package com.TestNG;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class Ignore_Concept {
	@Test
	public void mango() {
		System.out.println("Mango");
			}
	@Test
	public void apple() {
		System.out.println("Apple");
			}
	@Ignore
	@Test
	public void strawberry() {
		System.out.println("Strawberry");
			}
	@Test
	public void carrot() {
		System.out.println("Carrot");
			}
	
	@Test(enabled = false)
	public void beans() {
		System.out.println("Beans");
			}
	@Test
	public void cat() {
		System.out.println("Cat");
			}
	@Test
	public void dog() {
		System.out.println("Dog");
			}
		
	}


