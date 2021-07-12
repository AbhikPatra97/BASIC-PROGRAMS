package String_Program;

public class Count_Total_Vowels_Consonant_SpecialSymbol {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="Java is a Programming language, which is used to write code.";
		String y=s.toLowerCase();
		char ch[]=y.toCharArray();
		int vCount=0;
		int cCount=0;
		int ssCount=0;
		for(int i=0;i<ch.length;i++) {
			if(ch[i]>='a'&&ch[i]<='z') {
				if(ch[i]=='a'||ch[i]=='e'||ch[i]=='i'||ch[i]=='o'||ch[i]=='u') {
					vCount++;
				}
				else 
					cCount++;
			}
			else
				ssCount++;
		}
		System.out.println("Vowel count is           "+vCount);
		System.out.println("Consonant count is       "+cCount);
		System.out.println("Special Symbol count is  "+ssCount);
	}

}
