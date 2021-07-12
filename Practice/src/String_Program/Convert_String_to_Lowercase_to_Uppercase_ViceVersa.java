package String_Program;

public class Convert_String_to_Lowercase_to_Uppercase_ViceVersa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s="JAVA is a Programming Language";   
		for(int i=0;i<s.length();i++) {
			char ch=s.charAt(i);
			if(Character.isLowerCase(ch)) {
				ch= Character.toUpperCase(ch);
			}
			else if(Character.isUpperCase(ch)) {
				ch=Character.toLowerCase(ch);
			}
			System.out.print(ch);
		}
		
	}
}