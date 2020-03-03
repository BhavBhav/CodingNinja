package Level_2_LinkedList;

import java.util.Scanner;

public class LinkedList_SelfPractice {

	public static Node_SelfPractice takeInput() {
		Scanner scan = new Scanner(System.in);
		int data = scan.nextInt();
		Node_SelfPractice head = null , tail = null;

		while(data != -1) {
			Node_SelfPractice newNode = new Node_SelfPractice(data);
			if(head == null) {
				head = newNode;
				tail = newNode;
			} else {
				Node_SelfPractice temp = head;
				while(temp.getNode() != null) {
					temp = temp.getNode();
				}
				temp.setNode(newNode);
				//tail.setNode(newNode);
				//tail =newNode; //tail= tail.getNode();
			}
			data = scan.nextInt();
		}
		return head;

	}

	public static void printLinkedList(Node_SelfPractice head) {



		Node_SelfPractice temp = head;
		while(temp != null) {
			System.out.print(temp.getData()+" ");
			temp = temp.getNode();
		}
	}

	public static int length(Node_SelfPractice head){
		Node_SelfPractice temp = head;
		int k=0;
		while(temp.getNode() != null) {
			temp = temp.getNode();
			k++;
		}
		return k+1;
	}

	public static void printIthElement(Node_SelfPractice head, int i) {

		Node_SelfPractice temp = head;
		int k=0;

		if(i==0) {
			System.out.println( temp.getData());

		}
		while(temp.getNode()!=null) {
			temp = temp.getNode();
			k++;
			if(k==i) {
				System.out.println(temp.getData());
			}
		}
	}
	public static void main(String[] args) {
		int data1 =20;
		Node_SelfPractice node1 = new Node_SelfPractice(data1);
		int data2= 30;
		Node_SelfPractice node2 = new Node_SelfPractice(data2);
		System.out.println(node1.getData());
		//System.out.println(node2.getData());
		Node_SelfPractice head = node1;
		node1.setNode(node2);
		head = node1.getNode();
		System.out.println(node1.getNode());
		System.out.println(node2.getNode());
		Node_SelfPractice node3 = new Node_SelfPractice(40);
		node2.setNode(node3);
		System.out.println(node2);
		System.out.println(node3.getNode());
		System.out.println("------Printing nodes original value---------");
		System.out.println(node1);
		System.out.println(node2);
		System.out.println(node3);
		System.out.println("------Printing nodes new value-------------");
		System.out.println(node1.getNode());
		System.out.println(node2.getNode());
		System.out.println(node3.getNode());

		System.out.println("------Printing Take Input Method-------------");
		Node_SelfPractice head1 = takeInput();
		printLinkedList(head1);
		System.out.println();
		System.out.println(length(head1));
		System.out.println();
		printIthElement(head1, 0);
		head1 = addElement(head1, 4, 45);
		System.out.println();
		printLinkedList(head1);
		head1 = deleteIthElement(head1, 3);
		System.out.println();
		printLinkedList(head1);
		Node_SelfPractice temp = removeDuplicates(head1);
		System.out.println();
		System.out.println("Removing Duplicate Elements");
		printLinkedList(temp);
	}

	private static Node_SelfPractice deleteIthElement(Node_SelfPractice head1, int pos) {
		Node_SelfPractice temp = head1;
		int k=0;
		if(pos==0) {
			temp = temp.getNode();
			return temp;
		}
		while(k < pos-1 && temp.getNode()!=null) {
			temp = temp.getNode();
			k++;
		}
		if(temp.getNode()!=null) {
			temp.setNode(temp.getNode().getNode());

		}
		return head1;
	}

	public static Node_SelfPractice addElement(Node_SelfPractice head1, int pos, int j) {
		Node_SelfPractice temp = head1;
		Node_SelfPractice newNode = new Node_SelfPractice(j);
		int k=0;
		if(pos==0) {
			newNode.setNode(temp);
			head1=newNode;
			return head1;
		}

		while(k<pos-1) {
			temp = temp.getNode();
			k++;
		}

		newNode.setNode(temp.getNode());
		temp.setNode(newNode);
		return head1;
	}

	public static Node_SelfPractice removeDuplicates(Node_SelfPractice head) {
		//Node_SelfPractice temp = head;
		Node_SelfPractice t1 = head;
		Node_SelfPractice t2 = head.getNode();
		while((t2.getNode()!=null)) {
			if(t1.getData() == t2.getData()) {
				t2 = t2.getNode();
			}
			else {
				t1.setNode(t2);
				t1 = t1.getNode();
				t2 = t2.getNode();
			}
		}
		t1.setNode(t2);
		
		return head;
	}
}
