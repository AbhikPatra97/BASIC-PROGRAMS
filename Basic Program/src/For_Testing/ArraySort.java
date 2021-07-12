package For_Testing;

import java.util.Arrays;

public class ArraySort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {1,3,2,4,7,8,5,4};
		System.out.println("Length of the array is "+arr.length);
		Arrays.sort(arr);
		for(int obj:arr) {
			System.out.println(obj);
		}
	}

}
