package For_Testing;

public class Student {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StudentDetails s1=new StudentDetails();
		s1.id=1;
		s1.name="Monk";
		System.out.print(s1.id+" ");
		System.out.print(s1.name+" ");
		System.out.println(StudentDetails.college);
		

	}

}
class StudentDetails{
	int id;
	String name;
	static String college="KIIT";
}
