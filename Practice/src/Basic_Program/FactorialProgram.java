package Basic_Program;

import java.util.Scanner;

public class FactorialProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter the no.");
		int n=scn.nextInt();
		
		int fact=1;
		if(n==0) {
			System.out.println("Factorial is=1");
		}
		else {
			for(int i=1;i<=n;i++) {
				fact=fact*i;
			}
			System.out.println("Factorial is="+fact);
		}
		
	}

}
