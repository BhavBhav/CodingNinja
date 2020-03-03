package ForLoop;

import java.util.Scanner;

public class NumberAndChoice {

	public static void main(String[] args) {
		/*Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int choice = scan.nextInt();
        if (choice ==1){
            int sum = 0;
            for (int i=1; i<=n;i++){
                sum = sum +i; 
                
            }
            System.out.println(sum);
        } else if (choice ==2){
            int mul = 1;
            for (int i=1; i<=n;i++){
                mul  =mul*i;
               
            }
            System.out.println(mul);
        }
        else System.out.println("-1");
        
        */
		
		Scanner scan = new Scanner (System.in);
        int n = scan.nextInt();
        int i = 0;
        int rev = 0, rem =0;
        while (n>0){
            rem = n%10;
            n = n/10;
            rev = (rev*10)+ rem;
        }
        System.out.println(rev);
        String nun;
        

	}

}
