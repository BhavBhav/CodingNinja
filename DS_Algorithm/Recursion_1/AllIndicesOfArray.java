package Recursion_1;

public class AllIndicesOfArray {
	
	public static int[] allIndexes(int input[], int x) {
		
		int m=0;
		int k=0;
		for(int i=0;i<input.length;i++) {
			if(x==input[i]) {
			
			k++;
			}
		}
		int[] arr = new int[k];
		for(int i=0;i<input.length;i++) {
			if(x==input[i]) {
				arr[m]= i;
				m++;	
			}
			
		}
		return arr;
	}
	
	public static void main(String[] args) {
		int[] arr = {8,7,21,8,25,8};
		int[] arr1 =allIndexes(arr, 8);
		for(int i=0; i<arr1.length;i++) {
			System.out.print(arr1[i]+ " ");
		}

	}

}
