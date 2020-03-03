package ConditionalAndLoops;

import java.util.Scanner;

public class PatterRightSide {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int i=1;
       // int j=1;
        
        while(i<=n){
        	int j =1;
        	int val =i;
            while(j<=i){
            	
                System.out.print(val+" ");
                val = val+1;
                j=j+1;
            }
            System.out.println();
            i =i+1;
        }
		
		
        
		


	}

}
