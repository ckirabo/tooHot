package tooHot;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a = 90;
		boolean isSummer = false;
		
		System.out.println(tooHot(a,isSummer));

	}
	
	public static boolean tooHot (int temp, boolean isSummer) {
		
		int minTemp;
		int maxTemp;
		
		
		if (isSummer == false) {
			minTemp = 60;
			maxTemp = 90;
			
			if((temp >= minTemp) && (temp <= maxTemp)) {
				return true;
			}
			else {
				return false;
			}
			
		}
		
		if (isSummer == true) {
			minTemp = 60;
			maxTemp = 100;
			
			if((temp >= minTemp) && (temp <= maxTemp)) {
				return true;
			}
			
			else {
				return false;
			}
			
		}
		return isSummer;
	
	
	}
	
	

}
