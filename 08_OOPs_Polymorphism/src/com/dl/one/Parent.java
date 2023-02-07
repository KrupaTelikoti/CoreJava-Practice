package com.dl.one;

public class Parent {
	
	// method overloading : one class; 
   //method name is same but args should be diff
	
	public void petrolPrice(int pPrice) {
		System.out.println(pPrice);
	}
	
	public void petrolPrice(float pPrice) {
		System.out.println(pPrice);
		
	}
		
	public void petrolPrice(double pPrice) {
		System.out.println(pPrice);
		
	}
	
	public static void main(String[] args) {
		Parent parent = new Parent();
		parent.petrolPrice(100);
		parent.petrolPrice(100f);
		parent.petrolPrice(100d);
		
		
		
	}

}
