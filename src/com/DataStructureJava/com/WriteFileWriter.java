package com.DataStructureJava.com;

//import java.io.BufferedReader;
import java.io.BufferedWriter;
//import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class WriteFileWriter {

	public static void main(String[] args) throws IOException{

		FileWriter fr=new FileWriter("E:\\notepad\\sample.text");
		BufferedWriter bw=new BufferedWriter(fr);
		
		bw.write("hello java programmer....!");
		System.out.println("Finished...!");
		bw.close();

	
	}

}
