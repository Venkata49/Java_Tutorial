package com.DataStructureJava.com;

import java.util.Scanner;

public class NumberSystem_Binary {

	public static void main(String[] args) {
		
		
//		Convert binary number to decimal number....
		
	/*	Scanner sc = new Scanner(System.in);
		System.out.println("enter a number :");//1000
		int binary_num = sc.nextInt();
		int ans = 0;
		int pw =1;//2^0=1 power of 2
		
		while(binary_num > 0){
			int unit_digit = binary_num % 10;
			ans += (unit_digit * pw);
			binary_num /= 10;
			pw *=2;
		}
		System.out.println(ans);//output :- 8
	*/	
		
		
//		Decimal number to binary number....
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number :");
		int decimal_num = sc.nextInt();
		int ans = 0;
		int pw =1;
		while(decimal_num > 0){
			int parity = decimal_num % 2; 
			ans += (parity * pw);
			pw *= 10;
			decimal_num /= 2; 
		}
		
		System.out.println(ans);
		
		
	}

}
