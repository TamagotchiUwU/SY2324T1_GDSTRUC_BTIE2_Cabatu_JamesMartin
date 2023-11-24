public class Tree {
    private Node root;

    public void insert(int value)
    {
        if (root != null)
        {
            root.insert(value);
        }
        else
        {
            root = new Node(value);
        }
    }

    public void traverseInOrder()
    {
        if (root != null)
        {
            root.traverseInOrder();
        }
        else
        {
            System.out.println("No root yet");
        }
    }

    public Node get(int value)
    {
        if (root != null)
        {
            return root.get(value);
        }
        else
        {
            System.out.println("No root yet");
            return null;
        }
    }

    public Node GetMin()
    {
        if (root == null) {
            System.out.println("The tree is empty.");
            return null;
        }
        System.out.println(root.GetMin());
        return null;
    }

    public Node GetMax()
    {
        if (root == null) {
            System.out.println("The tree is empty.");
            return null;
        }
        System.out.println(root.GetMax());
        return null;
    }

    public void traverseInOrderDescending()
    {
        if (root != null)
        {
            root.traverseInOrderDescending();
        }
        else
        {
            System.out.println("No root yet");
        }
    }
}
