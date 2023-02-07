package com.dl.five;

public class Child extends GrandParent {
	public void m3() {
		System.out.println("m3 method c");
	}
	public static void main(String[] args) {
	  Child child	= new Child();
	  child.m3();
	  child.m1();
	  
	  Parent parent = new Parent();
	  parent.m2();
	  parent.m1();
	  
	}
	

}
