package Basic_Programme;
import java.util.Scanner;
public class FibonacciUserInput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the no.");
		
		int n=sc.nextInt();
		
		int k=0;
		int a=1;
		int b=1;
		
		System.out.print("1 1 ");
		while(k<=n) {
			k=a+b;
			System.out.print(k+" ");
			a=b;
			b=k;
		}

	}

}
