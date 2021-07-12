package String_Program;

public class Count_Total_Consonants_Vowels {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "The best of both worlds"; 
		System.out.println(s);
		
		int VowelCount=0;
		int ConsonantCount=0;
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u') {
				VowelCount++;
			}
			else if(s.charAt(i)>='a'&& s.charAt(i)<='z') {
				ConsonantCount++;
			}
		}
		System.out.println("Vowel count "+VowelCount);
		System.out.println("Consonant count "+ConsonantCount);
	}

}
