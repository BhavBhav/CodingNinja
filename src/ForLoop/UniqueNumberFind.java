
package ForLoop;

import java.util.Scanner;

public class UniqueNumberFind {

		public static int findUnique(int[] arr){
			int k=0;
			for(int i=0; i<arr.length;i++){
                k=0;
	            for(int j=0; j<arr.length;j++){
	                if(arr[i]==arr[j])
                        k++;
	            }
                if(k==1){
                    k=arr[i];
                    break;
                }
	        } 
        return k;
	    }      
	      
	    
	    public static void main(String[] args){
	        Scanner scan = new Scanner(System.in);
	        int size = scan.nextInt();
	        int[] arr = new int[size];
	        for (int i=0; i<size;i++){
	            arr[i]= scan.nextInt();
	        }
	       System.out.println(findUnique(arr));
	    }
	}

