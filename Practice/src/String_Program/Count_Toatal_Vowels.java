package String_Program;

public class Count_Toatal_Vowels {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "The best of both worlds"; 
		System.out.println(s);
		
		String y=s.toLowerCase();
		int count=0;
		
		for(int i=0;i<y.length();i++) {
			if(s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u') {
				count++;
			}
		}
		System.out.println("Total vowels is "+count);
	}

}
