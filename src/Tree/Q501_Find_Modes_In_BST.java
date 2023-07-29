package Tree;

import java.util.*;

public class Q501_Find_Modes_In_BST {
	
	Map<Integer,Integer> map;
    public int[] findMode(TreeNode root) {
        map = new HashMap<>();
        searchInBST(root);

        int maxFreq = -1;
        List<Integer> list = new ArrayList<>();
        for(int key : map.keySet()){
            if(maxFreq < map.get(key))
            {
                maxFreq = map.get(key);
                list.clear();
                list.add(key);
                continue;
            }
            else if(maxFreq == map.get(key)){
                list.add(key);
            }
        }

        int[] result = new int[list.size()];
        for (int i = 0; i < list.size(); i++) 
            result[i] = list.get(i);

        return result;
    }

    public void searchInBST(TreeNode root){
        if(root==null)
            return;
            
        if(map.containsKey(root.val)){
            map.put(root.val , map.get(root.val)+1);
        }
        else{
            map.put(root.val,1);
        }
        searchInBST(root.left);
        searchInBST(root.right);
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
