package amazonInterviewPreparation;

import java.util.Scanner;

public class PrintNumberBwRange {
	
	public static void main(String[] args) {
		
		
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		for (int i = 2; i <= num; i++) {
			
			int occurance = 0;
			for(int j =1; j<=num; j++) {
				
				if( i % j == 0) {
					occurance++;
				}
				
				
				
			}
			if(occurance <= 2) {
				System.out.println(i);
			}
			
			
		}
		scan.close();
	}

}
