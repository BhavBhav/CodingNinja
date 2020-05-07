import java.util.Scanner;

public class Parallelogram {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		int n = scan.nextInt();
		int i = 1;

		while(i <= n) {
			int j =1;
			while(j<i) {
				System.out.print(" ");
				j++;
			}
			int star = 1;
			while(star <= n) {
				System.out.print("*");
				star++;
			}
			System.out.println();
			i++;
		}

		scan.close();
	}

}
