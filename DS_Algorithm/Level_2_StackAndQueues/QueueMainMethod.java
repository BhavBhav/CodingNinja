package Level_2_StackAndQueues;

public class QueueMainMethod {

	public static void main(String[] args) {
		QueueUsingArrays q = new QueueUsingArrays();
		for (int i = 1; i <= 5; i++) {
			try {
				q.enQueue(i);
			} catch (QueueFullException e) {
			}
		}
		
		while(!q.isEmpty()) {
			try {
				System.out.println(q.deQueue());
			} catch (StackEmptyException e) {
				// TODO Auto-generated catch block
			}
			
		}

	}

}
