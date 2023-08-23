package com.DataStructureJava.com;

import java.util.Scanner;


public class arrays {

	public static void main(String[] args) {
		
//	 Array insertion
		int n;
		Scanner input = new Scanner(System.in);
		System.out.println("enter size of array:");
		n = input.nextInt();
		int a[] = new int[n];
		int b[] = new int[n+1];
		System.out.println("enter elements :");
		for(int i = 0; i<n;i++){
			a[i] = input.nextInt();
		}
		
		System.out.println("enter an index value where you will insert : ");
		int m = input.nextInt();
		System.out.println("which value we will insert : ");
		int p = input.nextInt();
		for(int i=0;i<n+1;i++){
			if(i<m){
				b[i]=a[i];
			}else if(i==m){
				b[i] = p;
			}else{
				b[i]=a[i-1];
			}
				}
		System.out.println("elements are :");
		for(int i=0;i<n;i++){
			System.out.println(b[i]);
	
		}
	
		
			}

}
