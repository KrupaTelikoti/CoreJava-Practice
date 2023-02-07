package com.dl.two;

public class Child extends Parent {
	
	public void m3() {
		System.out.println("m3 method");
	}
	public void m4() {
		System.out.println("m4 method");
	}
	
	public static void main(String[] args) {
		
		Child child = new Child(); 
		child.m1();
		child.m2();
		child.m3();
		child.m4();
		
		
	}

}