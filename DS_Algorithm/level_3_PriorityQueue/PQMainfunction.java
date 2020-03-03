package level_3_PriorityQueue;

import java.util.Scanner;

public class PQMainfunction {

	public static void main(String[] args) {
		PriorityQueue_Simple pq = new PriorityQueue_Simple();
		Scanner s = new Scanner(System.in);
		int choice = s.nextInt();
		while(choice != -1) {
			switch(choice) {
				case 1 : // insert
					int element = s.nextInt();
					pq.insert(element);
					break;
				case 2 : // getMin
				try {
					System.out.println(pq.getMin());
				} catch (PriorityQueueException e) {
					return;
				}
					break;
				case 3 : // removeMin
				try {
					System.out.println(pq.removeMin());
				} catch (PriorityQueueException e) {
					return;
				}
					break;
				case 4 : // size
					System.out.println(pq.size());
					break;
				case 5 : // isEmpty
					System.out.println(pq.isEmpty());
				default :
						return;
			}
			choice = s.nextInt();
		}
		s.close();

	}

}
