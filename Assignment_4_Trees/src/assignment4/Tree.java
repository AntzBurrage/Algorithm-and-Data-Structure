package assignment4;

public class Tree
{

    private TreeNode root;

    public Tree()
    {
        root = null;
    }

    //Insert Node Function
    public synchronized void insertNode(int d)
    {
        if (root == null)
        {
            root = new TreeNode(d);
        } else
        {
            root.insert(d);
        }
    }

    //Print Function
    public synchronized String Print()
    {
        return Print(root);
    }

    private String Print(TreeNode node)
    {

        if (node == null)
        {
            return "";
        }
        String leftString = Print(node.getLeft());
        String parentString = (node.getData() + " " + PrintNodeDetails(node));
        String rightString = Print(node.getRight());

        return leftString + "\n" + parentString + "\n" + rightString;
    }

    private String PrintNodeDetails(TreeNode node)
    {

        if (node.IsLeaf())
        {
            return " LeafNode";
        }
        String leftString = PrintNodeDetailLeft(node.getLeft());
        String rightString = PrintNodeDetailRight(node.getRight());

        return leftString + " " + rightString;
    }

    private String PrintNodeDetailLeft(TreeNode node)
    {
        if (node == null)
        {
            return "";
        }
        String detail = " Left SubTree value of " + node.getData();
        return detail;
    }

    private String PrintNodeDetailRight(TreeNode node)
    {
        if (node == null)
        {
            return "";
        }
        String detail = " Right SubTree value of " + node.getData();
        return detail;
    }

    //Empty Tree Function
    public void emptyTree()
    {
        this.root = null;
    }

}
