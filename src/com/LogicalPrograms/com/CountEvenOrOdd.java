package com.LogicalPrograms.com;

public class CountEvenOrOdd {

	public static void main(String[] args) {

		
		int num = 12345;
		int count_even = 0;
		int count_odd = 0;
		
		while(num > 0){
			int rem = num % 10;
			if(rem % 2 == 0){
				count_even++;
			}
			else{
				count_odd++;
			}
			num = num/10;
		}
		System.out.println("enter of even numbers :"+count_odd);
		System.out.println("enter of even numbers :"+count_even);
	}

}
