package amazonInterviewPreparation;

public class Recursion_NumberOfDigits {
	
	public static int numberOfDigits(int n) {
		
		if(n == 0) {
			return 0;
		}
		int num = numberOfDigits(n/10);
		return num+1;
	}

	public static void main(String[] args) {
		
		System.out.println(numberOfDigits(1064));
	}

}
