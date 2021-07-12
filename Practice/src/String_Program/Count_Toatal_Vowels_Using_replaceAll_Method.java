package String_Program;

public class Count_Toatal_Vowels_Using_replaceAll_Method {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "The best of both worlds"; 
		System.out.println(s);
		
		String y=s.replaceAll("[AEIOUaeiou]", "");
		
		int count=s.length()-y.length();
		System.out.println("Total vowels number "+count);
		
	}

}
