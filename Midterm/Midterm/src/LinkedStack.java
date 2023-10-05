import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedStack {
    private LinkedList<Card> stack;

    public LinkedStack()
    {
        stack = new LinkedList<>();
    }

    public void push(Card Card)
    {
        stack.push(Card);
    }

    public boolean isEmpty()
    {
        return stack.isEmpty();
    }

    public Card pop()
    {
        return stack.pop();
    }

    public Card peek()
    {
        return stack.peek();
    }

    public int size()
    {
        return stack.size();
    }

    public void printStack()
    {
        ListIterator<Card> iterator = stack.listIterator();

        while (iterator.hasNext())
        {
            System.out.println(iterator.next());
        }
    }





}