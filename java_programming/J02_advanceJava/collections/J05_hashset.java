package java_programming.J02_advanceJava.collections;

import java.util.HashSet;

public class J05_hashset {
	private HashSet<String> hashsets = new HashSet<>();

	public HashSet<String> getHashsets() {
		return hashsets;
	}

	public void setHashsets(String str) {
		hashsets.add(str);
	}
			
}
