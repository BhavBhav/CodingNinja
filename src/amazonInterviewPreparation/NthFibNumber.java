package amazonInterviewPreparation;

import java.util.Scanner;

public class NthFibNumber {
	
	public static void printNumer(int n) {
		
		int i = 1;
		int j = 1;
		int sum = 0;
		for (int j2 = 2; j2 < n; j2++) {
			sum = i + j;
			j = i;
			i = sum;
			
		}
		System.out.println(sum);
		
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		printNumer(num);
		
		scan.close();

	}

}
