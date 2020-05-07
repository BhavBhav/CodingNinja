package amazonInterviewPreparation;

import java.util.Scanner;

public class TriangleNumberPattern {



	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		/*pattern(num);
		patterStart(num);
		reverseNumberPatter(num);
		charPattern1(num);
		charPattern2(num);
		descendingPatten(num);
		rightAngledStar(num);
		invertedTriangle(num);*/
		trianglePattern(num);
		scan.close();
	}

	private static void trianglePattern(int n) {

		int i = 1;
		while(i <= n) {
			int k = 1;
			while(k <= i-1) {
				System.out.print(" ");
				k++;
			}
			int t = 1; int temp = 1;
			while(t <= (n-i+1)) {
				System.out.print("*");
				t++;
			}
				i++;
			System.out.println();
		}


	}

	private static void charPattern2(int n) {
		System.out.println("----------");System.out.println("---------");
		int i = 1;

		while( i <= n) {
			int j = 1;
			char ch = (char) ('A'+i-1);
			while(j <= n) {
				System.out.print(ch);
				ch++;
				j++;
			}
			i++;
			System.out.println();
		}

	}

	private static void descendingPatten(int n) {
		System.out.println("----------");System.out.println("---------");
		int i = 1;

		while(i <= n) {
			int j = 1;
			char ch = (char) ('A'+n-i);
			while(j <= i) {
				System.out.print(ch);
				ch++;
				j++;
			}

			i++;
			System.out.println();
		}
	}

	private static void charPattern1(int n) {
		System.out.println("----------");System.out.println("---------");
		int i = 1;
		while(i <= n) {
			int j = 1;
			char ch = 'A';
			while(j <= n) {
				System.out.print((char)(ch+j-1));
				j++;

			}

			i++;
			System.out.println();
		}

	}

	private static void reverseNumberPatter(int num) {
		System.out.println("----------");System.out.println("---------");
		int i = 1;

		while(i <= num) {
			int k = 1;
			int temp = i;
			while(k <= i) {
				System.out.print(temp);
				temp--;
				k++;
			}


			i++;
			System.out.println();
		}

	}

	private static void patterStart(int num) {
		System.out.println("----------");System.out.println("---------");
		int i = 1;

		while( i <= num) {
			int k = 1;
			int m = i;
			while(k <= i) {
				System.out.print(m);
				m++;
				k++;
			}

			i++;
			System.out.println();
		}
	}


	private static void pattern(int num) {
		System.out.println("----------");System.out.println("---------");
		int i =1;
		int j = 1;
		while(i <= num) {
			int k = 1;
			while(k <= i) {
				System.out.print(j);
				j++;
				k++;
			}

			i++;
			System.out.println();
		}

	}

	private static void rightAngledStar(int n) {
		System.out.println("----Printing right angled star------");
		int i = 1;

		while(i <= n) {
			int j = n-i;
			while(j > 0) {
				System.out.print(" ");
				j--;
			}
			int star = 1;
			while(star <= i) {
				System.out.print("*");
				star++;
			}



			i++;
			System.out.println();
		}


	}

	private static void invertedTriangle(int n) {
		System.out.println("----Printing right angled star------");

		int i = 1;

		while(i <= n) {

			int spaces = 0;
			while(spaces < i-1) {
				System.out.print(" ");
				spaces++;
			}

			int star = 1;

			while(star <= n-i+1) {
				System.out.print("*");
				star++;
			}

			i++;
			System.out.println();
		}


	}

}
