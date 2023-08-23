package com.DataStructureJava.com;

import java.util.Scanner;

public class ProblemSolving {

	public static void main(String[] args) {

		
//		Sum natural numbers
		
	/*	Scanner sc = new Scanner(System.in);
		System.out.println("enter a number :");
		int n = sc.nextInt(); //4 = 
		int num = 1;
		int sum = 0;
		while(num <= n){ //1+2+3+4 = 10
			sum = sum+num;
			num++;
		}
		System.out.println("sum of the number is :"+ sum);
	*/
		
		
		
//			Question :- count the number of digits for a given number...
		
/*		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number :");
		int n = sc.nextInt();
		int numOfDigit = 0;
		while(n>0){
			n = n/10;
			numOfDigit++;
		}
		System.out.println(numOfDigit);
*/
		
		
//		Question :- Find the sum of digit in a given number n...
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number :");
		int n = sc.nextInt();
		int sumOfDigit = 0;
		while(n>0){
			sumOfDigit += n%10;
			n = n/10;
			
		}
		System.out.println(sumOfDigit);
		
		
		
	}

}
