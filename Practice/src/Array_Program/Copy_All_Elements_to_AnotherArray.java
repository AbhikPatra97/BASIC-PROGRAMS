package Array_Program;

public class Copy_All_Elements_to_AnotherArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr1= {2,5,1,6};
		int[] arr2=new int[arr1.length];
		
		for(int i=0;i<arr1.length;i++) {
			arr2[i]=arr1[i];
			System.out.print(" "+arr2[i]);
		}
	}

}
