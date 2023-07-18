package Tree;

import java.util.*;

class node2 {
    int data;
    node2 left, right;
    node2(int data) {
        this.data = data;
        left = null;
        right = null;
    }
}
public class Q545_BoundaryOfTree {
    static Boolean isLeaf(node2 root) {
        return (root.left == null) && (root.right == null);
    }

    static void addLeftBoundary(node2 root, ArrayList < Integer > res) {
    	node2 cur = root.left;
        while (cur != null) {
            if (isLeaf(cur) == false) res.add(cur.data);
            if (cur.left != null) cur = cur.left;
            else cur = cur.right;
        }
    }
    static void addRightBoundary(node2 root, ArrayList < Integer > res) {
    	node2 cur = root.right;
        ArrayList < Integer > tmp = new ArrayList < Integer > ();
        while (cur != null) {
            if (isLeaf(cur) == false) tmp.add(cur.data);
            if (cur.right != null) cur = cur.right;
            else cur = cur.left;
        }
        int i;
        for (i = tmp.size() - 1; i >= 0; --i) {
            res.add(tmp.get(i));
        }
    }

    static void addLeaves(node2 root, ArrayList < Integer > res) {
        if (isLeaf(root)) {
            res.add(root.data);
            return;
        }
        if (root.left != null) addLeaves(root.left, res);
        if (root.right != null) addLeaves(root.right, res);
    }
    static ArrayList < Integer > printBoundary(node2 node) {
        ArrayList < Integer > ans = new ArrayList < Integer > ();
        if (isLeaf(node) == false) ans.add(node.data);
        addLeftBoundary(node, ans);
        addLeaves(node, ans);
        addRightBoundary(node, ans);
        return ans;
    }

    public static void main(String args[]) {

    	node2 root = new node2(1);
        root.left = new node2(2);
        root.left.left = new node2(3);
        root.left.left.right = new node2(4);
        root.left.left.right.left = new node2(5);
        root.left.left.right.right = new node2(6);
        root.right = new node2(7);
        root.right.right = new node2(8);
        root.right.right.left = new node2(9);
        root.right.right.left.left = new node2(10);
        root.right.right.left.right = new node2(11);

        ArrayList < Integer > boundaryTraversal;
        boundaryTraversal = printBoundary(root);

        System.out.println("The Boundary Traversal is : ");
        for (int i = 0; i < boundaryTraversal.size(); i++) {
            System.out.print(boundaryTraversal.get(i) + " ");
        }

    }
}