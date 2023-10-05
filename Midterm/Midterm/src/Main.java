import java.lang.reflect.Array;
import java.text.DecimalFormat;
import java.util.Random;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        int turn = 1;

        LinkedStack Deck = new LinkedStack();
        LinkedStack Hand = new LinkedStack();
        LinkedStack Pile = new LinkedStack();

        for (int i = 0; i < 10; i++)
        {
            Deck.push(new Card("A"));
            Deck.push(new Card("B"));
            Deck.push(new Card("C"));
        }

        while (!Deck.isEmpty())
        {
            Random RandomNumber = new Random();
            int randTurn = RandomNumber.nextInt(3);
            int randX = RandomNumber.nextInt(5);

            randX++;
            randTurn++;

            System.out.println("============\n" + "Turn: " + turn);

            switch (randTurn)
            {
                case 1:
                    //Draw 1-5

                    System.out.println("Draw " + randX + " Cards from Deck");
                    moveCard(Hand, Deck,randX);
                    break;
                case 2:
                    //Discard 1-5

                    System.out.println("Discard " + randX + " Cards");
                    moveCard(Pile, Hand,randX);
                    break;

                case 3:
                    //Draw 1-5 from discard pile

                    System.out.println("Draw " + randX + " Cards from Pile");
                    moveCard(Hand, Pile,randX);
                    break;
                default:
                    break;

            }
            turn++;
            System.out.println("cards in Deck: " + Deck.size());
            System.out.println("\ncards in Hand: " + Hand.size());
            Hand.printStack();
            System.out.println("\ncards in Pile: " + Pile.size());
        }

        System.out.println("Deck is now empty");
    }

    public static void moveCard(LinkedStack to, LinkedStack from, int randX)
    {
        if (from.isEmpty() || randX > from.size())
        {
            System.out.println("KULANG NG CARDS >:C");
        }
        else {
            for (int i = 0; i < randX; i++) {
                Card temp;
                temp = from.pop();
                to.push(temp);
            }
        }
    }
}