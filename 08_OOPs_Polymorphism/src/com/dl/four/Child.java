package com.dl.four;

public class Child extends Parent {
	public void m1() {
		System.out.println("m1 method Child");
	}
	public static void main(String[] args) {
		Child child = new Child();
		child.m1();
		Parent parent = new Parent();
		parent.m1();
		
		// method overriding
		
		Parent p = new Child();
		p.m1();
		}

}
