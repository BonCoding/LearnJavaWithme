package com.simplilearn.mavenproject;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class StringProgUppercaseFirstChar {

	
	//write a code where u have 
	//to convert each character of words which is stored in a file to upper case
	
	public static void main(String args[]) throws IOException
	
	{	
		
		String inputPath="src/main/java/input.txt";
		String outputpath="src/main/java/output.txt";
		StringProgUppercaseFirstChar convert=new StringProgUppercaseFirstChar();
		
		convert.converterTouppercase(inputPath, outputpath);
		
		
		
		String input= "geeks quiz practice code";
		String[] input1=input.split(" ");
		ArrayList<String> arrl=new ArrayList<String>(Arrays.asList(input1));
		ArrayList<String> arr2=new ArrayList<String>();
		System.out.println(arrl);
//		  Collections.reverse(arrl);  
		System.out.println(arrl);
		System.out.println(arrl.get(3));
		StringBuffer sb=new StringBuffer();
		for(String abc:arrl)
		{
			System.out.println(abc);
			sb.append(abc).append(" ");
		}
	
		sb.reverse(); //reverses order and words both
		System.out.println(sb.toString());
	}
	
	void converterTouppercase(String inputPath,String OutPath) throws IOException
	{
		BufferedReader reader=new BufferedReader(new FileReader(inputPath));
		BufferedWriter writer=new BufferedWriter(new FileWriter(OutPath));
		
		String line;
		StringBuffer sb=new StringBuffer();
		while((line = reader.readLine()) != null)
			
		{
			String wordsArray[]=line.split("\\s+");
			for(String words:wordsArray)
			{
				
				char firstChartoUppercase=Character.toUpperCase(words.charAt(0));
				String convertedWord=firstChartoUppercase+words.substring(1);
				sb.append(convertedWord);
				
			}
			// Write modified line to output file
            writer.write(sb.toString());
            writer.newLine(); // Write new line character
        }
        
        // Close resources
        reader.close();
        writer.close();
        
        System.out.println("Successfully converted first characters to uppercase and saved to " + 
        		OutPath);
        
		
	}
}
