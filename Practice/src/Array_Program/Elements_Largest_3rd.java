package Array_Program;

public class Elements_Largest_3rd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {0,1,2,3,4,5,6,7,8,9};
		System.out.println("Third Largest: "+getThirdLargest(arr,6));
	}

	public static int getThirdLargest(int[] a, int total){  
		int temp;  
		for (int i = 0; i < total; i++)   
		        {  
		            for (int j = i + 1; j < total; j++)   
		            {  
		                if (a[i] > a[j])   
		                {  
		                    temp = a[i];  
		                    a[i] = a[j];  
		                    a[j] = temp;  
		                }  
		            }  
		        }  
		       return a[total-3];  
	}
}
