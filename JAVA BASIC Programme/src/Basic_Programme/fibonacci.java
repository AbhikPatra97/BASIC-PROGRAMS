package Basic_Programme;

public class fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int k=0;
		int a=1;
		int b=1;
		System.out.print("1 1 ");
		while(k<=100)
		{
			k=a+b;
			System.out.print(k+" ");
			a=b;
			b=k;
		}

	}

}
