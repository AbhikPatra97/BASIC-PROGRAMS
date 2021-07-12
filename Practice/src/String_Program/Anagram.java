package String_Program;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="He is Aradhya";
		String p="is he Hradaya";
		
		s=s.replaceAll(" ","");
		p=p.replaceAll(" ","");
		
		s=s.toLowerCase();
		p=p.toLowerCase();
		
		char[] x=s.toCharArray();
		char[] y=p.toCharArray();
		
		Arrays.sort(x);
		Arrays.sort(y);
		
		boolean result=Arrays.equals(x,y);
		if(result=true) {
			System.out.println("Anagram");
		}
		else {
			System.out.println("Not Anagram");
		}
	}

}
