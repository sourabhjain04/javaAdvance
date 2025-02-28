package com.first;

class MathOperations{
	
	
	int add(int a, int b) {
		return a+b;
	}
	
	int add(int c , int d, int e) {
		return c+d+e;
	}
	
	double add(int f, double g) {
		return f+g;
	}
}


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MathOperations obj = new MathOperations();
		System.out.println("Sun of two integers " + obj.add(8, 8.2));
	}

}
