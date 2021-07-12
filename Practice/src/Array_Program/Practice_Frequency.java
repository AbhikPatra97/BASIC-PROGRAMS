package Array_Program;

public class Practice_Frequency {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr={2,4,5,2};
		int freq[]=new int[arr.length];
		
		for(int i=0;i<arr.length;i++) {
			int count=1;
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]==arr[j]) {
					count++;
					freq[j]=-1;
				}
			}
			if(freq[i]!=-1) {
				freq[i]=count;
			}
		}
		for(int i=0;i<freq.length;i++) {
			if(freq[i]!=-1)
				System.out.println(arr[i]+"Frequency is = "+freq[i]);
		}
	}

}
