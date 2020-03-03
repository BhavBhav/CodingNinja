package Level_2_Trees;

import java.util.Scanner;

public class TreeNodeUse_Simple {

	public static TreeNodeClass<Integer> takeInput(Scanner s){
		int n;
		
		System.out.println("Enter Next Node Data");
		n = s.nextInt();
		TreeNodeClass<Integer> root = new TreeNodeClass<Integer>(n);
		System.out.println("Enter number of Children for "+n);
		int childNum = s.nextInt();
		for (int i = 0; i < childNum; i++) {
			TreeNodeClass<Integer> child = takeInput(s);
			root.children.add(child);
		}
		return root;
	}
	
	public static void print (TreeNodeClass<Integer> root) {
		String s = root.data + " : ";
		for (int i=0; i< root.children.size(); i++) {
			s = s + root.children.get(i).data + ",";
		}
		System.out.println(s);
		for (int i=0; i< root.children.size(); i++) {
			print(root.children.get(i));
		}
	}
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		TreeNodeClass<Integer> root = takeInput(s);
		print(root);
		
		
		/*TreeNodeClass<Integer> root = new TreeNodeClass<>(10);
		TreeNodeClass<Integer> head1 = new TreeNodeClass<>(20);
		TreeNodeClass<Integer> head2 = new TreeNodeClass<>(30);
		TreeNodeClass<Integer> head3 = new TreeNodeClass<>(40);
		TreeNodeClass<Integer> node4 = new TreeNodeClass<>(50);
		root.children.add(head1);
		root.children.add(head3);
		root.children.add(head2);
		head3.children.add(node4);
		
		System.out.println(head3.data);
		
		*/
		
		
		
	}

}
