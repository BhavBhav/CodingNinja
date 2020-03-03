package Level_1_Subsequences;

public class Subsequences_Chapter_1 {
	
	public static String[] findSubsequence(String str) {
		
		if(str.length()==0) {
			String ans[] = {""};
			return ans;
		}
		//int k=0;
		String smallAns[] = findSubsequence(str.substring(1));
		String ans[]= new String[2*smallAns.length];
		for(int i=0;i<smallAns.length;i++) {
			ans[i]= smallAns[i];
			//ans[k]=smallAns[i];
			//k++;
		}
		
		for(int i=0;i<smallAns.length;i++) {
			ans[(smallAns.length)+i] = str.charAt(0)+smallAns[i];
			//ans[k]= str.charAt(0)+smallAns[i];
		}
		return ans;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "xyz";
		String[] ans = findSubsequence(str);
		for(int i=0;i<ans.length;i++) {
			System.out.println(ans[i]+" ");
		}
	}

}
