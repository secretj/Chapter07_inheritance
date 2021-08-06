package ch07_1_inheritance;

public class Computer extends Calculator{
	
	@Override
	double areaCircle(double r) {
		System.out.println("com°´Ã¼ÀÇ areaCircle()½ÇÇà");
		return Math.PI*r*r;
	}

}
