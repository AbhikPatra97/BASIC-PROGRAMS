package For_Testing;

class Students {
	int roll_no;
	String name;
	static String College_Name="ITM";
	}

public class StaticDemo{
	public static void main(String args[])
	{
	Students s1=new Students();
	s1.roll_no=100;
	s1.name="abcd";
	
	System.out.println(s1.roll_no);
	System.out.println(s1.name);
	System.out.println(Students.College_Name); 
	
	Students  s2=new  Students();
	s2.roll_no=200;
	s2.name="zyx";
	
	System.out.println(s2.roll_no);
	System.out.println(s2.name);
	System.out.println(Students.College_Name); 
	}
}