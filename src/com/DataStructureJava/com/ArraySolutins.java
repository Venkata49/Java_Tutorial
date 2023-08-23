package com.DataStructureJava.com;

public class ArraySolutins {

	public static void main(String[] args) {
		
		/*int a[] = new int[6];
		int count=1;
		for(int i=0;i<a.length;i++){
			a[i] = count;
			count++;
		}
		for(int i=0;i<a.length;i++){
			System.out.print(a[i]+ " ");
		}
		*/
		
		int a[][] = new int[3][4];
		int count=1;
		for(int i=0;i<a.length;i++){
			for(int j=0;j<a[i].length;j++){
				a[i][j]=count;
				count++;
			}
		}
		for(int i=0;i<a.length;i++){
			for(int j=0;j<a[i].length;j++){
				System.out.print(a[i][j]+" ");
	}
			System.out.println();
		}
}
	}