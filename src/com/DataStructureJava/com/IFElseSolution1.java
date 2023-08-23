package com.DataStructureJava.com;

import java.util.Scanner;

public class IFElseSolution1 {

	public static void main(String[] args) {
		
/*	Queation :-	given the length and breadth of a rectangle write a program to find whether
		the area of the rectangle is greater than its perimeter...
		
*/		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter length : ");
		int length = sc.nextInt();
		System.out.println("enter breadth : ");
		int breadth = sc.nextInt();
		
		int area = length*breadth;
		int perimeter  = 2*(length + breadth);
		
		if(area>perimeter){
			System.out.println("Area is greater than perimeter...");
		}else if(perimeter>area){
			System.out.println("Perimeter is greater than area...");
		}else{
			System.out.println("Area and parameter are equal...");
		}
	}

}
