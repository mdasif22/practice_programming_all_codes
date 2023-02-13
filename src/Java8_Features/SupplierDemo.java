package Java8_Features;
import java.util.Date;
import java.util.function.*;

//Supplier just simply provide our required object and i will not take any input.
//Means its provides required output but does not take input. Ex System Date. 
public class SupplierDemo {

	public static void main(String[] args) {
		//Ex1 Print System Date
		Supplier<Date> s1 = ()->new Date();
		System.out.println(s1.get());
		System.out.println();
		
		//Ex2 Print random OTP
		Supplier<String> s2=()->{
			String otp="";
			for(int i=0;i<6;i++) {
				otp+=(int)(Math.random()*10);
			}
			return otp;
		};
		System.out.println(s2.get());
		System.out.println(s2.get());
		System.out.println();
		
		
		
	}

}
