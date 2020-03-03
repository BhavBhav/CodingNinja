package Sort;

public class SelectionSortPractice {
	
	public static void SelectionSort(int[] arr) {
		
		
		for (int j = 0; j < arr.length; j++) {
			int min = Integer.MAX_VALUE;
			int k=0;
			for (int i = j; i < arr.length; i++) {
			if(arr[i]<min) {
				min= arr[i];
				k=i;
				}
			}
			 
			int p=j;
			while(k>j) {
				arr[k]= arr[k-1];
				k--;
			}
			arr[j]=min;
		}
		
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {64,25,12,22,11};
		SelectionSort(arr);
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
	}

}
