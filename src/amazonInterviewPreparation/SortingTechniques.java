package amazonInterviewPreparation;

public class SortingTechniques {

	public static void selectionSort(int[] arr) {
		System.out.println("============Printing by Selection Sort=====");
		for (int i = 0; i < arr.length; i++) {
			int smallest = Integer.MAX_VALUE;
			int k = 0;
			//int temp = 0;
			for (int j = i; j < arr.length; j++) {
				//k= 0;
				if(smallest > arr[j]) {
					smallest = arr[j];	
					k = j;
				}
			}
			int temp = arr[i];
			arr[i]= arr[k];
			arr[k] = temp;

		}
		for (int i : arr) {
			System.out.print(i+" ");
		}

	}


	public static void main(String[] args) {
		int[] arr = {1,2,13,4,7,2,5,7,40,16};
		selectionSort(arr);
		System.out.println();
		bubbleSort(arr);
		System.out.println();
		insertionSort(arr);
	}


	private static void insertionSort(int[] arr) {
		System.out.println("============Printing by Insertion Sort=====");
		
		for (int i = 1; i < arr.length-1; i++) {
			int temp = arr[i];
			int j = i;
			while((j >= 0)&& arr[j-1]> arr[i]){
				arr[j] = arr[j-1];
				j--;
			}
			temp = arr[j];
			
		}
		
		for (int i : arr) {
			System.out.print(i+" ");
		}
		
	}


	private static void bubbleSort(int[] arr) {
		System.out.println("============Printing by Bubble Sort=====");
		for (int i = 0; i < arr.length; i++) {
			
			for (int j = 0; j < arr.length-1-i; j++) {
				if(arr[j] > arr[j+1]) {
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
		for (int i : arr) {
			System.out.print(i+" ");
		}
	}

}
