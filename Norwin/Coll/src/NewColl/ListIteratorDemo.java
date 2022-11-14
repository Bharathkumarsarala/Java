package NewColl;

import java.util.LinkedList;
import java.util.ListIterator;

public class ListIteratorDemo {
	public static void main(String args[]) {
		
		LinkedList ll2=new LinkedList();
		ll2.add("a");
		ll2.add("b");
		ll2.add("c");
		ll2.add("d");
		
		ListIterator itr=ll2.listIterator();
		while(itr.hasNext()) {
			String s=(String) itr.next();
			if(s.equals("b")) {
				itr.remove();
			}
			else if(s.equals("d")) {
				itr.add("D");
			}
			else if(s.equals("c")) {
				itr.set("C");
			}
		}
		System.out.println(ll2);
				
	}

}
