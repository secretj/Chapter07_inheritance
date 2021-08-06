package ch07_1_inheritance;

public class DmbCellPhoneExample {

	public static void main(String[] args) {
		DmbCellPhone dmbCellPhone = new DmbCellPhone("자바폰", "검정", 10);
		
		System.out.println("모델: "+dmbCellPhone.model);
		System.out.println("색상: "+dmbCellPhone.color);
		
		
		
		System.out.println("채널: "+ dmbCellPhone.channel);
		
		dmbCellPhone.powerOn();
		dmbCellPhone.powerOff();
		dmbCellPhone.sendVoice("여보세요.");
		dmbCellPhone.receiveVoice("안녕하세요 ! 저는 진형이에요.");
		dmbCellPhone.sendVoice("하이");
		dmbCellPhone.hangUp();
		
		
		dmbCellPhone.turnOnDmb();
		dmbCellPhone.changeChannelDmb(12);
		dmbCellPhone.turnOffDmb();
	}
	
	

}
