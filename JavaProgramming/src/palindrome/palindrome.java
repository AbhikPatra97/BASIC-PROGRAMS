package palindrome;

public class palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=121;
		int r=0;
		int s=0;
		int t=n;
		while(n>0)
		{
			r=n%10;
			n=n/10;
			s=s*10+r;
		}
		if(t==s)
			System.out.println("palindrome");
		else
			System.out.println("not palindrome");

	}

}
