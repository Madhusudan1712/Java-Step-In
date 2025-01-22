package java_programming.J02_advanceJava.collections;

import java.util.ArrayList;

public class J02_arrayList {
	private ArrayList<String> arrayL = new ArrayList<String>();

	public ArrayList<String> getArrayL() {
		return arrayL;
	}

	public void setArrayL(String str) {
		this.arrayL.add(str);
	}
}
