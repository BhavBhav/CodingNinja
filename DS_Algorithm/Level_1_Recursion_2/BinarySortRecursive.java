package Level_1_Recursion_2;

public class BinarySortRecursive {
	
	public static int binarySearch(int input[], int element) {
		int si =0, ei = input.length-1;
		/*int mi = (si+ei)/2;
		if(element == input[mi]) {
			return mi;
		}
		int ans = 0;
		if(element>input[mi]) {*/
			int ans = binarySearch(input, element, si, ei);
			return ans;
			
		/*}
		else {
			ans = binarySearch(input, element, mi+1, ei);
			
		}
		return ans;*/
	}
public static int binarySearch(int input[], int element, int si, int ei) {
		if(si>=ei) {
			if(element==input[ei]) {
				return ei;
			}
			else return -1;
		}
		int mi = (si+ei)/2;
		
		if(element<=input[mi]) {
			int ans1 = binarySearch(input, element, si, mi);
			return ans1;
		}
		else {
			int ans2 = binarySearch(input, element, mi+1, ei);
			return ans2;
		}
	//	return ans;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {2,3,4,5,6,7,8,9,10,15,60};
		System.out.println(binarySearch((arr),9));
	}

}
