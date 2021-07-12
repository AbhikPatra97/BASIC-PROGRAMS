package String_Program;

public class Check_Contains_Only_Integer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="1a23546";
		char ch[]=s.toCharArray();
		
		int i=0;
		while(i<ch.length) {
			if(ch[i]>=0&&ch[i]<=9) {
				i++;
			}
			else {
				System.out.println("Not a Integer string");
				System.exit(0);
			}
		}
		System.out.println("Integer String");
	}

}
