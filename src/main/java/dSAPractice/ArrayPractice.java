package dSAPractice;

import java.util.Arrays;

public class ArrayPractice {

	int arr[]=null;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		
		//when we create an array only ref is created in the RAM array[0]--> ref will have address of first element stored in aarray
		//instantiating array--> compiler allocates memory contiguos values will be default initially
		
		//assig values
//		
//		//first
//		char ch[]= {'a','b'};
//		//second
//		char ch1[];
//		ch1=new char[10];
//		//third
//		
//		
//		int[] itArray; //create array
//		itArray=new int[3]; //instatiating
//		itArray[0]=1;//initialising
//		itArray[1]=3;
//		itArray[2]=5;
//		System.out.println(Arrays.toString(itArray));
//		
//		String [] str= {"a","b","c"};
//		System.out.println(Arrays.toString(str));

			
		ArrayPractice ar=new ArrayPractice();
//		ar.singleDimentionArray(10);
//		ar.insertArr(0, 1);
//		ar.insertArr(1, 100);
//		ar.insertArr(3, 40);
//		ar.insertArr(1, 6);
//		ar.insertArr(40, 0);
		ar.twoDimenArray();
		}

	public void singleDimentionArray(int size)
	{
		
		arr=new int[size];
		for(int i=0; i<arr.length;i++)
		{
			arr[i]=Integer.MIN_VALUE;
		}
	}
	
	public void insertArr(int loc,int val)
	{
		try {
		if(arr[loc]==Integer.MIN_VALUE)
		{
			arr[loc]=val;
			System.out.println("sucessfully inserted");
			
		}
		else
			System.out.println("not inserted in array");
	}
	
		catch(Exception e)
		{
			
		}
		}
	
	public void twoDimenArray(){
		//declare
		
		int [][] twoDArray;
		//intantiate
		twoDArray=new int[2][2];
		//initialize
		twoDArray[0][0]=1;
		twoDArray[0][1]=2;
		twoDArray[1][0]=3;
		twoDArray[1][1]=4;
		
		//
		System.out.println(Arrays.deepToString(twoDArray));
		String [][] twoDStringArray= {{"a","b"},{"c","d"}};
		System.out.println(Arrays.deepToString(twoDStringArray));
	}
}
	
	

	


