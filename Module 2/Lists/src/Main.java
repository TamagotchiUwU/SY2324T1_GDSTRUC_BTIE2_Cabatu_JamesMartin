import javax.swing.plaf.metal.MetalBorders;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        //Array List
        /*ArrayList<Player> playerList = new ArrayList<Player>();

        playerList.add(new Player(47, "Xavier Aquino"));
        playerList.add(new Player(15, "Jason Cepeda"));
        playerList.add(new Player(1, "Jan Zacarias"));

        //printList(playerList);
        System.out.println("before insert");
        System.out.println("player at index 1: " + playerList.get(1));

        playerList.add(1, new Player(2,"Johann Caraga"));

        System.out.println("\nafter insert");
        System.out.println("player at index 1: " + playerList.get(1));

        System.out.println("\nBefore Removing");
        printList(playerList);

        playerList.remove(3);

        System.out.println("\nAfter Removing");
        printList(playerList);

        System.out.println("\n\nDoes the array contain Jason Cepeda?");
        System.out.println(playerList.contains(new Player(15,"Jason Cepeda")));

        System.out.println("\nWhat is the index of Xavier?");
        System.out.println(playerList.indexOf(new Player(47,"Xavier Aquino")));*/

        //Linked List
        PlayerLinkedList playerLinkedList = new PlayerLinkedList();
        playerLinkedList.sizeOfList();

        playerLinkedList.addToFront(new Player(47, "Xavier Aquino"));
        playerLinkedList.addToFront(new Player(15, "Jason Cepeda"));
        playerLinkedList.addToFront(new Player(1, "Jan Zacarias"));
        playerLinkedList.addToFront(new Player(2, "James Cabatu"));

        System.out.println("\n\nDoes the Linked List contain Xavier Aquino?");
        System.out.println(playerLinkedList.contains(new Player(47, "Xavier Aquino")));

        System.out.println("\nWhat is the index of Xavier?");
        System.out.println(playerLinkedList.indexOf(new Player(47,"Xavier Aquino")));

        System.out.println("Before Remove:");
        playerLinkedList.printList();

        System.out.print("After Remove:");
        playerLinkedList.removeFirst();
        playerLinkedList.printList();

    }

    public static void printList(ArrayList<Player> playerList)
    {
        for (Player player: playerList)
        {
            System.out.print(player + ", ");
        }
    }
}