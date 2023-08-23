package com.DataStructureJava.com;

import java.util.Scanner;

public class ArrayDeletion {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		System.out.println("enter size of array :");
		int n = s.nextInt();
		int a[] = new int[n];
		int b[] = new int[n-1];
		System.out.println("enter index elments : ");
		for(int i=0;i<n;i++){
			a[i] = s.nextInt();
		}
		System.out.println("enter deleted index value :");
		int m = s.nextInt();
		for(int i=0;i<a.length;i++){
			if(i<m){
				b[i]=a[i];
			}else if(i==m)
				continue;
			else {
				b[i-1] = a[i];
			}
		}
		System.out.println("elements are :");
		for(int i=0;i<n-1;i++){
			System.out.println(b[i]);
		}
	}

}
