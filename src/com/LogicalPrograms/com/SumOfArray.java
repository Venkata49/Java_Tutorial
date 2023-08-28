package com.LogicalPrograms.com;

public class SumOfArray {

	public static void main(String[] args) {

		
		int a[] ={7,12,3,4,5};
		//System.out.println(a.length);
		int sum =0;
		for(int i=0;i<=a.length-1;i++){	//a.length-1 = 5-1 = 4
			sum = sum+a[i]; 	//a[i]=7,a[i]=12,a[i]=3,....
			
		}
		System.out.println(sum);	//output :- 31

		
//		Enhaanced for loop.....
	/*	
		for(int value:a){
			sum = sum+value;
		}
		System.out.println(sum); 	//output :- 31

	*/
		}

}
