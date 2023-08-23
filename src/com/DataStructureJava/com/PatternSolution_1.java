package com.DataStructureJava.com;

public class PatternSolution_1 {

	public static void main(String[] args) {

/*		Question :-   *
					 ***
					*****
				   *******

*/
		
/*		int r = 5;
		for(int i=1;i<=r;i++){
			for(int j=1;j<=r-i;j++){
				System.out.print(" ");
			}
			for(int k = 1;k<=2*i-1;k++){
				System.out.print("*");
			}
			System.out.println();
		}
*/

		/*
		Question :- 1234567
					2345671
					3456712
					4567123
					5671234
					6712345
					7123456
*/
		
/*		int r = 7;
		for(int i=1;i<=r;i++){
			for(int j=i;j<=r;j++){
				System.out.print(j);
			}
			for(int k=1;k<=i-1;k++){
				System.out.print(k);
			}
			System.out.println();
		}
*/
	
		
/*		Question :- 1
					12
					123
					1234

*/		
	/*	int r =4;
		for(int i=1;i<=r;i++){
			for(int j=1;j<=i;j++){
				System.out.print(j);
			}
			System.out.println();
		}
	*/
		
		
/*		Qustion :-  1
		  		   121
		  		  12321
		  		 1234321

*/		
		int r =4;
	
		for(int i=1;i<=r;i++){
			//print r-i rows spaces
			for(int j=1;j<= r-i;j++){
				System.out.print(" ");
			}
			// print 1 to i
			for (int k=1;k<=i;k++){
				System.out.print(k);
			}
			//print i-1 to 1
			for(int l=i-1;l>=1;l--){
				System.out.print(l);
			}
			System.out.println();
		}
		
	}

}
