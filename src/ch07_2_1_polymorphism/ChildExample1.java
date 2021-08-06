package ch07_2_1_polymorphism;

public class ChildExample1 {

	public static void main(String[] args) {
		Child1 child1 = new Child1(null);
		
		Parent1 parent1 =child1;
		
		parent1.method1();
		parent1.method2();
		child1.method3();
	
		
		

	}

}
