package Basic_Program;

import java.util.Scanner;

public class PalindromeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter the number");
		int n=scn.nextInt();
		
		int rem=0;
		int sum=0;
		int temp=n;
		
		while(n>0) {
			rem=n%10;
			sum=(sum*10)+rem;
			n=n/10;
		}
		if(sum==temp) {
			System.out.println("The number is palindrome");
		}
		else
			System.out.println("The number is not palindrome");
	}

}
