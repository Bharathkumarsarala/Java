package StreamLambda;

import java.util.function.*;
import java.util.ArrayList;

public class BiFun {

	int eno;
	String name;

	BiFun(int eno, String name) {
		this.eno = eno;
		this.name = name;
	}

}

class Test {
	public static void main(String args[]) {
		ArrayList<BiFun> al = new ArrayList<BiFun>();
		BiFunction<Integer, String, BiFun> f = (eno, name) -> new BiFun(eno, name);
		al.add(f.apply(10, "vinod"));
		al.add(f.apply(10, "rithik"));

	}
}
