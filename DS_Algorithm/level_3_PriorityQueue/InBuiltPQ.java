package level_3_PriorityQueue;

import java.util.PriorityQueue;

public class InBuiltPQ {
	
	public static void kSortedArray(int[] arr, int k) {
		PriorityQueue<Integer> pq = new PriorityQueue<>();
		int i = 0;
		for (; i < k; i++) {
			pq.add(arr[i]);
		}
		for( ; i<arr.length ; i++) {
		arr[i - k] = pq.remove();
		pq.add(arr[i]);
		}
		for (int j = i - k; j < arr.length; j++) {
			arr[j] = pq.remove();
		}
	}

	public static void main(String[] args) {
		int[] arr  = { 4,1,2,9,6,8};
		int k = 3;
		kSortedArray(arr, k);
		for(int i : arr) {
			System.out.print(i + " ");
		}
	}

}
