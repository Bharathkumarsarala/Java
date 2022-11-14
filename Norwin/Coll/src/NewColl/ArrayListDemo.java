package NewColl;

import java.util.ArrayList;

public class ArrayListDemo {
	public static void main(String args[]) {
		
		ArrayList l=new ArrayList();
		l.add("P");
		l.add("b");
		l.add("b");
		l.add("b");
		l.add(null);
		System.out.println(l);
		l.remove(null);
		System.out.println(l);
	}

}
