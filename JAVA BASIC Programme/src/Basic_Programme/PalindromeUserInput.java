package Basic_Programme;
import java.util.Scanner;
public class PalindromeUserInput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the no ");
		
		int n=sc.nextInt();
		
		int temp=n;
		int remainder=0;
		int result=0;
		
		while(n>0) {
			remainder=n%10;
			result=(result*10)+remainder;
			n=n/10;
		}
		if(result==temp)
			System.out.println("Palindrome");
		else
			System.out.println("not Palindrome");
	}

}
