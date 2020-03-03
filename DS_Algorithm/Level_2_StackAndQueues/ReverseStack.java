package Level_2_StackAndQueues;

import java.util.Stack;

public class ReverseStack {
	
	public static void reverseStack1(Stack<Integer> s1, Stack<Integer> s2) {
		if(s1.isEmpty()==true) {
			return;
		}
		int e = s1.pop();
		reverseStack1(s1, s2);
		System.out.println(e);
		s2.add(e);
		
		
	}
	public static void reverseStack(Stack<Integer> s1, Stack<Integer> s2) {
		reverseStack1(s1, s2);
		while(!s2.isEmpty()) {
			s1.add(s2.pop());
		}
		
	}
	
	public static void main(String[] args) {
		Stack<Integer> s1 = new Stack<>();
		Stack<Integer> s2 = new Stack<>();
		for (int i = 1; i < 5; i++) {
			s1.add(i);
		}
		reverseStack(s1, s2);
		
		
	}

}
