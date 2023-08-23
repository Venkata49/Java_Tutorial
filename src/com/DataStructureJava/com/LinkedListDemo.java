package com.DataStructureJava.com;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListDemo {

	public static void main(String[] args) {
		
		LinkedList<Integer> lin = new LinkedList<>();
		lin.add(3);
		lin.add(7);
		lin.add(10);
		lin.add(2,6);
		System.out.println(lin);
		
//		Remove elements
		
		lin.remove(2);
		System.out.println(lin);
		lin.removeFirst();
		System.out.println(lin);
		lin.removeLast();
		
		Iterator it = lin.iterator();
		while(it.hasNext()){
			System.out.print(it.next()+" ");
		}
	}

}
