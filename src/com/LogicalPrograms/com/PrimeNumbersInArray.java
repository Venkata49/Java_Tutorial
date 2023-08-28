package com.LogicalPrograms.com;

public class PrimeNumbersInArray {

	public static void main(String[] args) {

		
		int[] a = {2,3,4,6,11,8,9,5,7,10,12,15,18};
		for(int b:a){
		int count = 0;
		for(int i=1;i<=b;i++){
			if(b%i == 0){
				count +=1;
			}
		}
		if(count==2)
			System.out.println(b);
		}

	}

}
