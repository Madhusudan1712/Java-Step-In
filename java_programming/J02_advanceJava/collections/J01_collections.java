package java_programming.J02_advanceJava.collections;

import java.util.Collections;

public class J01_collections {
	public static void main(String args[]) {
		System.out.println("-------------arrayList----------------");
		J02_arrayList arrayLists = new J02_arrayList();
		arrayLists.setArrayL("Madhu");
		arrayLists.setArrayL("Mahadev");
		arrayLists.setArrayL("Amogh");
		arrayLists.setArrayL("Inchara");
		
		for (String a : arrayLists.getArrayL()) {
			System.out.print(a+",");
		}
		
		System.out.println("\n\n-------------LinkedList----------------");
		J03_linkedList linkedLists = new J03_linkedList();
		linkedLists.setLinkedLists("Orange");
		linkedLists.setLinkedLists("Apple");
		linkedLists.setLinkedLists("Promegranate");
		linkedLists.setLinkedLists("Grapes");
		
		//list sorting
		Collections.sort(linkedLists.getLinkedLists());
		
		for(String l : linkedLists.getLinkedLists()) {
			System.out.print(l+",");
		}
		
		System.out.println("\n\n-------------Hashmap----------------"); //auto order based on hash value
		J04_hashmap haspmaps = new J04_hashmap();
		haspmaps.setHashMaps("Onion", 40);
		haspmaps.setHashMaps("Potato", 30);
		haspmaps.setHashMaps("Cucumber", 10);
		haspmaps.setHashMaps("Tomato", 70);
		
		//before using override toString : output java_programming.J02_advanceJava.collections.J04_hashmap@e6ea0c6
		System.out.println(haspmaps); 
		
		System.out.println("\n\n-------------Hashset----------------");
		J05_hashset hashset = new J05_hashset();
		hashset.setHashsets("A");
		hashset.setHashsets("B");
		hashset.setHashsets("C");
		hashset.setHashsets("A");
		hashset.setHashsets("E");
		
		for(String h : hashset.getHashsets()) {
			System.out.print(h+",");
		}
	}
}
