package StreamLambda;

import java.util.ArrayList;
import java.util.Collections;

public class LambdaOwnClass {
	String name;
	int eno;
	
	LambdaOwnClass(String name,int eno){
		this.name=name;
		this.eno=eno;
	}
	
	public String toString() {
		return name+" "+eno;
	}

}

class Test {
	public static void main(String args[]) {
		ArrayList<LambdaOwnClass> al=new ArrayList<LambdaOwnClass>();
		al.add(new LambdaOwnClass("cbit",86));
		al.add(new LambdaOwnClass("vnr",62));
		al.add(new LambdaOwnClass("martin",74));
		
	 //sorting based oon ascending order of employee nos
		Collections.sort(al,(e1,e2) -> (e1.eno<e2.eno)?-1:(e1.eno>e2.eno)?1:0);
		System.out.println(al);
		
		//sorting based oon ascending order of employee nos
		Collections.sort(al,(e1,e2) -> (e1.name.compareTo(e2.name)));
			
	}
}
