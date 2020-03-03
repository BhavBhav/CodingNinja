package Level_1_Recursion_2;

public class ArraySubset { 
	// TODO Auto-generated constructor stub

	public static int[][] subsets(int input[]) {
		if(input.length<=0) {
			int[][] ans = {};
			return ans;
		}
		
	
	int[][] smallAns = subsets(input);
	//int[][] ans= new int[][];
	for(int i=0;i<smallAns[0].length;i++) {
		smallAns[i]= smallAns[i];
		//ans[k]=smallAns[i];
		//k++;
	}
	
	
	return smallAns;
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
