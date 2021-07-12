package String_Program;

public class Palindrome_String {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="abac";
		char[] x=s.toCharArray();
		char[] y=new char[x.length];
		
		for(int i=0;i<x.length;i++) {
			y[s.length()-1-i]=x[i];
		}
			System.out.println(x);
			System.out.println(y);
			
			System.out.println();
			for(int i=0;i<x.length;i++) {
				if(x[i]!=y[i]) {
					System.out.println("Not Palindrome String");
					System.exit(0);
				}		
			}
			System.out.println("Palindrome String");
			
	}

}
