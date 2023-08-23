package com.DataStructureJava.com;

import java.util.Scanner;

public class IFElseSolution_2 {

	public static void main(String[] args) {
		
/*		Question :- Take input percentage of a student and print the grade according to marks:
			
			1) 90-100 Excellent
			2) 80-90 Very Good
			3) 70-80 Good
			4) 60-70 Can do better
			5) 50-60 Average
			6) 40-50 Below Average
			7) <40 Fail
			
*/
	
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter percentage : ");
		int n = sc.nextInt();
		if(n>90){
			System.out.println("Excellent...");
		}else if(n>80){
			System.out.println("Very Good");
		}else if(n>70){
			System.out.println("Good");
		}else if(n>60){
			System.out.println("Can do better");
		}else if(n>50){
			System.out.println("Average");
		}else if(n>40){
			System.out.println("Below Average");
		}else {
			System.out.println("Fail");
		}
		
	}

}
