package StringAnd2DArray;

public class SPiral {
	static void sort012(int arr[]) 
    { 
		int arr_size= arr.length;
        int lo = 0; 
        int hi = arr_size - 1; 
        int mid = 0, temp = 0; 
        while (mid <= hi) { 
            switch (arr[mid]) { 
            case 0: { 
                temp = arr[lo]; 
                arr[lo] = arr[mid]; 
                arr[mid] = temp; 
                lo++; 
                mid++; 
                break; 
            } 
            case 1: 
                mid++; 
                break; 
            case 2: { 
                temp = arr[mid]; 
                arr[mid] = arr[hi]; 
                arr[hi] = temp; 
                hi--; 
                break; 
            } 
            } 
        } 
    } 
  
    /* Utility function to print array arr[] */
    static void printArray(int arr[], int arr_size) 
    { 
        int i; 
        for (i = 0; i < arr_size; i++) 
            System.out.print(arr[i] + " "); 
        System.out.println(""); 
    } 
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
