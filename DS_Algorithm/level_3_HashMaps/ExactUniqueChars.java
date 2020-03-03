package level_3_HashMaps;

import java.util.HashMap;

public class ExactUniqueChars {

	public static String uniqueChar(String str){
		HashMap<Character,Integer> map = new HashMap<>();
		String temp = "";
		for(int i = 0; i < str.length(); i++) {
			if(map.containsKey(str.charAt(i))) {
				
			}
			else {
				map.put(str.charAt(i), 1);
				temp += str.charAt(i);
			}
		}
		return temp;
	}
	public static void main(String[] args) {
		System.out.println(uniqueChar("abcde"));

	}

}
