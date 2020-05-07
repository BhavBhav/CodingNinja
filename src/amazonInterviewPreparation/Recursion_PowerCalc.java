package amazonInterviewPreparation;

public class Recursion_PowerCalc {
	
	public static int calculatePower(int base, int power) {
		
		if(power == 0) {
			return 1;
		}
		
		int ans = calculatePower(base, power-1) * base;
		
		return ans;
	}
	
	

	public static void main(String[] args) {
		System.out.println("By Recursion answer is "+calculatePower(5, 0));
		System.out.println("By Recursion answer is "+calcuatePowerByIteration(5,0));
	}



	private static int calcuatePowerByIteration(int base, int power) {
		int ans = 1;
		for (int i = 1; i <= power; i++) {
			ans = ans  * base; 
		}
		return ans;
	}

}
