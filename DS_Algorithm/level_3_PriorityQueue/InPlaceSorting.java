package level_3_PriorityQueue;

public class InPlaceSorting {

	public static void inplaceHeapSort(int input[]) {
		int parentIndex = 0;
		int index = 1;
		for (int i = 1; i < input.length; i++) {
			index = i;
			while(index > 0) {
				parentIndex = (index - 1 ) / 2;
				if(input[index] <= input[parentIndex]) {
					int temp = input[index];
					input[index] = input[parentIndex];
					input[parentIndex] = temp;

				}
				index = parentIndex;
				//parentIndex = (index - 1 ) / 2;
			}
		}
		heapSort(input);
	}


	private static void heapSort(int[] input) {
		int l = input.length;
		for (int i = 0; i < input.length; i++) {
			int homeIndex = 0;
			int temp = input[homeIndex];
			input[homeIndex] = input[l-i-1];
			input[l-i-1] = temp;
			int parentIndex = homeIndex;
			int leftChildIndex =  1;
			int rightChildIndex = 2;
			int index = leftChildIndex;
			if(input[rightChildIndex] < input[leftChildIndex]) {
				index = rightChildIndex;
			}
			while(leftChildIndex < (l-i-1)) {
				index = leftChildIndex;
				if(rightChildIndex < (l-i-1) 
						&& input[rightChildIndex] < input[leftChildIndex]) {
					index = rightChildIndex;
				}
				if(input[parentIndex] >= input[index]) {
					int swapVar = input[index];
					input[index] = input[parentIndex];
					input[parentIndex] = swapVar;
				}
				parentIndex = index;
				leftChildIndex = (2 * parentIndex) + 1;
				rightChildIndex = (2 * parentIndex) + 2;
			}

		}

	}


	public static void main(String[] args) {
		int[] arr = {20,5,15,5,1,20,16};
		inplaceHeapSort(arr);
		for (int i : arr) {
			System.out.print(i +" ");
		}
	}
}
