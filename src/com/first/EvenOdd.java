package com.first;

import java.util.Scanner;

public class EvenOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter the number");
		int num = scan.nextInt();
		findEvenOdd(num);
		
	}

	// user define 
	private static void findEvenOdd(int num) {
		// TODO Auto-generated method stub
		if(num%2==0) {
			System.out.println(num+"is even");
		}
		else {
			System.out.println(num+"is odd");
		}
	}

}
