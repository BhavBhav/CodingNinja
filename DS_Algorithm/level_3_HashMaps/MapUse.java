package level_3_HashMaps;

import java.util.HashMap;
import java.util.Set;

public class MapUse {
	public static void main(String[] args) {
		HashMap<String,Integer> map = new HashMap<>();
		map.put("abc", 1);
		map.put("def", 2);
		if(map.containsKey("abc")) {
			System.out.println("Has abc");
		}
		if(map.containsKey("abc1")) {
			System.out.println("has abc1");
		}
		System.out.println("Size is "+map.size());
		
		//int v = map.get("abc1");
		//System.out.println(v);
		int v = 0;
		if(map.containsKey("abc1")) {
			v = map.get("abc");
		}
		System.out.println(v);
		
		//remove value
		int s = map.remove("abc");
		System.out.println(s);
		
		//iterate over map
		Set<String> keys = map.keySet();
		for(String str : keys) {
			System.out.println(str);
		}
	}
}
