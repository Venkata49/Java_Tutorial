package com.DataStructureJava.com;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class FileReader_1 {

	public static void main(String[] args)throws IOException {

		FileReader fr=new FileReader("E:\\notepad\\sample.text");
		BufferedReader br=new BufferedReader(fr);
		String str;
		while((str = br.readLine())!=null){
			System.out.println(str);
		}
		br.close();
		

//		Another way to import file using Scanner class...change bufferdReader to Scanner...
		
		
	}

}
