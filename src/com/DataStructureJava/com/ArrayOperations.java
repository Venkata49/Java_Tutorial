package com.DataStructureJava.com;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ArrayOperations {

	public static void main(String[] args) {
		
//		Array Sort Using 'sort()' method
		int a[]=new int[]{2,3,9,6,7,4,8,5};
		for(int i=0;i<a.length;i++){
			System.out.print(a[i]+" ");
		}
		Arrays.sort(a);
		System.out.println();
		for(int i =0;i<a.length;i++){
			System.out.print(a[i]+" ");
		}
		
	}

}
