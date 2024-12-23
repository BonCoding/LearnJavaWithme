package dSAPractice;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListTut {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//size can be changed --> size
		//type safety --> can insert any type of data element , unless used generics
		//creates default array of size 10 with null values 
		//resizing=1.5x depending upon implememtation
		//if it is full then it will be resized
		//if ellement is remoced then shfting will happen
		//array list uses internal array for storing its values
		//adding removing  searching methods it provides
		ArrayList<Integer> al=new ArrayList<Integer>(30); //going to allocate an array with cap 10
		al.add(10);
		al.add(100);
		al.add(1000);
		al.add(10000);
//		ArrayList<String> st1=new ArrayList<String>(Arrays.asList("Rachana","Vineet","Nishtha"));
		
		ArrayList<String> st1=new ArrayList<String>();
//		st1.add("Rachana");
//		st1.add("10");
//		st1.add(0,"rachana Singh");
//		st1.add(6,"singh");
		//going to alloocate array with size 10 7 as null  and first3 as given.
		
		st1.add("rachana");
		st1.add(1,"rachana singh");
		st1.add(2,"pune");
		st1.add(0,"pune MH");
		st1.add("pune");
//		System.out.println(st1);
//		System.out.println(al);
//		System.out.println(st1.get(1));
		st1.remove("pune");
//		System.out.println(st1);
		int index=st1.indexOf("pune");
//		System.out.println(index);
		
		//size if different than capacity
		
		ArrayList<Employeed> emp=new ArrayList<Employeed>();
		Employeed emp11=new Employeed("rachana",1,"pune");
                  emp.add(emp11);
                  emp.add(new Employeed("Nishtha",1,"MH"));
                  System.out.println(emp);
               for(Employeed emp1:emp)
               {
            	  if( emp1.name.equalsIgnoreCase("Rachana"))
            			   {
            				   System.err.println(emp1.address+" "+emp1.rolno);
            			   }
               }
                  
	}

}
