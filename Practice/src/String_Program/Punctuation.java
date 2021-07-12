package String_Program;

public class Punctuation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 //Stores the count of punctuation marks  
        int countPuncMarks = 0;  
        String str = "Good Morning! Mr. James Potter. Had your breakfast?";  
        
        for (int i = 0; i < str.length(); i++) {  
        //Checks whether given character is punctuation mark  
            if(str.charAt(i) == '!' || str.charAt(i) == ',' || str.charAt(i) == ';' || str.charAt(i) == '.' ||        str.charAt(i) == '?' || str.charAt(i) == '-' ||  
               str.charAt(i) == '\'' || str.charAt(i) == '\"' || str.charAt(i) == ':') {  
            		
            	countPuncMarks++;  
            }  
        }  
        System.out.println("Total number of punctuation characters exists in string: " +        countPuncMarks);  
    }  
}  