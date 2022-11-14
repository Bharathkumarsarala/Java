package StreamLambda;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class ListStream {
		public static void main(String args[]) {
			List<Integer> l=Arrays.asList(1,2,3,4,5);
			for(int i=0;i<5;i++){
				System.out.print(l.get(i));		
			}
			System.out.println();
			
			Iterator<Integer> it=l.iterator();
			while(it.hasNext()) {
				System.out.print(it.next());
			}	
		}
}
