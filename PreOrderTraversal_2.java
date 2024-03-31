import java.util.*;
public class PreOrderTraversal_2 {
    public static class Node {
        int data;
        Node right, left;

        Node(int data) {
            this.data = data;
            right = left = null;
        }
    }

    Node root = null;

    public static void main(String[] args) {
        PreOrderTraversal_2 ob = new PreOrderTraversal_2();
        ob.root = new PreOrderTraversal_2.Node(5);
        ob.root.left = new PreOrderTraversal_2.Node(7);
        ob.root.right = new PreOrderTraversal_2.Node(8);
        ob.root.right.left = new PreOrderTraversal_2.Node(9);
        System.out.print("Pre-Order Traversal(recursion) :  ");
        ob.preorder_r(ob.root);
        System.out.print("\n");
        System.out.print("Pre-Order Traversal(without recursion) :  ");
        ob.preorder_wr(ob.root);
    }

    void preorder_r(Node root) {
        if (root != null) {
            System.out.print(root.data + " ");
            preorder_r(root.left);
            preorder_r(root.right);
        }
    }

    void preorder_wr(Node root) {
        Stack<Node> st = new Stack<>();
        st.push(root);
        while (!st.isEmpty()) {
            Node top = st.pop();
            System.out.print(top.data + " ");
            if (top.right!= null)
                st.push(top.right);
            if (top.left != null)
                st.push(top.left);
        }
    }
}
