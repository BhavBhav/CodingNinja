package level_3_PriorityQueue;

import org.testng.annotations.BeforeGroups;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class MaxPriorityTest {
	public int[] arr = {2,12,9,16,10,5};
	MaxPriorityQueue pq;
	
	
	@BeforeMethod
	public void f1() {
		pq = new MaxPriorityQueue();
		  for(int i : arr) {
			  pq.insert(i);
		  }
		
	}
	
  @Test(priority = 1)
  public void insertTest() {
	  System.out.println("INSERT TEST");
  }
  
  @Test(dependsOnMethods = { "insertTest"})
  public void removeMaxTest() throws PriorityQueueException {
	  for(int i = 0; i < arr.length; i++) {
		  System.out.println(pq.removeMax());
	  }
	 
  }
}
