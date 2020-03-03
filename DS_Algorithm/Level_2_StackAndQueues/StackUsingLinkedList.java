package Level_2_StackAndQueues;

public class StackUsingLinkedList<T> {
	private Node<T> head;
	private int size;


	public StackUsingLinkedList() {
		head = null;
		size = 0;
	}

	public int size() throws StackEmptyException {
		
		return size;
	}

	public void push(T data) {
		Node<T> newNode = new Node<T>(data);
		newNode.next = head;
		head = newNode;
		size++;

	}

	public boolean isEmpty() {
		if(head.next==null) {
			return true;
		}
		return false;
		
	}

	public T pop() throws StackEmptyException {
		T k = head.data;
		head= head.next;
		size--;
		return k;
		
	}

	public T top() throws StackEmptyException {
		return head.data;
	}
}
