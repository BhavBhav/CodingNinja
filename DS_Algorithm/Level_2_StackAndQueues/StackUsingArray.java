package Level_2_StackAndQueues;

public class StackUsingArray {
	private int data[];
	private int top;


	public StackUsingArray() {
		data = new int[10];
		top = -1;//top is index of last element which was in.
	}
	public StackUsingArray(int capacity) {
		data = new int[capacity];
		top = -1;
	}

	public boolean isEmpty() {
		//this function will not be Static, Every stack will have their own property, 
		//it will not be a shared property. so we should not keep function "Static"
		/*if(top ==-1) {
			return true;
		}
		return false;
		 */
		return (top==-1);
		//above will return true if True, else false.

	}
	public int size() {
		return top+1;
	}

	public int top() throws StackEmptyException {
		if(size()==0) {
			// return Stack Empty Exception.
			StackEmptyException e = new StackEmptyException();
			throw e;
		}
		return data[top];
	}

	public void push(int element) throws StackFullException {
		if(size()== data.length) {
			//Stack Full Exception
			StackFullException  e = new StackFullException();
			throw e;
		}
		top++;
		data[top]=element;
	}

	public void pushUnlimited(int element) {
		if(size() == data.length) {
			doubleCapacity();
		}
		top++;
		data[top]=element;
	}

	private void doubleCapacity() {
		int[] temp = data;
		data = new int[2*temp.length];
		for (int i = 0; i <= top; i++) {
			data[i]=temp[i];
		}

	}
	public int pop() throws StackEmptyException {
		if(size()==0) {
			StackEmptyException e = new StackEmptyException();
			throw e;
		}
		int temp = data[top];
		top--;
		return temp;
	}


}
