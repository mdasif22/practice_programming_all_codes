package Tree;

import java.util.*;
import java.util.stream.Collectors;

public class Q2583_Kth_Largest_Sum_in_Binary_Tree {

	public long kthLargestLevelSum(TreeNode root, int k) {
        List<Long> list = new ArrayList<>();
        Queue<TreeNode> qu = new LinkedList<>();
        qu.add(root);
        while(!qu.isEmpty()){
            int len = qu.size();
            long sum = 0;
            for(int i=0; i<len; i++){
                TreeNode curr = qu.poll();
                sum += (long)curr.val;
                if(curr.left != null){
                    qu.add(curr.left);
                }
                if(curr.right != null){
                    qu.add(curr.right);
                }
            }
            list.add(sum);
        }
        return getLargestValue(list, k);   
    }
    public long getLargestValue(List<Long> list, int k){
        Collections.sort(list);
        if(list.size() < k) return -1;
        return list.get(list.size() - k);
    }


    //My Approach (Compiled but not submitted)
	public static long kthLargestLevelSumTry(TreeNode root, int k) {
		if (root == null)
			return 0;
		int sum = 0;
		ArrayList<Integer> list = new ArrayList<>();
		Queue<TreeNode> que = new LinkedList<>();
		que.add(root);
		que.add(null);

		while (!que.isEmpty()) {
			TreeNode currNode = que.remove();

			if (currNode == null) {
				sum = 0;
				if (que.isEmpty())
					break;
				else {
					que.add(null);
				}
			} else {
				sum += currNode.val;
				if (currNode.left != null)
					que.add(currNode.left);
				if (currNode.right != null)
					que.add(currNode.right);
			}
			list.add(sum);
		}
		//to sort in descending order
		List<Integer> l3 = list.stream().sorted((i1, i2) -> -i1.compareTo(i2)).collect(Collectors.toList());
		return l3.get(k - 1);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
