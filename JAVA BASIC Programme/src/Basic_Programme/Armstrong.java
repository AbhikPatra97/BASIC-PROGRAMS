package Basic_Programme;

public class Armstrong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=153;
		int temp1=a;
		int remainder1=0;
		double result1=0;
		
		while(a>0) {
			remainder1=a%10;
			result1=result1+Math.pow(remainder1,3);
			a=a/10;
		}
		if(result1==temp1)
			System.out.println("Armstrong Number");
		else
			System.out.println("not Armstrong Number");

	}

}
