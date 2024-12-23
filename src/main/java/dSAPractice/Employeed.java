package dSAPractice;

public class Employeed {
 String name;
 int rolno;
 String address;
 
 Employeed(String name,int rolno, String add)
 {
	 this.name=name;
	 this.rolno=rolno;
	 this.address=add;
 }

 @Override
 public String toString() {
     return "Name: " + name + ", Roll No: " + rolno + ", Address: " + address;
 }
 
}
