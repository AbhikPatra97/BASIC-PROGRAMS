package Basic_Program;

import java.util.Scanner;

public class FibonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter the number");
		int count=scn.nextInt();
		
		int a=0;
		int b=1;
		int k=0;
		System.out.print(a+" "+b);
		while(k<=count) {
			k=a+b;
			a=b;
			b=k;
			if(k<=10) {
				System.out.print(" "+k);
			}
		}
	}

}
