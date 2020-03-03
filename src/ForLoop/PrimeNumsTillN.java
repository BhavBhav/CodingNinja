package ForLoop;

import java.util.Scanner;

public class PrimeNumsTillN {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        scan.close();
        boolean divided = false;
        for (int i =1;  i <= n; i++){
           int j =1;
           for (j=1; j <= i-1 ; j++){
        	   int d =2;
        	   if (j% d ==0) {
        		   divided = false;
        	   }
        	   d++;
        	   
           }
           System.out.println(j);
            
            
            
            
            
        }

	
	}
}
