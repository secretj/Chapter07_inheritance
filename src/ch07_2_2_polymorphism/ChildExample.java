package ch07_2_2_polymorphism;

public class ChildExample {

	public static void main(String[] args) {
		Parent parent = new Child();		//�̰� Parent�� child�ȿ� �����Ѵٴ°ǰ�
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
