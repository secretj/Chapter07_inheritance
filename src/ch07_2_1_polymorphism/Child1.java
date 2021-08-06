package ch07_2_1_polymorphism;

public class Child1 extends Parent1{
	
public Child1(String charactor) {
		super(charactor);
	
	}

@Override
	public void method2() {
		System.out.println("Child1-method2()");
		
	}
	
	public void method3() {
		System.out.println("Child-method3()");
	}


}
