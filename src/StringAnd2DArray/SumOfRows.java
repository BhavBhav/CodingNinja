package StringAnd2DArray;

import java.util.Scanner;

public class SumOfRows {

	public static void main(String[] args) {
		 Scanner scan = new Scanner(System.in);
	        int m = scan.nextInt();
	        int n = scan.nextInt();
	        
	        int[][] arr = new int[m][n];
	        for(int i=0; i<m; i++){
	            for (int j=0;j<n;j++){
	                arr[i][j]= scan.nextInt();
	            }
	        }
	        for(int i=0; i<m; i++){
	        	int sum = 0;
	            for (int j=0;j<n;j++){
	                
	                sum= sum+arr[i][j];
	                
	            }
	            System.out.print(sum+ " ");
	        }
	        
	     

	}

}
