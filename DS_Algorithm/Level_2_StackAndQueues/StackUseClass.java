package Level_2_StackAndQueues;

public class StackUseClass {

	public static void main(String[] args)throws StackFullException {
		StackUsingArray stack = new StackUsingArray(3);
		for (int i = 1; i <= 11; i++) {
			stack.pushUnlimited(i);
		}
		
		while(!stack.isEmpty()) {
			try {
				System.out.println(stack.pop());
			} catch (StackEmptyException e) {
				//e.printStackTrace();
				//Never Reach here
			}
		}

	}

}
