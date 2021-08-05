package ch07_2_polymorphism;

public class Tire {
	
	public int maxRotation;
	public int accumulatedRotation;
	public String location;
	
	public Tire(String location, int maxRotation) {
		this.location =location;
		this.maxRotation = maxRotation;
	}
	
	public boolean roll() {
		++accumulatedRotation;
		if(accumulatedRotation<maxRotation) {
			System.out.println(location +"Tire ¼ö¸í:"+(maxRotation-accumulatedRotation)+"È¸");
			return true;
		}else {
			System.out.println("***"+ location + "TIRE ÆãÅ© ***");
			return false;
		}
	}

}
