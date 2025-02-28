package com.first;

public class MyClass {

	int myField;
	public MyClass(int value) {
		myField = value;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MyClass obj = new MyClass(10);
		System.out.println("value of myfield:"+ obj.myField);
	}

}
