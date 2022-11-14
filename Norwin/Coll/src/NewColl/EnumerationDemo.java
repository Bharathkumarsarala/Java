package NewColl;

import java.util.Enumeration;
import java.util.Vector;

public class EnumerationDemo {
	public static void main(String args[]) {
		
		Vector vv=new Vector();
		for(int i=0;i<=10;i++) {
			vv.addElement(i);
		}
		System.out.println(vv);
		
		Enumeration e=vv.elements();
		while(e.hasMoreElements()) {
			Integer I=(Integer) e.nextElement();
			if(I%2==0) {
				System.out.println(I);
			
			}
			System.out.println(vv);
		}
		
	}

}
