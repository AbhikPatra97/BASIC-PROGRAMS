package Array_Program;

import java.util.Arrays;

public class Duplicate_Elements_remove {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {10,20,30,40,10,50,20};
		System.out.println("Original Array");
		for(int i=0;i<arr.length;i++) {
			System.out.print(" "+arr[i]);
		}
		int n=arr.length;
		for(int i=0;i<n;i++) {
			for(int j=i+1;j<n;j++) {
				if(arr[i]==arr[j]) {
					arr[j]=arr[arr.length -1];
					n--;
				}
			}
		}
		System.out.println();
		int[] arr1=Arrays.copyOf(arr, n);
		System.out.println("After removing duplicates");
		for(int i=0;i<arr1.length;i++) {
			System.out.print(" "+arr1[i]);
		}
	}

}
