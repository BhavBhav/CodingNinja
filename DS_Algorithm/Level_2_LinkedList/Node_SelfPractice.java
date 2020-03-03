package Level_2_LinkedList;

public class Node_SelfPractice {
	
	  private int data;
	  private Node_SelfPractice node;
	
	public Node_SelfPractice(int data) {
		this.data = data;
		node = null;
	}
	
	public int getData(){
		return this.data;
	}
	public Node_SelfPractice getNode() {
		return this.node;
	}
	public void setNode(Node_SelfPractice node) {
		this.node =  node;
	}

	
	
	
	
	
}
