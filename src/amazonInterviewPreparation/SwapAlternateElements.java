package amazonInterviewPreparation;

public class SwapAlternateElements {
	
	
	
	public static void swapAlternate(int[] arr) {
		System.out.println("Before Swapping");;
		for(int i : arr) {
			System.out.print(i +" ");
		}
		int temp = 0;
		for (int i = 0; i < arr.length-1; i++) {
			temp = arr[i];
			arr[i]= arr[i+1];
			arr[i+1] = temp;
			i++;
			continue;
		}
		System.out.println("After Swapping");;
		for(int i : arr) {
			System.out.print(i +" ");
		}
		
	}

	public static void main(String[] args) {
		int[] arr = {9,3,6,12,4,32,5,11};
		swapAlternate(arr);

	}

}
