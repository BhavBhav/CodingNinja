package Recursion_1;

public class NoOfZeroes {
	//static int count =0;
	
	public static int countZerosRec(int input){
		int count =0;
		if( input==0) {
			return 0;
		}
		
		
		 count = countZerosRec(input/10);
		int rem = input%10;
		if(rem==0) {
			count = count+1;
		}
		return count;
		
	}
	public static void main(String[] args) {
		System.out.println(countZerosRec(100040));

	}

}
