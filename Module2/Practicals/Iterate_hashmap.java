package Practicals;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class Iterate_hashmap {
		public static void main(String[] arguments) {
			Map<Integer, String> hash_map = new HashMap<Integer, String>();
			hash_map.put(1, "hello");
			hash_map.put(2, "world");
			Iterator<Entry<Integer, String>> it = hash_map.entrySet().iterator();
			while (it.hasNext()) {
				Map.Entry<Integer, String> set = (Map.Entry<Integer, String>) it.next();
				System.out.println(set.getKey() + " = " + set.getValue());
			}
		}
	}

