package Tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
import java.util.TreeMap;

public class top_bottom_view {
	static class Pair {
		int line; // hd = horizontal_distance(in line)
		node1 node;

		Pair(node1 node, int line) {
			this.node = node;
			this.line = line;
		}
	}

	// GFG by anuj bhaiya
	public static ArrayList<Integer> topView(node1 root) {
		ArrayList<Integer> ans = new ArrayList<>();
		if (root == null)
			return ans;
		Map<Integer, Integer> map = new TreeMap<>();
		Queue<Pair> q = new LinkedList<Pair>();
		q.add(new Pair(root, 0));

		while (!q.isEmpty()) {
			Pair curr = q.poll();
			int line = curr.line; 
			node1 node = curr.node;

			if (!map.containsKey(line)) {
				map.put(line, node.data);
			}
			if (node.left != null) {
				q.add(new Pair(node.left, line - 1));
			}
			if (node.right != null) {
				q.add(new Pair(node.right, line + 1));
			}

		}

		for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
			ans.add(entry.getValue());
		}
		return ans;

	}

	//same code but just remove map checking condition bcoz in bottom view the value will be from bottom side
	public static ArrayList<Integer> bottomView(node1 root) {
		ArrayList<Integer> ans = new ArrayList<>();
		if (root == null)
			return ans;
		Map<Integer, Integer> map = new TreeMap<>();
		Queue<Pair> q = new LinkedList<Pair>();
		q.add(new Pair(root, 0));

		while (!q.isEmpty()) {
			Pair curr = q.poll();
			int hd = curr.line; // hd = horizontal_distance(in line)
			node1 node = curr.node;

			map.put(hd, node.data);

			if (node.left != null) {
				q.add(new Pair(node.left, hd - 1));
			}
			if (node.right != null) {
				q.add(new Pair(node.right, hd + 1));
			}

		}

		for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
			ans.add(entry.getValue());
		}
		return ans;

	}

}
