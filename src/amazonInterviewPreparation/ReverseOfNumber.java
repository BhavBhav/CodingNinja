package amazonInterviewPreparation;

import java.util.Scanner;

public class ReverseOfNumber {

	public static int reverseNum(int n) {
		int num = 0;
		while( n > 0) {
		int rem  = n % 10;
		
		num = (num * 10 ) + rem;
		n = n/ 10;
		}
		
		return num;
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		
		System.err.println(reverseNum(num));
		scan.close();
	}

}
