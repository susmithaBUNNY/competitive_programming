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

public class SecondLargestBinarySearchTree {


    public Integer secondLargest(BinaryTreeNode root, Integer max,Integer max2)
    {
        if (root == null)
        {
            return max2;
        }
        if (root.right!=null) {
            if (max<root.right.value) {
                max2=max;
                max=root.right.value;
            }
            else if(max2<root.right.value){
                max2 = root.right.value;
            }

            return secondLargest(root.right,max,max2);
        }
        else if(root.left!=null){
            if(max2<root.left.value){
                max2=root.left.value;
            }
            return secondLargest(root.left,max,max2);

        }
        else return max2;


    }

    public static void main(String[] args) {
        BinaryTreeNode bst = new BinaryTreeNode(50);
        BinaryTreeNode b30 =bst.insertLeft(30);
        BinaryTreeNode b40 = b30.insertRight(40);
        BinaryTreeNode b20 = b30.insertLeft(20);
        BinaryTreeNode b80 = bst.insertRight(80);
        BinaryTreeNode b70 = b80.insertLeft(70);
        BinaryTreeNode b90 = b80.insertRight(90);


        SecondLargestBinarySearchTree obj = new SecondLargestBinarySearchTree();
        System.out.println(obj.secondLargest(bst,bst.value,Integer.MIN_VALUE));
    }

}
