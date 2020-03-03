package level_3_PriorityQueue;

import java.util.ArrayList;
import java.util.PriorityQueue;

public class KLargestElement {
	
	public static ArrayList<Integer> kLargest(int input[], int k) {
		PriorityQueue<Integer> pq = new PriorityQueue<>(k);
		ArrayList<Integer>  list = new ArrayList<>();
		//int i = 0;
		for( int i : input) {
			pq.add(i);
			
			if ( pq.size() > k ) {
				pq.remove();
			}
		}
		for( int i = 0; i < k ; i++) {
			list.add(pq.remove());
		}
		return list;
		
		
	}

	public static void main(String[] args) {
		int[] arr = {2,12,9,16,10,5,3,20,25,11,1,8,6};
		kLargest(arr, 4);
		
	}

}
