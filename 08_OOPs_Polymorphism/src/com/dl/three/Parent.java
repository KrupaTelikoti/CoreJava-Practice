package com.dl.three;

//constructor overloading

public class Parent{
	public Parent() {
		System.out.println("Default cons");
		}
	public Parent(int i) {
		System.out.println(i);
		}
	public Parent(int i, int j) {
		System.out.println(i+ " "+j);
		}
	public Parent(int i, int j,int k) {
		System.out.println(i+ " "+j+" "+k);
		}
	public static void main(String[] args) {
		new Parent();
		new Parent(10);
		new Parent(10,20);
		new Parent(10,20,30);
	}
}

