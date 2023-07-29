package LeetCode_Quetions;

public class Q653 {
	
	public boolean findTarget(TreeNode root, int k) {
        if(root == null)
        	return false;
        List<Integer> list = new ArrayList<>();
        inOrder(root,list);

        Map<Integer,Integer> map = new HashMap<>();
		for(int i=0;i<list.size();i++) {
			map.put(list.get(i), i);
		}
		
		for(int i=0;i<map.size();i++) {
			int second = k - list.get(i);
			if(map.containsKey(second) && map.get(second)!=i) {
				return true;
			}
		}
		return false;

    }

		public void inOrder(TreeNode root, List<Integer> list){
        if(root==null)
            return;
        inOrder(root.left,list);
        list.add(root.val);
        inOrder(root.right,list);
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
