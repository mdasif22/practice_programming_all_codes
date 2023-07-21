package Java8_Features;
import java.util.function.*;
import java.util.stream.Collectors;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
public interface rough {
	public static void main(String[] args) {
		List<Integer> list1 = new ArrayList<>();
		list1.add(10);
		list1.add(50);
		list1.add(15);
		list1.add(7);
		list1.add(18);
		System.out.println(list1);
		
		int minVal = list1.stream().min((i1,i2)->i1.compareTo(i2)).get();
		System.out.println(minVal);
		int maxVal = list1.stream().max((i1,i2)->i1.compareTo(i2)).get();
		System.out.println(maxVal);
		
	}
	
}
