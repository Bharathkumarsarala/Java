package StreamLambda;
import java.util.function.BiPredicate;

public class Bipredi {
	
	public static void main(String args[]) {
		BiPredicate<Integer,Integer> p = (a,b) -> (a+b)%2==0;
		System.out.print(p.test(10,20));
	}

}
