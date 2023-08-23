package com.DataStructureJava.com;

import java.util.Scanner;

public class Two_D_Array {

	public static void main(String[] args) {

		int n,m,p;
		Scanner input = new Scanner(System.in);
		System.out.println("enter number of rows :");
		n = input.nextInt();
		System.out.println("enter number of columns :");
		m = input.nextInt();
		int a[][] = new int[n][m];
		
		System.out.println("enter values : ");
		for(int i=0;i<n;i++){ //rows = 2, column = 2
			for(int j=0;j<m;j++){
				a[i][j]=input.nextInt();//a[0][0]=10,a[0][1]=20
			}
		}
		for(int i=0;i<n;i++){
			for(int j=0;j<m;j++){
				System.out.print(a[i][j]+" ");
				//output : stored values are - 10 20 30 
//											30 40 50
			}
			System.out.println();
		}
		
//		Another method in two - D array


		/*int a[][] ={{1,2},{3,4},{5,6}};
		for(int i =0;i<3;i++){
			for(int j=0;j<2;j++){
				System.out.print(a[i][j]);
			}
			System.out.println();
		}*/
	}
}