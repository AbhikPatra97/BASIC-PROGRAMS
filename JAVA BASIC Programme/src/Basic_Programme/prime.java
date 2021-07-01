package Basic_Programme;

public class prime {
	public static boolean isprime(int n)
	{
		if(n<=1)
			return false;
		for(int i=2;i<n;i++)
		{
			if(n%i==0)
			{
				return false;
			}
		}
		return true;
	}
	public static void main(String[] args)
	{
		for(int i=1;i<=100;i++)
		{
			if(isprime(i))
				System.out.println(i);
		}
	}
	

}
