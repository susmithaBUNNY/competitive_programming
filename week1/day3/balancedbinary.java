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


class Height
{
    int height = 0;
}
public class BalancedBinaryTree {
    public boolean isBalanced(BinaryTreeNode root,Height h)
    {
        if(root==null)
        {
            h.height=0;
            return true;
        }
        Height lh=new Height();
        Height rh=new Height();

        boolean leftSTree=isBalanced(root.left,lh);
        boolean rightSTree=isBalanced(root.right,rh);

        h.height=(lh.height>rh.height?lh.height:rh.height)+1;

        if((lh.height-rh.height>=2)||(rh.height-lh.height>=2))
        {
            if((lh.height!=0)&&(rh.height!=0))
                return false;
        }


            return leftSTree & rightSTree;

    }
    public static void main(String[] args) {
        Height height = new Height();
        BalancedBinaryTree tree=new BalancedBinaryTree();
        BinaryTreeNode bt = new BinaryTreeNode(50);


        BinaryTreeNode m1 =bt.insertLeft(30);
        BinaryTreeNode m2 = m1.insertRight(40);
        BinaryTreeNode m3 = m1.insertLeft(20);
        BinaryTreeNode m4 = bt.insertRight(80);
        BinaryTreeNode m5 = m4.insertLeft(70);
        BinaryTreeNode m6 = m4.insertRight(90);



        System.out.println(tree.isBalanced(bt,height));
    }
}
