package Recursion_1;

public class SumOfDigits {
	
	public static int sumOfDigits(int input){
		if (input<=0) {
			return input;
		}
		int m=input%10;
		input = input/10;
		return m+sumOfDigits(input);
		
	}
	

	public static void main(String[] args) {
		System.out.println(sumOfDigits(123456));

	}

}
