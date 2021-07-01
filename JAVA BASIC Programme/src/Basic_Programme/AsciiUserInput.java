package Basic_Programme;
import java.util.Scanner;
public class AsciiUserInput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter value");
		
		int n=sc.next().charAt(0);
		System.out.println(n);
	}

}