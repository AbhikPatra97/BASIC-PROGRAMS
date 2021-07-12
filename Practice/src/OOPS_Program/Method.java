package OOPS_Program;

class Test{
	void display(){
		System.out.println("Display");
	}
	static void show(){
		System.out.println("Show");
	}
	
}
public class Method {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test t=new Test();
		t.display();
		t.show();
		
		Test.show(); // Because of Static method don't have to create instance

	}

}
