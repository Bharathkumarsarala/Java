package StreamLambda;

import java.util.function.Predicate;

public class predi {

	public static void main(String[] args) {

		String[] s = { "venkat", "sinoi", "poorans", "ag" };
		Predicate<String> p = s1 -> s1.isEmpty();
		for (String s1 : s) {
			if (p.test(s1)) {
				System.out.println(s1);
			}
		}

	}
}