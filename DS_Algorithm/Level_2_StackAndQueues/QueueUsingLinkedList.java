package Level_2_StackAndQueues;

public class QueueUsingLinkedList<T> {
	private Node<T> front;
	private Node<T> rear;
	int size;

	public QueueUsingLinkedList() {
		front = null;
		rear = null;
		size = 0;
	}

	public int size() {
		return size;
	}

	public boolean isEmpty() {
		return size==0;
	}

	public T front() throws QueueEmptyException {
		if(size == 0) {
			throw new QueueEmptyException();
		}
		T temp = front.data;
		return temp;
	}
	public void enqueue(T data) {

		Node<T> temp = new Node<T>(data);
		if(size==0) {
			front = temp;
			rear = temp;
		}
		else {
			Node<T> tempRear = rear;
			tempRear.next = temp;
			rear = temp;
		}
		size++;
	}


	public T dequeue() throws QueueEmptyException {
		
		if(size==0) {
			throw new QueueEmptyException();
		}
		T temp= front.data;
		if(front.next == null) {
			front = null;
			rear = null;
			size--;
			return temp;
		}
		front = front.next;
		size--;
		
		return temp;
	}



}
