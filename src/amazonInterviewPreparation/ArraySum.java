package amazonInterviewPreparation;

import java.util.Scanner;

public class ArraySum {
	
	public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();
        int[] arr = new int[size];
        for (int i=0;i<arr.length;i++){
            arr[i] = scan.nextInt();
        }
        System.out.println((sum(arr)));
        scan.close();
    }

	private static int sum(int[] arr) {
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
		return sum;
	}

}
