package Level_1_Recursion_2;

public class QuickSort {
	
	public static void quickSort(int[] input) {
		quickSort(input, 0,input.length-1);
	}
	public static void quickSort(int[] input, int si, int ei) {
		if(si>=ei) {
			return;
		}
		int pivotPos = partition(input, si, ei);
		quickSort(input, si, pivotPos-1);
		quickSort(input, pivotPos+1, ei);
		
	}
	public static int partition(int[] input, int si, int ei) {
		int pivotElement = si;
		int count=0;
		for(int i=si+1; i<=ei;i++) {
			if(input[i]<=input[pivotElement]) {
				count++;
			}
		}
		int pivotPos = count+si;
		int temp = input[pivotPos];
		input[pivotPos]= input[si];
		input[si]= temp;
		int i=si; int j=ei;int k=si;
		while(i<= pivotPos && j> pivotPos) {
			if(input[k]<=input[pivotPos]) {
				k++;
				i++;
			}
			else {
				
				while(input[j]>input[pivotPos]) {
					j--;
				}
				int swap= input[k];
				input[k]=input[j];
				input[j]=swap;
				j--;
				k++;
				i++;
			}
		}
		
		return pivotPos; 
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] input = {5,90,8,23,2,17,1};
		quickSort(input);
		for (int i = 0; i < input.length; i++) {
			System.out.print(input[i]+ " ");
		}
	}

}
