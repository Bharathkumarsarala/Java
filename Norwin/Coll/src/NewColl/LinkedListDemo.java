package NewColl;

import java.util.LinkedList;

public class LinkedListDemo {
	public static void main(String args[]) {
		
		LinkedList ll=new LinkedList();
		ll.add("me");
		ll.add(3);
		ll.add("for");
		ll.set(0,"them");
		ll.add("is");
		ll.removeLast();
		ll.addFirst(":");
		System.out.println(ll);
		
		
	}

}
