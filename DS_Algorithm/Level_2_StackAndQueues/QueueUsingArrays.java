package Level_2_StackAndQueues;

public class QueueUsingArrays {
	private int[] data;
	private int rear;
	private int front;
	private int size;

	public QueueUsingArrays() {
		data = new int[3];
		rear = -1; //if front is 0 then 1 element is present so -1.
		front = -1;
		size= 0;
	}
	
	public QueueUsingArrays(int capacity) {
		data = new int[capacity];
		rear = -1; //if front is 0 then 1 element is present so -1.
		front = -1;
		size= 0;
	}
	
	int size() {
		return size;
	}
	boolean isEmpty() {
		return size==0;
	}
	int front() throws QueueEmptyException {
		if(size==0) {
			throw new QueueEmptyException();
		}
		return data[front];

	}
	void enQueue(int element) throws QueueFullException {
		if(size()==data.length) {
			//throw new QueueFullException();
			doubleCapacity();
		}
		if(size==0) {
			front = 0;
		}
		size++;

		rear = (rear+1) % data.length;
		/* rear++;
		if(rear == data.length) {
			rear =0;
		}*/
		data[rear] = element;

	}
	private void doubleCapacity() {
		int[] temp= data;
		data = new int[2*temp.length];
		int index=0;
		for (int i = front; i < temp.length; i++) {
			data[index]=temp[i];
			index++;
		}
		for (int i = 0; i <= front-1; i++) {
			data[index]=temp[i];
			index++;
		}
		front=0;
		rear= temp.length - 1;
	}

	int deQueue() throws StackEmptyException {
		if(size==0) {
			throw new StackEmptyException();
		}

		int temp = data[front];
		front = (front+1) % data.length;
		/*front++;
		if(front == data.length){
			front = 0;
		}*/
		size--;
		if(size==0) {
			front = -1;
			rear = -1;
		}

		return temp;
	}
}
