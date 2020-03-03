package level_3_PriorityQueue;

public class CheckMaxHeap {
	
	public static boolean checkMaxHeap(int arr[]) {
		int n = arr.length;
		 for (int i = 0; i <= (n - 2) / 2; i++) { 
	            
	            if (arr[2 * i + 1] > arr[i]) { 
	                return false; 
	            } 
	  
	            // If right child is greater, return false  
	            if (2 * i + 2 < n && arr[2 * i + 2] > arr[i]) { 
	                return false; 
	            } 
	        } 
	        return true; 
		
	}
	public static void main(String[] args) {
		

	}

}
