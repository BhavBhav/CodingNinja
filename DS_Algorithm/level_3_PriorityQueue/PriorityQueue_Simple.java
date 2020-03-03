package level_3_PriorityQueue;

import java.util.ArrayList;

public class PriorityQueue_Simple {
	private ArrayList<Integer> heap;

	public PriorityQueue_Simple() {
		heap = new ArrayList<>();
	}

	boolean isEmpty() {
		return heap.size() == 0;
	}

	int size() {
		return heap.size();
	}

	int getMin() throws PriorityQueueException {
		if(heap.isEmpty()) {
			throw new PriorityQueueException();
		}
		return heap.get(0);
	}

	void insert(int element) {
		heap.add(element);
		int childIndex = heap.size() - 1;
		int parentIndex = (childIndex - 1) / 2;

		while(childIndex > 0) {
			if(heap.get(childIndex) < heap.get(parentIndex)) {
				int temp = heap.get(childIndex);
				heap.set(childIndex, heap.get(parentIndex));
				heap.set(parentIndex, temp);
				childIndex = parentIndex;
				parentIndex = (childIndex - 1) / 2;
			}
			else {
				return;
			}
		}
	}

	int removeMin() throws PriorityQueueException{
		if(heap.isEmpty()) {
			throw new PriorityQueueException();
		}
		int returnValue = heap.get(0);
		heap.set(0, heap.get(heap.size()-1));
		heap.remove(heap.size() - 1);
		int parentIndex = 0;
		int childIndexLeft = 1;
		int childIndexRight =  2;
		int childIndex = childIndexLeft;
		if(childIndexRight < heap.size()){
		if(heap.get(childIndexLeft) > heap.get(childIndexRight)) {
			childIndex = childIndexRight;
		}
		}
		while(childIndexLeft <  heap.size()) {
			if(heap.get(childIndex) < heap.get(parentIndex)) {
				int temp = heap.get(childIndex);
				heap.set(childIndex, heap.get(parentIndex));
				heap.set(parentIndex, temp);
				parentIndex = childIndex;
				childIndexLeft = (2 * parentIndex) + 1;
				childIndexRight = (2 * parentIndex) + 2;
				childIndex = childIndexLeft;
				if(childIndexRight < heap.size() && heap.get(childIndexLeft) > heap.get(childIndexRight)) {
					childIndex = childIndexRight;
				}
			}else {
				parentIndex = childIndex;
				childIndexLeft = (2 * parentIndex) + 1;
				childIndexRight = (2 * parentIndex) + 2;
				childIndex = childIndexLeft;
				if(childIndexRight < heap.size() && heap.get(childIndexLeft) > heap.get(childIndexRight)) {
					childIndex = childIndexRight;
				}
			}

		}
		return returnValue;
	}
}
