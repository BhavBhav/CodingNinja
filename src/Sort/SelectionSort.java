package Sort;

import java.util.Scanner;

public class SelectionSort {
	public static void bubbleSort(int[] arr){
		
        
        for (int i=0;i<arr.length;i++ ){
            for (int j=0; j<arr.length-2-i;j++){
                if(arr[j]>arr[j+1]){
                    int temp =0;
                    temp = arr[j+1];
                    arr[j+1]= arr[j];
                    arr[j]=temp;
                }
                 }
        }
        }

	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
        int arrSize = scan.nextInt();
        int[] arr= new int[arrSize];
        for (int i=0;i<arrSize;i++ ){
            arr[i]=scan.nextInt();
        }
        bubbleSort(arr);
        for (int i=0;i<arr.length;i++) {
        	System.out.print(arr[i]+ " ");
        }
	}

}
