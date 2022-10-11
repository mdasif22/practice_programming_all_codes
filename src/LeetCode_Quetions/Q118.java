package LeetCode_Quetions;
import java.util.*;
class Q118 {
    public static List<List<Integer>> generate(int numRows) {
		List<List<Integer>> res = new ArrayList<>();
		List list;
		for (int i = 0; i < numRows; i++) {
			list = new ArrayList<>();
			int num = 1;
			for (int j = 0; j <= i; j++) {
				list.add(num);
				num = num * (i - j) / (j + 1);
			}
			res.add(list);
		}
		return res;
	}
}
