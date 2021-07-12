package Array_Program;

public class Sum_of_all_Elements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {0,1,2,3,4,5,6,7,8,9};
		
		int sum=0;
		for(int i=0;i<arr.length;i++) {
			sum=sum+arr[i];
		}
		System.out.println("Total sum "+sum);
	}

}
