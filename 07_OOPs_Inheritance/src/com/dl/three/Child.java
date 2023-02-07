package com.dl.three;

public class Child extends Parent {
	 public void m3() {
			System.out.println("m3 method Child");
		}
	 
	 public static void main(String[] args) {
		
		 new Child().m1();
		 new Child().m2();
		 new Child().m3();
	}


}
