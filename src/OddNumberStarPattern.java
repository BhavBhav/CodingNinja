import java.util.Scanner;

public class OddNumberStarPattern {
	
	public static void oddNumberStarPrint(int n) {
		int i = 1;
		int firstNumber = 1;
		int lastNumber = 2 * n - 1;
		int temp = firstNumber;
		int startingNumberOfTheRow = 1;
		while ( i <= n) {
			temp = startingNumberOfTheRow;
			int j = 1;
			while(j <= n) {
				
				if(temp <= lastNumber) {
					System.out.print(temp);
				}
				else {
					temp = firstNumber;
					System.out.print(temp);
				}
				temp = temp + 2 ;
				
				j++;
			}
			startingNumberOfTheRow = startingNumberOfTheRow + 2;
			i++;
			System.out.println();
		}
		
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		oddNumberStarPrint(n);
		scan.close();
		
	}

}
