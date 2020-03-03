package Level_2_LinkedList;

public class NodeClassSetData<T> {

		public T data;
		public NodeClassSetData<T> next;

		public NodeClassSetData(T data) {
			this.setData(data);
			this.next = null;
		}

		public T getData() {
			return data;
		}

		public void setData(T data) {
			this.data = data;
		}

	

}
