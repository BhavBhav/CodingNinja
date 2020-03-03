package ConditionalAndLoops;

import java.util.Scanner;

public class EvenOddDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

        Scanner scan = new Scanner(System.in);
        /*int n = scan.nextInt();
        int sum=0;
        int sum1 = 0; 
        while(n > 0){
            int k = n%10;
            if((k%2) == 0){
                sum =sum+k;
                
            } else{
                sum1 = sum1+k;
                
            }
            n=n/10;
        } System.out.print(sum +"   "+sum1);*/
        
        
        int n=scan.nextInt();
        int i=1;
        
        while(i<n){
            int j=1;
           while(j<=n){
               
               System.out.print(n);
               j++;
           }
           System.out.println();
           i++;
            
        }
        

	}

}
