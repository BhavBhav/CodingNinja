package amazonInterviewPreparation;

import java.util.Scanner;

public class APorSum {
	
	public static int product(int n) {
		int prod = 1;
		for (int i = 1; i <= n; i++) {
			prod = prod * i;
		}
		return prod;
	}
	
	public static int sum(int n) {
		int sum =0;
		for (int i = 1; i <=n ; i++) {
			sum += i;
		}
		return sum;
	}

	public static void main(String[] args) {
	
		
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		int choice = scan.nextInt();
		
		switch (choice) {
		case 1:
			System.out.println(sum(num));
			break;
		case 2:
			System.out.println(product(num));

		default:
			break;
		}
		
		scan.close();

	}

}
