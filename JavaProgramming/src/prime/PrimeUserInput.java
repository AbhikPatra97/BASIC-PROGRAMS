package prime;
import java.util.Scanner;
public class PrimeUserInput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the no : ");
		int n=sc.nextInt();
		for(int i=2;i<=n;i++) {
			if(n%i==0)
				break;
			if(i==n)
				System.out.println("Given no. is not prime");
			else
				System.out.println("Given no. is prime");
		}

	}

}
