package OOPS_Program;
class Animal{
	void size() {
		System.out.println("Sizeing...");
	}
}
class Dog extends Animal{
	void bark() {
		System.out.println("Barking...");
	}
}
class Cat extends Dog{
	void meow() {
		System.out.println("Meoww...");
	}
}
public class Test_Inheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cat c=new Cat();
		c.size();
		c.bark();
		c.meow();
		

	}

}
