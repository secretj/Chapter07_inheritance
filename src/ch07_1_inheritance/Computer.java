package ch07_1_inheritance;

public class Computer extends Calculator{
	
	@Override
	double areaCircle(double r) {
		System.out.println("com��ü�� areaCircle()����");
		return Math.PI*r*r;
	}

}
