package com.DataStructureJava.com;

import java.util.Scanner;

public class PatternsSolutions {

	public static void main(String[] args) {

/*		Qustion :- ******		2 rows, 6 columns....2*6
				   ******
				   ******
		*/
		
/*		Scanner sc = new Scanner(System.in);
		int r = sc.nextInt();
		int c = sc.nextInt();
		
		for(int i=1;i<=r;i++){
			for(int j=1;j<=c;j++){
				System.out.print("*");
			}
			System.out.println();
			
		}
*/
		
		
	/*	Question :- *****     4 rows, 5 columns ...3*5
					*   *
					*   *
					*****
 */
		
/*		
		Scanner sc = new Scanner(System.in);
		int r = sc.nextInt();
		int c = sc.nextInt();
		
		for(int i=1;i<=r;i++){
			for(int j=1;j<=c;j++){
				if(i==1 || i==r || j==1 || j==c)
				System.out.print("*");
			else
				System.out.print(" ");
				
			}
			System.out.println();
		}
*/						
		
/*		
		Qustion :-  *
					**
					***
					****
					*****
		*/
		
/*		Scanner sc = new Scanner(System.in);
		int r = sc.nextInt();
		
		for(int i=1;i<=r;i++){
			for(int j=1;j<=i;j++){
				System.out.print("*");
				
			}
			System.out.println();;
	}*/
	
		
/*		Question :- *****
					****
					***
					**
					*
*/		
		Scanner sc = new Scanner(System.in);
		int r = sc.nextInt();
		
		for(int i=1;i<=r;i++){ //for(int i=1;i>=1;i--){
			for(int j=1;j<=(r+1-i);j++){ //for(int j=1;j<=i;j++){
				System.out.print("*");
				
			}
			System.out.println();
	}
	}
}
	
