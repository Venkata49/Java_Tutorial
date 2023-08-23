package com.DataStructureJava.com;

import java.util.Scanner;

public class ProblemSolution_1 {

	public static void main(String[] args) {
		
		
//		Reverse the digit of a number...
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a value :");
		int n = sc.nextInt();
		int ans = 0;
		while(n>0){
			ans = ans*10+n%10;
			n /= 10;
		}
		System.out.println("reverse answer is : "+ ans);

		
	
//		Question :- Find the sum of the following series .... S = 1-2+3-4...n;
		
/*		Scanner sc = new Scanner(System.in);
		System.out.println("enter a value :");
		int n = sc.nextInt();
		int ans = 0;
		for(int i=1;i<=n;i++){
			if(i%2 == 0){
				ans -= i;
			}else{
				ans += i;
			}
		}
		System.out.println(ans);
*/
		
		
//		Question :- factiorial of given integer...
		
	/*	Scanner sc = new Scanner(System.in);
		System.out.println("enter a value :");
		int n = sc.nextInt();
		int fact = 1;
		for(int i = 1; i<=5;i++){
			fact = fact*i;
		}
		System.out.println(fact);
	*/
	
		
		
//		Question :- Given 2 numbers a and b .Find a raise to the power b..... ex :- 2 power of 5 = 32
		
	/*	Scanner sc = new Scanner(System.in);
		System.out.println("enter a value :");
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		int ans =1;
		for(int i=1;i<=b;i++){
			ans *= a;
		
		}
		System.out.println(ans);
		
	*/	
		
	}

}
