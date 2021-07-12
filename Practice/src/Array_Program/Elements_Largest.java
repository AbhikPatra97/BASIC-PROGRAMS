package Array_Program;

public class Elements_Largest {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {0,1,2,3,4,5,6,7,8,9};
		
		int max=arr[0];
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>max) {
				max=arr[i];
			}
		}
		System.out.println("Largest elements"+max);
	}


}
