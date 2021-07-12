package String_Program;

public class Count_Total_Consonants_Vowels_Using_replaceAll_Method {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "The best of both worlds"; 
		System.out.println(s);
		
		String y=s.replaceAll("[AEIOUaeiou]","");
		int vCount=s.length()-y.length();
		System.out.println("Total vowel count "+vCount);
		
		String z=y.replace(" ","");
		System.out.println("Total Constant count "+z.length());
	}

}
