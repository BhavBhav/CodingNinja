
public class Test2 {
	
public static void leaders(int[] input) {
		
	for(int i=0; i<input.length-1;i++) {
			int num =0;
			int k=0;
			for(int j=i+1; j<input.length;j++) {	
				if (input[i]>input[j]) {
					num =input[i];
					k++;
				}
				else break;
			}
			if(k==input.length-1-i) {
			System.out.print(num+ " ");
		}
	}
	System.out.print(input[input.length-1]);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {3,12,34,2,0,-1};
		leaders(arr);
	}

}
