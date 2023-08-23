package com.DataStructureJava.com;

import java.util.Scanner;


class Algebra{
	int a,b;
	int add(int a,int b){
		int ans = a+b;
		return ans;
	}

	Algebra(int x,int y){
		System.out.println("hello");
		a =x;
		b=y;
	}
	int add(){
		int ans = a + b;
		return ans;
	}
	int sub(){
		
		return a-b;
	}
}

public class Person {
	public static void main(String[] args){

		Algebra  obj = new Algebra(5,7);
		//Scanner sc = new Scanner(System.in);
//		int a = sc.nextInt();
//		int b = sc.nextInt();
		System.out.println("sum of input numbers is:");
		int ans = obj.add();
		
       System.out.println(ans);
       System.out.println(obj.sub());
       System.out.println(obj.add());

	
	
	}
	
			
}
