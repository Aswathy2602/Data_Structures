public class BinaryTree_Size_1 {
    public static class Node{
        int data; Node left,right;
        Node(int data){
            this.data=data;
            left=right=null;
        }
    }Node root=null;
    public int size(Node root){
        if(root==null)
            return 0;
        int ls=size(root.left);
        int rs=size(root.right);
        return ls+rs+1;
    }
    public static void main(String[] args) {
        BinaryTree_Size_1 bt=new BinaryTree_Size_1();
        bt.root=new BinaryTree_Size_1.Node(1);
        bt.root.left=new BinaryTree_Size_1.Node(2);
        bt.root.right=new BinaryTree_Size_1.Node(3);
        bt.root.left.left=new BinaryTree_Size_1.Node(4);
        bt.root.right.left=new BinaryTree_Size_1.Node(5);
        bt.root.left.right=new BinaryTree_Size_1.Node(0);
        bt.root.right.right=new BinaryTree_Size_1.Node(7);
        int SizeOfTree=bt.size(bt.root);
        System.out.println("Size of the Tree is "+SizeOfTree);
    }
}
