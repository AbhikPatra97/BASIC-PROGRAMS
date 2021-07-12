package Array_Program;

public class Reverse_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {0,1,2,3,4,5,6,7,8,9};
		System.out.println("Original array");
		for(int i:arr) {
			System.out.print(" "+arr[i]);
		}
		System.out.println();
		System.out.println("Rverse array");
		for(int i=arr.length-1;i>=0;i--) {
			System.out.print(" "+arr[i]);
		}
	}

}
