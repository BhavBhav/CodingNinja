package level_3_PriorityQueue;

import java.util.PriorityQueue;

public class KthLargestElement {
	
	public static int kthLargest(int arr[], int k) {
		PriorityQueue<Integer> pq = new PriorityQueue<>(k);
		for(int i : arr) {
			pq.add(i);
			if(pq.size() > k ) {
				pq.poll();
			}
			
		}
		return pq.peek();
	}

	public static void main(String[] args) {
		int[] arr  = { 4,1,2,9,6,8};
		int k = 3;
		System.out.println(kthLargest(arr, k));

	}

}
