/*There are a few properties in Red Black Trees which are described as below... Each Node must be either Black or Red...
The Root Node must always be Black... Every Leaf or Null Node is also always Black... If a Node is Red then both its children
are Black and vice-versa... For each Node all simple paths from the Nodes to the descendent leaves must have same number
of Black Nodes... The height of a path is the number of Black Nodes excluding the parent black Node is termed as the Black Height...
*/
import java.util.*;
class RedandBlackNode
{
    RedandBlackNode left;
    RedandBlackNode right;
    int data;
    int color;
    public RedandBlackNode(int val)
    {
        this.left = null;
        this.right = null;
        this.data = val;
    }
    public RedandBlackNode(int val, RedandBlackNode leftchild, RedandBlackNode rightchild)
    {
        this.data = val;
        this.left = leftchild;
        this.right = rightchild;
        color = 1;
    }
}
public class RedandBlackTrees
{
    static RedandBlackNode Root;
    RedandBlackNode current;
    RedandBlackNode parent;
    RedandBlackNode head;
    RedandBlackNode grandNode;
    RedandBlackNode greatNode;

    static final int Red = 0;
    static final int Black = 1;

    static
    {
        Root = new RedandBlackNode(0);
        Root.left = Root;
        Root.right = Root;
    }
    public RedandBlackTrees(int head_val)
    {
        this.head = new RedandBlackNode(head_val);
        this.head.left = Root;
        this.head.right = Root;
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        sc.close();
    }
}