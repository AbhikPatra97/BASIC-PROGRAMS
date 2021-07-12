package String_Program;

public class Frequency_Charachter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="JAVA is a Programming Language";
		 int[] freq = new int[str.length()];      
	            
	        //Converts given string into character array    
	        char ch[] = str.toCharArray();    
	            
	        for(int i = 0; i <str.length(); i++) {    
	            freq[i] = 1;    
	            for(int j = i+1; j <str.length(); j++) {    
	                if(ch[i] == ch[j]) {    
	                    freq[i]++;    
	                        
	                    //Set string[j] to 0 to avoid printing visited character    
	                    ch[j] = '0';    
	                }    
	            }    
	        }    
	            
	        //Displays the each character and their corresponding frequency    
	        System.out.println("Characters and their corresponding frequencies");    
	        for(int i = 0; i <freq.length; i++) {    
	            if(ch[i] != ' ' && ch[i] != '0')    
	                System.out.println("Frequency of "+ch[i] + "-" + freq[i]);    
	        }    
	    }    
	}    
