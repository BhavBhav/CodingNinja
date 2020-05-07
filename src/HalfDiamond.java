import java.util.Scanner;

public class HalfDiamond {

	public static void ascendingStar(int n) {
		if(n==1) {
			System.out.print("*");
			return;
		}
		System.out.print("*");
		int i = 1;
		int j= 0;
		while(i < n) {
			System.out.print(i);
			i++;
			j = i;
		}
		int lastNum = j - 2;
		while(lastNum>=1) {
			System.out.print(lastNum);
			lastNum--;
		}
		System.out.print("*");

	}
	
	public  void check() {
		System.out.println("I m in Super class");
	}

	public static void descendingStar(int n, int input) {
		int k = input + 1 - n;
		ascendingStar(k);
	}
	public static void main(String[] args) {
		
	
		Scanner scan = new Scanner (System.in);
		int n = scan.nextInt();
		int i = 1;
		while(i <= 2 * n + 1) {
			if(i <= (2*n + 1)/2) {
				ascendingStar(i);
			}
			else {
				descendingStar(i,(2 * n + 1) );
			}
			System.out.println();

			i++;
		}



		scan.close();

	}

}
