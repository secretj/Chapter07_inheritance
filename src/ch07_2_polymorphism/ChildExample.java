package ch07_2_polymorphism;

class Parent{
	String p_str = "Parent String....";
	
	void print(){
		System.out.println(p_str);
	}

}

class Child extends Parent{
	
	String c_str = "Child String ....";
	
	
	void print() {
		System.out.println(c_str);
	}
	
	void display() {
		System.out.println('¢¾');
	}
}


public class ChildExample {
	public static void main(String[] args) {
		Child ch = new Child();
		ch.display();
		ch.print();
		System.out.println(ch.p_str);  
		
}
}
