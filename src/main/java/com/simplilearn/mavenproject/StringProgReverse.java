package com.simplilearn.mavenproject;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;

public class StringProgReverse {
	
	public static void main(String[] args) throws IOException
	{
		
		String inputPath="src/main/java/input.txt";
		String input="Rachana aingh 66 bx";
		String s2="rachana aingh 66 bx";
		
		StringProgReverse str= new StringProgReverse();
//		str.stringrev(input);
//		str.characterCount(input);
//		str.vovConso(input);
//		str.fisrtWord(input);
//		str.anagram(input,  s2);
//		str.possibleSubset(input);
//		str.duplicateChars(input);
		str.para(inputPath);
	}
	
	void stringrev(String input)
	
	{
		String next="";
		char ch;
		for(int i=0;i<input.length();i++)
		{
			ch=input.charAt(i);
			next=ch+next;
			
		}
		System.out.println(next);
	}
//	character count
	void characterCount(String input)
	{
		
		char ch[]=input.toCharArray();
		System.out.println(ch.length);
	}
	
	//vowels and consonants and other chars
	void vovConso(String input)
	{
		int countVow=0;
		int countCon=0;
		int otherchars=0;
		String lopwerinput=input.toLowerCase();
		for(int i=0;i<lopwerinput.length();i++)
		{
		
			
			if(lopwerinput.charAt(i)=='a'|| lopwerinput.charAt(i)=='e'|| lopwerinput.charAt(i)=='o'|| lopwerinput.charAt(i)=='u')
			{
				countVow++;
			}
			else if(lopwerinput.charAt(i) >= 'a' && lopwerinput.charAt(i)<='z')
			{
				countCon++;
			}
			else {
				otherchars++;
				
			}
		}
		System.out.println("number of consonants"+ "  "+ countCon);	
		System.out.println("number of vowels"+"  "+ countVow);
		System.out.println("number of other characters"+"  "+ otherchars);
			
	}
//check the first char of each word is vowel or consonants
	
	void fisrtWord(String input)
	{
		String str=input.toLowerCase();
		
		String[] strArray=str.split("\\s");  //[rachana, singh, 66, bx,abc]
		
		for(int i=0; i<strArray.length;i++)
		{
			if(strArray[i].charAt(0)=='a'||strArray[i].charAt(0)=='e'||strArray[i].charAt(0)=='i'||strArray[i].charAt(0)=='0'||strArray[i].charAt(0)=='u')
			{
			
				System.out.println(strArray[i]);
			}
		}

	}

//anagram string e.g abcd dcab
	
	void anagram(String s1,String s2)
	{
		
		if(s1.length()!=s2.length()) {
			
		System.out.println("both ara not angram");
		
		
		}
		else
		{
			char[] ch1=s1.toLowerCase().toCharArray();
			char[] ch2=s2.toLowerCase().toCharArray();
			
			Arrays.sort(ch1);
			Arrays.sort(ch2);
			
			if(Arrays.equals(ch1, ch2))
			{
				
				System.out.println("both are anagram");
			}
			else
			{
				System.out.println("both are not angram");
			}
			
		}
	}

//sll possible subsets of string.  n(n+1)/2
	
	void possibleSubset(String input)
	{
		int len=input.length();
		System.out.println(len);
		//fun =f fu fun un n u
		int temp=0;
		
		String[] substringArray=new String[len*(len+1)/2];
		
		for(int i=0;i<input.length();i++)
		{
			
			for(int j=i;j<len;j++)
			{
				substringArray[temp]=input.substring(i,j+1);
				temp++;
			}
				
				
		}
		System.out.println(substringArray.length);
		for(String aray:substringArray)
			System.out.println(aray);
	}



//duplicate characters in a string
	
	void duplicateChars(String input)
	{
		
		int len=input.length();
		char ch[]=input.toCharArray();
	for(int i=0; i<len;i++)
		
	{
		
		for(int j=i+1;j<len;j++)
		{
			if(ch[i]==ch[j]&& ch[i] != ' ')
			{
				System.out.println("character is duplicate--->"+"  "+ch[i]);
			}
		}
	}
		
		
		
		
	}
	
//find the biggest paragraph in a given file.
	
	void para(String path) throws IOException
	{
		
		String line; String word="";
		
	BufferedReader reader=new BufferedReader(new FileReader(path));
	
	while((line=reader.readLine())!=null)
	{
		
		System.out.println(line);
		line.length();
		
	}
	}

}
