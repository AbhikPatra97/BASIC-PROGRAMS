package String_Program;

public class Rotation_of_Another_String {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="abcde";
		String s2="deabc";
		
		if(s1.length()!=s2.length())
			System.out.println("Not the rotation");
		else {
			s1=s1.concat(s1);
			if(s1.indexOf(s2)!= -1){
				System.out.println("Rotation");
			}
			else
				System.out.println("Not the rotation");
		}
	}

}
