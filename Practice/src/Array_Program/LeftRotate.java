package Array_Program;

public class LeftRotate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {1,2,3,4,5,6};
		System.out.println("oginal array");
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		int n=3; //Rotate position
		 for(int i = 0; i < n; i++){  
	            int j, first;  
	            //Stores the first element of the array  
	            first = arr[0];  
	            for(j = 0; j < arr.length-1; j++){  
	                //Shift element of array by one  
	                arr[j] = arr[j+1];  
	            }  
	            //First element of array will be added to the end  
	            arr[j] = first;  
	        }  
	        System.out.println(); 
	        System.out.println("Array after left rotation: ");  
	        for(int i = 0; i< arr.length; i++){  
	            System.out.print(arr[i] + " ");  
	        } 
	}

}
