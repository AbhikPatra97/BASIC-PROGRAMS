package Array_Program;

public class Elements_on_Odd_position {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {0,1,2,3,4,5,6,7,8,9};
		System.out.println("Original array");
		for(int i:arr) {
			System.out.print(" "+arr[i]);
		}
		System.out.println();
		System.out.println("Elements on even position");
		for(int i=1;i<arr.length;i=i+2) {
			System.out.print(" "+arr[i]);
		}
	}

}
