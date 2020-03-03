package ConditionalAndLoops;

import java.util.Scanner;

public class DiamondShape {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int i=1;
		int m= (n+1)/2;
		if(n%2!=0){
			while(i<=n){
				while(i<=m){
					int j=1;
					while(j<=(m-i)){
						System.out.print(" ");
						j++;
					}
					j=1;
					while(j<=(2*i)-1){
						System.out.print("*");
						j++;

					}
					System.out.println();
					i++;

				} while(i<=n) {
					int j=1;
					int k = i-m;
					while(j<=k) {
						System.out.print(" ");
						j++;
					}
					j=1;
					while(j<=(2*(n-i)+1)) {
						System.out.print("*");
						j++;
					}
					System.out.println();
					i++;
				}


			}
		}

	}
}
