package level_3_PriorityQueue;

import java.util.ArrayList;

public class MaxPriorityQueue {
	private ArrayList<Integer> heap;

	public MaxPriorityQueue() {
		heap = new ArrayList<Integer>();
	}

	public int getSize() {
		return heap.size();
	}

	public boolean isEmpty() {
		return heap.size() == 0;
	}

	public int getMax() throws PriorityQueueException{
		if(heap.size() == 0) {
			return Integer.MIN_VALUE;
		}
		return heap.get(0);
	}

	public void insert(int element) {
		heap.add(element);
		int childIndex = heap.size() - 1;
		int parentIndex = (childIndex - 1) / 2;
		while( childIndex > 0) {
			if ( heap.get(childIndex) > heap.get(parentIndex)) {
				int temp = heap.get(childIndex);
				heap.set(childIndex, heap.get(parentIndex));
				heap.set(parentIndex, temp);
				childIndex = parentIndex;
				parentIndex  = (childIndex - 1) / 2;
			}else {
				return;
			}
		}
	}

	public int removeMax() throws PriorityQueueException {
		if(heap.size() == 0) {
			throw new PriorityQueueException();
		}
		int temp = heap.get(0);
		heap.set(0, heap.get(heap.size() - 1));
		heap.remove(heap.size() - 1);
		int index = 0, parentIndex = 0;
		int leftIndex = 1; 
		int rightIndex = 2;
		if(rightIndex < heap.size() && heap.get(leftIndex) >  heap.get(rightIndex)) {
			index = leftIndex;
		}
		if(rightIndex < heap.size() && heap.get(leftIndex) <  heap.get(rightIndex)) {
			index = rightIndex;
		}
		while(leftIndex < heap.size()) {
			if ( heap.get(index) > heap.get(parentIndex)) {
				int tempSwap = heap.get(index);
				heap.set(index, heap.get(parentIndex));
				heap.set(parentIndex, tempSwap);
				parentIndex = index;
				leftIndex = (2 * parentIndex) + 1;
				rightIndex = (2 * parentIndex) + 2;
				if(rightIndex < heap.size() && heap.get(leftIndex) >  heap.get(rightIndex)) {
					index = leftIndex;
				}
				if(rightIndex < heap.size() && heap.get(leftIndex) <  heap.get(rightIndex)) {
					index = rightIndex;
				}

			}else {
				break;
			}
		}

		return temp;
	}
}
