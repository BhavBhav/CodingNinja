package Level_2_LinkedList;

import java.util.Scanner;

public class LinkedListExerciseProblems {

	public static int indexOfNIter(GenericNode<Integer> head, int n) {
		GenericNode<Integer> temp = head;
		int k=0;
		while(temp.next !=null) {
			if(temp.data==n) {
				return k;
			}
			temp = temp.next;
			k++;
		}
		if(temp.next==null) {
			if(temp.data==n) {
				return k+1;
			}
		}
		return -1;
	}
	public static void printLinkedList(GenericNode<Integer> head) {
		GenericNode<Integer> temp = head;
		while(temp != null) {
			System.out.print(temp.data+" ");
			temp = temp.next;
		}
	}

	public static GenericNode<Integer> takeInput() {
		Scanner scan = new Scanner(System.in);
		int data = scan.nextInt();
		GenericNode<Integer> head = null , tail = null;

		while(data != -1) {
			GenericNode<Integer> newNode = new GenericNode<Integer>(data);
			if(head == null) {
				head = newNode;
				tail = newNode;
			} else {
				GenericNode<Integer> temp = head;
				while(temp.next != null) {
					temp = temp.next;
				}
				temp.next= newNode;
				//tail.setNode(newNode);
				//tail =newNode; //tail= tail.getNode();
			}
			data = scan.nextInt();
		}
		return head;

	}
	
	public static void printReverseRecursive(GenericNode<Integer> root) {
		printReverseRecursive1(root);
		

	}
	public static void printReverseRecursive1(GenericNode<Integer> root) {
		if(root.next==null) {
			System.out.print(root.data+" ");
			return ;
		}
		printReverseRecursive1(root.next);
		int k = root.data;
		System.out.print(k+" ");
	}

	public static void main(String[] args) {
		GenericNode<Integer> head = takeInput();
		printLinkedList(head);
		System.out.println("----Printing index--------");
		System.out.println(indexOfNIter(head, 3));
		System.out.println("----Printing Reverse Order--------");
		printReverseRecursive(head);
		//printLinkedList(head);
		System.out.println(isPalindrome(head));
	}
	//this method is incorrect
	private static boolean isPalindrome(GenericNode<Integer> head) {
		// TODO Auto-generated method stub
		GenericNode<Integer>  temp = head;
		if(temp.next == null) {
			return false;
		}
		while(temp.next!= null) {
			temp = temp.next;
		}
		return false;
	}

}
