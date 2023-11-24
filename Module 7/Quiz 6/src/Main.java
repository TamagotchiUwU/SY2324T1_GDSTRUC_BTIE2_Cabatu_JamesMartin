
public class Main {
    public static void main(String[] args) {
        Tree tree = new Tree();

        tree.insert(20);
        tree.insert(5);
        tree.insert(50);
        tree.insert(1);
        tree.insert(17);
        tree.insert(38);
        tree.insert(69);

        System.out.println("\nGetting values (Ascending)");
        tree.traverseInOrder();
        //System.out.println(tree.get(69));
        System.out.println("\nGetting values (Descending)");
        tree.traverseInOrderDescending();
        System.out.println("\nGetting Min Value");
        tree.GetMin();

        System.out.println("\nGetting Max Value");
        tree.GetMax();
    }
}