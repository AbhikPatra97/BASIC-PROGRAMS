package Basic_Program;

public class is_PrimeNumber {

	public static boolean isprime(int n) {
		// TODO Auto-generated method stub
		if(n<=1) 
		return false;
		for(int i=2;i<=n/2;i++) {
			if(n%i==0) {
				return false;
			}
		}
		return true;
		
	}
	public static void main(String[] args) {
		for(int i=1;i<=100;i++) {
			if(isprime(i)) {
				System.out.println(i);
			}
		}
	}

}
