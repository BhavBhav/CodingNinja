package amazonInterviewPreparation;

import java.util.Scanner;

public class LinearSearch {

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();
        
        int[] arr =new int[size];
        for (int i = 0; i <size;i++ ){
             arr[i] = scan.nextInt();
        }
        int num = scan.nextInt();
       System.out.println( linearSearch(arr,num));
        
    }

	private static int linearSearch(int[] arr, int num) {
		
		for (int i = 0; i < arr.length; i++) {
			if(arr[i] == num) {
				return i;
			}
		}
		return -1;
		
	}

}
