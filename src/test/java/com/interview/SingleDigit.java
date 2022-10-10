package com.interview;

public class SingleDigit {
	public static void main(String[] args) {
		int n=459,r,sum=0;
		while(n>9) {
			sum=0;
			while(n>0) {
			r=n%10;
			sum=sum+r;
			n=n/10;
		}
		n=sum;
				}
		System.out.println(sum);
}
	
}