package String_Program;

public class Divide_String_EqualParts {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="Java Programming";
		int length=s.length();
		int n=4;	//Want to divide in n parts
		int len=length/n;
		for(int i=0;i<length;i=i+len) {
			if(length%n != 0) {
				System.out.println("String can't be divide in "+ n+" parts");
			}
			else {
				String part=s.substring(i,i+len);
				System.out.println(part);
			}
		}
		
	}

}
