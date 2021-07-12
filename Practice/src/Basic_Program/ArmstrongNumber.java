package Basic_Program;

import java.util.Scanner;

public class ArmstrongNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter the no.");
		int n=scn.nextInt();
		
		int temp=n;
		int rem=0;
		double result=0;
		
		while(n>0) {
			rem=n%10;
			result=result+Math.pow(rem,3);
			n=n/10;
		}
		if(result==temp) {
			System.out.println("Number is Armstrong Number");
		}
		else {
			System.out.println("Number is not Armstrong Number");
		}
	}

}
