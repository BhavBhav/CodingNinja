package amazonInterviewPreparation;

public class Recursion_PrintNumber {

	public static void main(String[] args) {
		System.out.println("By Recursion answer is ");
		printNaturalNumbers(5);

	}

	private static void printNaturalNumbers(int n) {
		
		if(n == 1) {
			System.out.println(n);
			return;
		}
		
		printNaturalNumbers(n-1);
		System.out.println(n);
		
		
	}

}
