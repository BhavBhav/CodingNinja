package Level_1_TimeAndSpaceComplexity;

public class ArrayIntersection {
	
	public static void intersection(int[] arr1, int[] arr2){
		quickSort(arr1);
		quickSort(arr2);
		Arrayintersection(arr1,arr2);
	}
	private static void Arrayintersection(int[] arr1, int[] arr2) {
		int arr1si=0;
		int arr2si=0;
		int arr1ei=arr1.length-1;
		int arr2ei=arr2.length-1;
		int i=0,j=0;
		while((i<=arr1ei)&& (j<=arr2ei)){
			if(arr1[i]==arr2[j]) {
				System.out.println(arr1[i]);
				i++;
				j++;
			}
			else {
				if(arr1[i]<arr2[j]) {
					i++;
				}
				else j++;
			}
		}
		
	}
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
		int[] arr1 = {2,6,1,2};
		int[] arr2 = {1,2,3,4,2};
		intersection(arr1,arr2);
		for (int i = 0; i < arr1.length; i++) {
			System.out.print(arr1[i]+" ");
		}
		System.out.println();
		for (int i = 0; i < arr2.length; i++) {
			System.out.print(arr2[i]+" ");
		}
	}

}
