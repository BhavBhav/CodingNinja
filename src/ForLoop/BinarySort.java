package ForLoop;

import java.util.Scanner;

public class BinarySort {

	
public static void sortBinaryArray(int[] arr){
        
	int z=0;
    int o=0;
    int i=0;
	for(i=0;i<arr.length;i++){
        if (arr[i]==0){
            z++;
        } else o++;
	}
        int k=0;
        while (k<z) {
        	arr[k]=0;
        	k++;
        }
        for (int s=z;s<arr.length;s++) {
        	arr[s]=1;
        }
        
	}

	
       
	//System.out.println(z+""+o);
	
	
		
	
    
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int size1 = scan.nextInt();
        int[] arr1 = new int[size1];
        for (int i=0; i<size1; i++){
            arr1[i]= scan.nextInt();
        }
       
       sortBinaryArray(arr1);
       for (int i=0;i<arr1.length;i++) {
    	   System.out.print(arr1[i]+ " ");
       }
    }

}
