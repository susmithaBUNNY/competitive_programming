import java.util.*;
class BinaryTreeNode {
    public int value;
    public BinaryTreeNode left;
    public BinaryTreeNode right;
    public BinaryTreeNode(int value) {
        this.value = value;
    }
    public BinaryTreeNode insertLeft(int leftValue) {
        this.left = new BinaryTreeNode(leftValue);
        return this.left;
    }
    public BinaryTreeNode insertRight(int rightValue) {
        this.right = new BinaryTreeNode(rightValue);
        return this.right;
    }
}
public class BinarySearchTreeChecker {
    public boolean checkBST(BinaryTreeNode root,int min,int max)
    {
        if(root!=null)
        {
            if(root.value>min && root.value<max){
                return checkBST(root.left,min,root.value) && checkBST(root.right,root.value,max);
            }
            else{
                return false;
            }
        }
        else
        {
            return true;
        }
    }
    public static void main(String[] args) {
        BinaryTreeNode bt = new BinaryTreeNode(100);
        BinaryTreeNode b =bt.insertLeft(60);
        BinaryTreeNode b60 = b.insertRight(70);
        BinaryTreeNode b20 = b.insertLeft(20);
        BinaryTreeNode b80 = bt.insertRight(180);
       
        

        BinarySearchTreeChecker obj = new BinarySearchTreeChecker();
        System.out.println(obj.checkBST(bt,Integer.MIN_VALUE,Integer.MAX_VALUE));
    }
}
