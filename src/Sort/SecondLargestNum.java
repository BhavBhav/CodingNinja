package Sort;

public class SecondLargestNum {
	public static int secLarnum(int[] arr1){
        int num=Integer.MIN_VALUE;
        int k= Integer.MIN_VALUE;

        for (int i=0;i <arr1.length; i++){
            if(arr1[i]>k ){
                num=k;
                k=arr1[i];
                
            } 
            else{
                if((arr1[i]>num)&&(arr1[i]!=k)){
                    num=arr1[i];
                }
        }
        }
        return num; 
    }
	
	public static int secondLargestElement(int[] arr) {
        int r = 0;
        int m=0;
        int n = arr.length;
        if (n<=1){
            return Integer.MIN_VALUE;
        }
        else{
        for (int i=0; i<n-1; i++){
            if (arr[i] == arr[i+1]){
                m++;
            }  
          }
        if(m==arr.length) {
        	return Integer.MIN_VALUE;
        }
        r=secLarnum(arr);
        }
       return r; 
	}
	public static void main(String[] args) {
		int[] arr = {10,19,19,19,150,30,19,145,91,19,19};
		System.out.println(secondLargestElement(arr));
		int i=-1;
		if ( i==-1) {
			arr[i+1]=0;
		}
		//System.out.println(arr[0]);
	}

}
