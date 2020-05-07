package amazonInterviewPreparation;

import java.util.Scanner;

public class AddNumbersInBetween {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();
        
        addNumbersArray(size);
        
        scan.close();

	}

	private static void addNumbersArray(int n) {
		int temp =  1;
		int[] arr = new int[n];
		for (int i = 0; i < arr.length/2; i++) {
			arr[i] = temp++;
			arr[n-i-1] = temp++;
			//temp++;
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
 		
	}

}
