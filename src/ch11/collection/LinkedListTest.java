package ch11.collection;

import java.util.LinkedList;

public class LinkedListTest {

	public static void main(String[] args) {
		
		LinkedList<String> myList = new LinkedList<String>();
		
		myList.add("A");
		myList.add("B");		
		myList.add("C");
		
		System.out.println(myList);	//toString
		
		myList.add(1, "D");
		System.out.println(myList);	//toString
		myList.removeLast();
		System.out.println(myList);	//toString
		
		for(int i=0; i<myList.size(); i++) {
			String s = myList.get(i);
			//cf. SET은 get을 할 수 없음
			System.out.println(s);
		}

	}

}
