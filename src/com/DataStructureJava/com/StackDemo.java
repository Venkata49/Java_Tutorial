package com.DataStructureJava.com;

import java.util.Iterator;
import java.util.Stack;

public class StackDemo {

	public static void main(String[] args) {
		
//		Stack s1 = new Stack(); //Creating an Object.....
		
		Stack<Integer> s1 = new Stack();
		s1.push(2);
		s1.push(4);
		s1.push(9);
		System.out.println(s1);//[2, 4, 9]
		
//		Remove operation
		
		s1.pop();
		System.out.println(s1);//delete 9 elment output is [2, 4]
		
//		peek Operation
		
		System.out.println(s1.peek());//output is : 4
		
		boolean status = s1.empty();
		System.out.println(status);// false
		
		int indexfound = s1.search(4);
		System.out.println(indexfound);//output : 4th index is 1st place so output is '1'
		
		Iterator it = s1.iterator();
		while(it.hasNext()){
			Object s2 = it.next();
			System.out.print(s2);//output : 2 4
		}
		System.out.println();
		
		System.out.println("size of stacke is :"+s1.size());//output : size of stacke is :2
		
		s1.sort(null);
		System.out.println(s1);
		

		
	}

}
