package Java8_Features;
import java.util.function.*;

//BiPredicate is similar to Predicate but Predicate take only one input and BiPredicate take 2 input.

public class BiPredicate_Demo {

	public static void main(String[] args) {
		//Ex1
		BiPredicate<Integer,Integer> p1=(a,b)->(a+b)%2==0;
		System.out.println(p1.test(10, 20));
		System.out.println(p1.test(20,3));
		System.out.println();
	}

}
