package String_Program;

public class Smallest_Largest_Word {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="JAVA is a Programming Language";
		String[] str=s.split(" ");
		
		String smallest=str[0];
		String largest="";
		
		for(String s1:str) {
			if(smallest.length()>s1.length()) {
				smallest=s1;
			}
			else if(largest.length()<s1.length()){
				largest=s1;
			}
		}
		System.out.println(smallest);
		System.out.println(largest);
	}
}
