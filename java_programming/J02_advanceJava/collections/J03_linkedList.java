package java_programming.J02_advanceJava.collections;

import java.util.LinkedList;

public class J03_linkedList {
	private LinkedList<String> linkedLists = new LinkedList<>();

	public LinkedList<String> getLinkedLists() {
		return linkedLists;
	}

	public void setLinkedLists(String linkedLists) {
		this.linkedLists.add(linkedLists);
	}
	
}
