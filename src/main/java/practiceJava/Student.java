package practiceJava;

public class Student {

	String name;
	int rollnum;
	
	public static void main(String[] args) {
		
		Student Rachana=new Student();
		Student Vineet=new Student();
		Student Nishtha=new Student();
		Rachana.rollnum=10;
		Rachana.name="Rachana Singh";
		Nishtha.name="Nishtha Singh";
		Nishtha.rollnum=20;
		Vineet.name="Vineet Singh";
		Vineet.rollnum=40;
		System.out.println(Rachana.name+" :"+Rachana.rollnum);
		System.out.println(Nishtha.name+" :"+Nishtha.rollnum);
		System.out.println(Vineet.name+" :"+Vineet.rollnum);
		
		Rachana.m1();
	}
	
	void m1()
	{
		System.out.println(rollnum);
	}

}
