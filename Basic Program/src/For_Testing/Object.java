package For_Testing;

public class Object {
	int $i=15;
	int i=5;
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Object obj1=new Object();
		Object obj2=new Object();
		
		obj2.i=10;
		
		System.out.println(obj1.i);
		System.out.println(obj2.$i);
		System.out.println(obj2.i);

	}

}
