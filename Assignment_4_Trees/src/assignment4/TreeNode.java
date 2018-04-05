package assignment4;

public class TreeNode
{

    private TreeNode left;
    private final int data;
    private TreeNode right;

    public TreeNode(int d)
    {
        data = d;
        left = right = null;
    }

    //Get Right Branch
    public TreeNode getRight()
    {
        return right;
    }

    //Get Left Branch
    public TreeNode getLeft()
    {
        return left;
    }

    //Is Leaf
    public boolean IsLeaf()
    {
        return (this.left == null && this.right == null);
    }

    //Get Data
    public int getData()
    {
        return data;
    }

    //Insert Function
    public synchronized void insert(int d)
    {
        if (d < getData())
        {
            if (getLeft() == null)
            {
                this.left = (new TreeNode(d));
            } else
            {
                getLeft().insert(d);
            }
        } else if (d > getData())
        {
            if (getRight() == null)
            {
                this.right = (new TreeNode(d));
            } else
            {
                getRight().insert(d);
            }
        }
    }
}
