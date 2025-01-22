package java_programming.J02_advanceJava.collections;

import java.util.HashMap;

public class J04_hashmap {
	private HashMap<String, Integer> hashMaps = new HashMap<>();

	public HashMap<String, Integer> getHashMaps() {
		return hashMaps;
	}

	public void setHashMaps(String key, Integer value) {
		hashMaps.put(key, value);
	}

	@Override
	public String toString() {
		return hashMaps.toString();
	}
}
