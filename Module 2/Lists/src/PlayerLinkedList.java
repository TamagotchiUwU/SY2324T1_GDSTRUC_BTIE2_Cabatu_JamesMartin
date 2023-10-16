import org.w3c.dom.Node;

import java.util.Objects;

public class PlayerLinkedList {
    private PlayerNode head;

    private int size;

    public void sizeOfList()
    {
        PlayerNode current = head;

        while (current != null)
        {
            current = current.getNextPlayer();
            size++;
        }
        System.out.println("size of List: " + size);
    }

    public void addToFront(Player player)
    {
        PlayerNode playerNode = new PlayerNode(player);
        playerNode.setNextPlayer(head);
        head = playerNode;
        size++;
    }

    public void removeFirst()
    {
        PlayerNode current = head;
        current.setPlayer(null);
        current.setNextPlayer(null);
        size--;
    }

    public boolean contains(Player player)
    {
        PlayerNode current = head;

        while(current.getPlayer().getID() != player.getID() || !Objects.equals(current.getPlayer().getName(), player.getName()))
        {
            current = current.getNextPlayer();
        }
        return current.getPlayer().getID() == player.getID() && current.getPlayer().getName().equals(player.getName());
    }

    public int indexOf(Player player)
    {
        PlayerNode current = head;
        int counter = 0;

        while(player.getID() != current.getPlayer().getID()|| !Objects.equals(current.getPlayer().getName(), player.getName()))
        {
            current = current.getNextPlayer();
            counter++;
        }
        System.out.println("Index: ");
        return counter;
    }

    public void printList()
    {
        PlayerNode current = head;

        while (current != null)
        {
            System.out.print(current.getPlayer() + " -> ");
            current = current.getNextPlayer();
        }

        System.out.println("null");
        System.out.println("List size: " + size);
    }

}
