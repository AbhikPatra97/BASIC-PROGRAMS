package OOPS_Program;

class Student {
	int rollno;  
	 String name;  
	 
	 void insertRecord(int r, String n){  
	  rollno=r;  
	  name=n;  
	 }  
	
	 void displayInfo(){
		 System.out.println(rollno+" "+name);
		 }  
	}

class TEST_Student{  
	 public static void main(String args[]){  
	  Student s1=new Student();  
	  Student s2=new Student();  
	  s1.insertRecord(111,"Karan");  
	  s2.insertRecord(222,"Aryan");  
	  s1.displayInfo();  
	  s2.displayInfo();  
	 }  

}
