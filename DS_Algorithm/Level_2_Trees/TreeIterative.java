package Level_2_Trees;

import java.util.Scanner;

import Level_2_StackAndQueues.QueueEmptyException;
import Level_2_StackAndQueues.QueueUsingLinkedList;

public class TreeIterative<T> {

	public static TreeNodeClass<Integer> takeInput_Iteratively() {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter root : ");
		int rootData = s.nextInt();
		System.out.println("Root Data is : "+rootData);
		TreeNodeClass<Integer> root = new TreeNodeClass<>(rootData);
		QueueUsingLinkedList<TreeNodeClass<Integer>> pendingNodes = new QueueUsingLinkedList<>();
		pendingNodes.enqueue(root);
		while(!pendingNodes.isEmpty()) {
			try {
				TreeNodeClass<Integer> frontNode = pendingNodes.dequeue();
				System.out.println("Enter number of childNodes : ");
				int childNodeNums = s.nextInt();
				for (int i = 0; i < childNodeNums; i++) {
					System.out.println("Enter "+(i+1)+"th data");
					int data = s.nextInt(); 

					TreeNodeClass<Integer> childNode = new TreeNodeClass<Integer>(data);
					frontNode.children.add(childNode);
					pendingNodes.enqueue(childNode);
				}

			} catch (QueueEmptyException e) {
				return null;
			}
		}

		return root;

	}

	public static void main(String[] args) {
		TreeNodeClass<Integer> root = takeInput_Iteratively();
		System.out.println("Number of roots : "+numberOfNodes(root));
		//printLevelWise(root);
		System.out.println("Sum of roots : "+sumOfAllNode(root));
		System.out.println("Largest of the Nodes is : "+largestOfAllNode(root));
		System.out.println("Number of nodes greater than given num are : "+numNodeGreater(root, 25));
		System.out.println("Height of the tree is : "+height(root));
		printAtK(root, 2); System.out.println();
		System.out.println("Number of leaf nodes are : "+countLeafNodes(root));
		preOrderPrinting(root); System.out.println();
		postOrderPrinting(root); 
	}

	public static void	postOrderPrinting(TreeNodeClass<Integer> root) {
		if(root == null) return;
		for(int i = 0; i < root.children.size(); i++) {
			postOrderPrinting(root.children.get(i));
			System.out.print(root.children.get(i).data + " ");
		}
	}

	public static void preOrderPrinting(TreeNodeClass<Integer> root) {
		if(root == null) return;
		System.out.print(root.data+ " ");
		for(int i = 0; i < root.children.size(); i++) {
			preOrderPrinting(root.children.get(i));
		}
	}

	public static int countLeafNodes(TreeNodeClass<Integer> root){
		int count = 0;
		if(root.children.size() == 0) {
			count++;
			return count;
		}

		for(int i = 0; i < root.children.size(); i++) {
			count += countLeafNodes(root.children.get(i));
		}

		return count;
	}

	public static int height(TreeNodeClass<Integer> root) {
		int heightTemp = 1, temp = 1, k = 0;
		for(int i = 0; i < root.children.size(); i++) {
			heightTemp += height(root.children.get(i));
			if(heightTemp >= temp ) {
				temp = heightTemp;

			}
			heightTemp = 1;
		}
		return temp;
	}

	public static void printAtK(TreeNodeClass<Integer> root, int k) {
		if(k < 0) return;
		if(k == 0) {
			System.out.print(root.data + " ");
		}
		for (int i = 0; i < root.children.size(); i++) {
			printAtK(root.children.get(i), k-1);
		}
	}

	public static int numNodeGreater(TreeNodeClass<Integer> root, int num) {
		int tempAns = 0;
		if(root.data > num) {
			tempAns = 1;
		}

		for(int i = 0; i < root.children.size(); i++) {
			tempAns  += numNodeGreater(root.children.get(i), num);
		}
		return tempAns;
	}

	public static int largestOfAllNode(TreeNodeClass<Integer> root) {
		int num = root.data;
		for(int i = 0; i < root.children.size(); i++) {
			int temp = largestOfAllNode(root.children.get(i));
			if(temp > num) {
				num = temp;
			}
		}

		return num;
	}

	public static int sumOfAllNode(TreeNodeClass<Integer> root) {
		int sum = root.data;
		for(int i = 0; i < root.children.size(); i++) {
			sum += sumOfAllNode(root.children.get(i));

		}
		return sum;	

	}

	public static int numberOfNodes(TreeNodeClass<Integer> root) {
		if(root == null) {
			return 0;
		}
		int count = 0;
		for(int i = 0; i < root.children.size(); i++) {
			count += numberOfNodes(root.children.get(i));
		}
		return count;

	}

	public static void printLevelWise(TreeNodeClass<Integer> root) {

		QueueUsingLinkedList<TreeNodeClass<Integer>> queue = new QueueUsingLinkedList<>();
		queue.enqueue(root);
		System.out.println(root.data);
		while(!queue.isEmpty()) {
			try {
				TreeNodeClass<Integer> frontNode = queue.dequeue();
				//System.out.println(frontNode.data+" ");

				for(int i=0; i<frontNode.children.size(); i++) {
					if(frontNode.children == null) {
						break;
					}
					queue.enqueue(frontNode.children.get(i));
					System.out.print(frontNode.children.get(i).data+" ");


				}
			} catch (QueueEmptyException e) {
				return;
			}
			System.out.println();

		}

	}

}
