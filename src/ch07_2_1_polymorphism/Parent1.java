package ch07_2_1_polymorphism;

public class Parent1 {
	String Charactor;
	public Parent1(String charactor) {
		this.Charactor= charactor;
	}

	public void method1() {
		System.out.println("Parent-method1()");
	}
	
	public void method2() {
		System.out.println("Parent-method2()");
	}
	
	public void act() {
		System.out.println(Charactor);
	}

}
