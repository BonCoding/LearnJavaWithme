package practiceJava;

public class PatternPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
//	     *     
//	    ***    
//	   *****   
//	  *******  
//	 ********* 
//	***********
//	
//	1
//	2 2
//	3 3 3
//	4 4 4 4
//	5 5 5 5 5
//	6 6 6 6 6 6
	

	int n=6;
//	
	for(int i=1; i<n;i++)
	{
//		
		for(int j=1;j<=i;j++)
		{
			System.out.print(i+" ");
			
			}
		System.out.println();
		}
//		
	
//	1 2 3 4 5 6
//	1 2 3 4 5
//	1 2 3 4
//	1 2 3
//	1 2 
//	1
	System.out.println();
	for(int i=0; i<n;i++)
	{
		
		for(int j=n;j>i;j--)
		{
			System.out.print(n-j+1+" ");
			
			}
		System.out.println();
		}
	}

}
