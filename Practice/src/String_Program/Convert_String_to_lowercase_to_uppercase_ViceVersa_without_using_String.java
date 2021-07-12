package String_Program;

public class Convert_String_to_lowercase_to_uppercase_ViceVersa_without_using_String {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="JAVA is a Programming Language";
/*		 * ASCII value of A 65	* ASCII value of Z 90
		  
		 * ASCII value of a 97	* ASCII value of z 122
		 
		 * ASCII value of = 32
 */			
		for(int i=0;i<s.length();i++) {
			int ch=s.charAt(i);
			if(ch>=65 && ch<=90) {
				ch=ch+32;
				System.out.print((char)ch);
			}
			else if(ch>=97 && ch<=122) {
				ch=ch-32;
				System.out.print((char)ch);
			}
			else if(ch==32) {
				System.out.print((char)ch);
			}
		}
		
	}

}
