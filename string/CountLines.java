package com.aug5;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class CountLines {

	public static void main(String[] args) throws IOException {
		
		//File file = new File("C:\\Users\\ipsik\\eclipse-workspace\\JavaPractice\\src\\com\\aug5\\Sentences.txt");
		
		BufferedReader reader = new BufferedReader(new FileReader("C:\\Users\\ipsik\\eclipse-workspace\\JavaPractice\\src\\com\\aug5\\Sentences.txt"));
		int lines = 0;
		while (reader.readLine() != null) 
		lines++;
		reader.close();
		System.out.println("no of lines in file :"+lines);		
	}

}
