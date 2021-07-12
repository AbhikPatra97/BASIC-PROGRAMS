package String_Program;

public class Convert_String_First_Letter_of_Each_Word_From_Lowercase_to_Uppercase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="java is a programming language";
		char[] ch= s.toCharArray();
		
		ch[0]=(char)(ch[0]-32);
		for(int i=0;i<s.length();i++) {
			if(ch[i] ==' ') {
				ch[i+1]=(char)(ch[i+1]-32);
			}
		}
		System.out.println(ch);
	}

}
