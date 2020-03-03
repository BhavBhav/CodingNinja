package Sort;

public class SortZeroToTwo {
	
	public static void sort(int[] arr) {
		int m=0;
		int n0=1;
        for(int i=0;i<arr.length-1;i++) {
        	
        	if(i<n0) {
        		if(arr[i]==0) {
        			break;
        		}
        		else {
        			int k=i+1;
            		int temp=arr[i];
            		
            		while(k<arr.length-1) {
                		if(arr[k]==0) {
                			//m=arr[k];
                			//k++;
                			break;
                		}
                		else k++;
                	}
            		arr[i]=arr[k];
            		arr[k]=temp;
        		}
            	
        	}
        	else if(i<n0 && i>n0) {
        		
        	}
        	else {
        		
        	}
        	
        }
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
