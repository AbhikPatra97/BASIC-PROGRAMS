package String_Program;

public class Count_Total_Character1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "The best of both worlds"; 
		System.out.println(s);
		
		int count=0;
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)!=' ') {
				count++;
			}
		}
		System.out.println("Total character number is "+count);
	}

}
