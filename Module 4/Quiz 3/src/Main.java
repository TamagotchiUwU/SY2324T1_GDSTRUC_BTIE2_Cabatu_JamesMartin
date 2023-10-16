import java.util.Random;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        ArrayQueue queue = new ArrayQueue(5);
        int gamesMade = 0;
        int playerCount = 0;

        while(gamesMade < 10)
        {
            Random RandomNumber = new Random();
            int randX = RandomNumber.nextInt(7) + 1;

            playerCount += randX;

            System.out.println("=====================\n" + "Games Made: " + gamesMade);

            System.out.println(randX + " Players joined the queue");

            for (int i = 0; i < randX; i++) {
                queue.queue(new Player(String.valueOf(i)));
            }

            System.out.println("Players in queue: " + playerCount);
            queue.printQueue();

            System.out.println("=====================\n");
            if (playerCount >= 5)
            {
                System.out.println("Press Enter to Create game for 5 Players");
                Scanner scanner = new Scanner(System.in);
                scanner.nextLine();
                for (int i = 0; i < 5; i++)
                {
                    queue.dequeue();
                }
                playerCount -= 5;
                gamesMade++;
            }
            else
            {
             System.out.println("Not enough players!\n" + "Need at least 5 players to create a game");
                System.out.println("Press Enter to wait for more players");
                Scanner scanner = new Scanner(System.in);
                scanner.nextLine();
            }

        }

        System.out.println(gamesMade + " Games Made!");
    }


}