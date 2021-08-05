package ch07_2_polymorphism;

public class HankookTire extends Tire{
	
	

	public HankookTire(String location, int maxRotation) {
		super(location, maxRotation);
	}
	
	@Override
	public boolean roll() {
		++accumulatedRotation;
		if(accumulatedRotation<maxRotation) {
			System.out.println(location + "�ѱ�Ÿ�̾� ����:"+(maxRotation-accumulatedRotation)+"ȸ");
		return true;
		}else {
			System.out.println("***"+location + "�ѱ�Ÿ�̾� ��ũ ***");
			return false;
		}
	}

}
