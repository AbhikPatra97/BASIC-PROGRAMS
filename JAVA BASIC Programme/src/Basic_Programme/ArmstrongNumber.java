package Basic_Programme;

import java.util.Scanner;

public class ArmstrongNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the no ");
		
		int n=sc.nextInt();
		
		int temp=n;
		int remainder=0;
		double result=0;
		
		while(n>0) {
			remainder=n%10;
			result=result+Math.pow(remainder,3);
			n=n/10;
		}
		if(result==temp)
			System.out.println("Armstrong");
		else
			System.out.println("not Armstrong");
	}

}