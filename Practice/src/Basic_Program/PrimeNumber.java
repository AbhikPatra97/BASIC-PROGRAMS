package Basic_Program;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=11;
		for(int i=2;i<=n/2;i++) {
			if(n%i==0) {
				break;
			}
			else {
				System.out.println("prime number");
			}
		}
	}

}
