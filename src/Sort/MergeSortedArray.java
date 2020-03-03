package Sort;

import java.util.Scanner;

public class MergeSortedArray {
	public static int[] merge(int arr1[], int arr2[]){
		int size3= arr1.length+ arr2.length;
        int[] arr3 = new int[size3];
        int i=0,j=0,k=0;
        while(k<size3){
        while(i < arr1.length-1 && j< arr2.length-1){
            if(arr1[i]<arr2[j]){
                arr3[k]= arr1[i];
                i++;
            }
            else{
                arr3[k]=arr2[j];
                j++;
            }
            
        }
            k++;
        }
        return arr3;
	}
    public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
        int arrSize1 = scan.nextInt();
        int[] arr1= new int[arrSize1];
        for (int i=0;i<arrSize1;i++ ){
            arr1[i]=scan.nextInt();
        }
        int arrSize2 = scan.nextInt();
        int[] arr2= new int[arrSize2];
        for (int i=0;i<arrSize2;i++ ){
            arr2[i]=scan.nextInt();
        }
        
        merge(arr1,arr2);
        
	}
}
