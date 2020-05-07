import java.util.Scanner;

public class SumInPattern {
	
	public static void printSumPattern(int n) {
		int i = 1;
		int sum = 0;
		while( i <= n) {
			if(i != n ) {
			System.out.print(i+ "+");
			}
			else {
				System.out.print(i);
			}
			sum = sum + i;
			i++;
		}
		System.out.print("="+sum);
		
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		int n = scan.nextInt();
		int i = 1;
		while(i <= n) {
		printSumPattern(i);
		System.out.println();
		i++;
		}
		scan.close();
	}

}
