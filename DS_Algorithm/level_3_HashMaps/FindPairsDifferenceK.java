package level_3_HashMaps;
import java.util.*;
public class FindPairsDifferenceK {

	public static void findPairsDifferenceK(int[] input, int k){
		HashMap<Integer, Boolean> map = new HashMap<>();
		for(int i : input) {
			map.put(i, true);
		}
		for( int i = 0; i < input.length; i++) {

			/*if(map.get(input[i]) == false) {
				continue;
			}
			else {*/
			//map.put(i, true);
			int l = requiredPair1(input[i],k);
			int m = requiredPair2(input[i],k);
			for ( int j = i+ 1; j < input.length; j++) {
				if(input[j] == l ) {
					map.put(input[i], false);
					if(input[i] < l) {
						System.out.println(input[i] + " " + l);
					}
					else System.out.println(l + " " +input[i]);
				}
				
			}
			//	}
		}
		//}
	}

	// Don't use this method.
	private static int requiredPair2(int i, int k) {
			return 0; 
	}


	private static int requiredPair1(int i, int k) {
		int l = Math.abs(i);
		if(l > k){
			if(i > 0) {
				return (i - k);
			}
			else {
				return (1)*( i + k);
			}
		}
		else {
			if(i > 0) {
				return (-1)*( k - i);
			}
			else {
				return (-1)*( Math.abs(i) + k);
			}
		}

	}


	public static void main(String[] args) {
		int[] arr = {4,4,4,4};
		findPairsDifferenceK(arr, 0);

	}

}
