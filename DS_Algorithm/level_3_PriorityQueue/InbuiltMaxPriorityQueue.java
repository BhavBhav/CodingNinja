package level_3_PriorityQueue;

import java.util.Collections;
import java.util.Comparator;
import java.util.PriorityQueue;

class MaxPriorityQueueTest implements Comparator<Integer>{

	@Override
	public int compare(Integer arg0, Integer arg1) {
		if( arg0 < arg1 ) return 1;
		else if ( arg0 > arg1 ) return -1;
		else return 0;
	}
	
}

class StringLengthComparator implements Comparator<String>{

	@Override
	public int compare(String o1, String o2) {
		if(o1.length() < o2.length()) return 1;
		else if (o1.length() > o2.length()) return -1;
		else return 0;
	}
	
}
public class InbuiltMaxPriorityQueue {

	public static void main(String[] args) {
		String[] arr = {"this" , "at" , "a" , "their"};
		StringLengthComparator stringLengthComparator = new StringLengthComparator();
		PriorityQueue<String> pq = new PriorityQueue<>(stringLengthComparator);
		for (String i : arr) {
			pq.add(i);
			
		}
		while(! pq.isEmpty()) {
			System.out.print(pq.poll()+ " ");
		}
		
		
		MaxPriorityQueueTest maxPriorityQueueTest = new MaxPriorityQueueTest();
		PriorityQueue<Integer> pq1 = new PriorityQueue<>(maxPriorityQueueTest);
		
	}

}
