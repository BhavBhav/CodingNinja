package Level_2_LinkedList;

import java.util.Scanner;

public class LinkedListUse {

	public static Node<Integer> takeInput() {
		Node<Integer> head = null;
		Scanner s = new Scanner(System.in);
		int data = s.nextInt();
		while(data != -1) {
			Node<Integer> newNode= new Node<Integer>(data);
			if(head == null) {
				head=newNode;
			}
			else {
				Node<Integer> temp= head;
				while(temp.next!= null) {
					temp= temp.next;
				}
				temp.next=newNode;
			}
			data= s.nextInt();
		}
		return head;
	}
	public static void print(Node<Integer> head) {


		Node<Integer> temp = head;
		while(temp != null) {
			System.out.print(temp.data+" ");
			temp=temp.next;
		}

	}


	public static void main(String[] args) {
		/*Node<Integer> node1 = new Node<Integer>(10);
				System.out.println(node1.data);	
			Node<Integer> node2 = new Node<>(20);
			System.out.println(node2.data);
			System.out.println(node2.next);
			node1.next = node2;
			System.out.println(node1.next);
			Node<Integer> node3= new Node<Integer>(30);
			node2.next = node3;
			Node<Integer> head = node1;
			print(head);*/

		Node<Integer> head= takeInput();
		print(head);
	}
}
