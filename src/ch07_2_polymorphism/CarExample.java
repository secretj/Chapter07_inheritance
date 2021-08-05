package ch07_2_polymorphism;

public class CarExample {

	public static void main(String[] args) {
		Car car =new Car();
		
		for(int i=0; i<5;i++) {
			int problemLocation = car.run();
			
			switch(problemLocation) {
			case 1:
				System.out.println("�տ��� �ѱ�Ÿ�̾� ��ü");
				car.frontLeftTire = new HankookTire("�տ���",15);
				break;
				
			case 2:
				System.out.println("�� ������ ��ȣŸ�̾�� ��ü");
				car.frontRightTire =new KumhoTire("�տ�����", 13);
				break;
				
			case 3:
				System.out.println("�� ���� �ѱ�Ÿ�̾�� ��ü");
				car.backLeftTire = new HankookTire("�ڿ���", 14);
				break;
				
			case 4:
				System.out.println("�� ������ ��ȣŸ�̾�� ��ü");
				car.backRightTire = new KumhoTire("�ڿ�����", 17);
				break;	
				
			}
			System.out.println("=======================");
			
			}

	}

}
