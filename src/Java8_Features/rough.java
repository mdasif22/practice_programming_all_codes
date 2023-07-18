package Java8_Features;
import java.util.function.*;
public interface rough {
	public static void main(String[] args) {
		Consumer<String> c = i -> System.out.println("Hello "+i);;
		c.accept("Asif"); 
		c.accept("banku"); 
	}
	
}
