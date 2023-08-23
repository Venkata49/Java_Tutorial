package com.DataStructureJava.com;

import java.util.Scanner;

public class IFElseDemo {

	public static void main(String[] args) {
		
		/*Scanner sc = new Scanner(System.in);
		System.out.println("enter cost price : ");
		int cp = sc.nextInt();
		System.out.println("enter selling price : ");
		int sp = sc.nextInt();
		
		if(sp>cp){	//profit condition
			System.out.println("you made a profit...");
			int profit = sp-cp;
			System.out.println(profit);
		}
		else{	//loss condition
			System.out.println("you incurred a loss...");
			int loss = cp-sp;
			System.out.println(loss);
		}
		*/
		
		
//		Question :- Take positive integer input and tell if it is a three digit number or not... Using && and || Operators
		
		/*Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number : ");
		int n = sc.nextInt();
		if(n>99 && n<100){
			System.out.println("This is the three digit number...");
		}else{
			System.out.println("It is not three digit number...");
		}
		*/
		
//		Question :- take positive integer input and tell if it is divisible by 5 and 3...
		
		/*Scanner sc = new Scanner(System.in);
		System.out.println("enter a number : ");
		int n = sc.nextInt();
		if(n%5==0 && n%3==0){
			System.out.println("yes it is divisible...");
		}else{
			System.out.println("no ");
		}*/
		
		
//		Question :- take positive integer input and tell if it is divisible by 5 Or 3...
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number : ");
		int n = sc.nextInt();
		if(n%5==0 || n%3==0){
			System.out.println("yes it is divisible...");
		}else{
			System.out.println("no ");
		}
	
		
		
	}

}
