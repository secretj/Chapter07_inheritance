package ch07_2_2_polymorphism;

public class ChildExample {

	public static void main(String[] args) {
		Parent parent = new Child();		//이게 Parent를 child안에 정의한다는건가
		parent.field1 = "data1";
		parent.method1();
		parent.method2();
		
		
		Child child = new Child();
		child.field2 = "yyy";
		
		
//		
//		Child child =(Child) parent;
//		child.field2 ="yyy";
//		child.method3();
	}

}
