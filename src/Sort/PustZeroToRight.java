package Sort;



public class PustZeroToRight {

	public static void pushZerosAtEnd(int[] arr){
		int m=0;
        for(int i=0;i<arr.length-1;i++) {
        	int k=i+1;
        	
        	if(arr[i]==0) {
        		int temp=arr[i];
        		
        		while(k<arr.length-1) {
            		if(arr[k]!=0) {
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
	}
	public static void checkPalindrome(String str) {
		int k=0;
		String str1= null;
		for (int i=str.length()-1; i>=0; i--) {
			
	}
	}
	
	
	public static void main(String[] args) {
		int[] arr = {2,0,4,1,3,0,28};
		pushZerosAtEnd(arr);
		for (int i=0; i< arr.length; i++) {
			System.out.print(arr[i] +" ");
		}

		//System.out.println(checkPalindrome("abcdcba"));
	}

}
