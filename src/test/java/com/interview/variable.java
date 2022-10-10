package com.interview;

public class variable {

	int a =1;
	static int b =2;
	
    public variable() {
    a++;
    b++;
    //System.out.println(a);
	}
    public void methodcheck() {
    System.out.println(a);
    //System.out.println(b);
	}
	public static void main(String[] args) {
		variable obj1=new variable();
		obj1.methodcheck();
		variable obj2=new variable();
		obj2.methodcheck();
		variable obj3=new variable();
		obj3.methodcheck();
		variable obj4=new variable();
		obj4.methodcheck();
		System.out.println(obj1.a);
		obj1.methodcheck();
		System.out.println(b);

		
	}

}
