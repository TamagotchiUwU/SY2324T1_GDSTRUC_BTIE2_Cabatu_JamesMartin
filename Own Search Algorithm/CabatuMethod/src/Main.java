import java.util.Random;

public class Main {

    public static void main(String[] args)
    {
        int[] numbers = new int[50];

        //Step 1: Gather data in an array
        for (int i = 0; i < numbers.length; i++) {
            int rng = new Random().nextInt(-100,100);
            numbers[i] = rng;
        }

        System.out.println(CabatuMethod(numbers));
    }

    private static int CabatuMethod(int[] numbers)
    {

        int length = numbers.length;
        int rng = new Random().nextInt(-100,100);

        System.out.println("Searching for the number " + rng + " in the index...\n");

        //Step 2: sort first
        Sort(numbers);
        int middle = (length) / 2;

        System.out.println("Sorted Array:");
        //print sorted array
        for (int number : numbers) {
            System.out.print(number + ", ");
        }

        //Step 3: find from middle to either pos or neg
        if (rng >= numbers[middle])
        {
            for (int i = middle; i < numbers.length ; i++) {
                if (numbers[i] == rng)
                {
                    System.out.print("\nThe number you are looking for is at index: ");
                    //Step 4: return value
                    return i;
                }
            }
        }

        else
        {
            for (int i = 0; i <= middle ; i++) {
                if (numbers[i] == rng)
                {
                    System.out.print("\nThe number you are looking for is at index: ");
                    //Step 4: return value
                    return i;
                }
            }
        }
        //no value found
        System.out.println("\nThe number you are looking for is not present in the array");
        return 404;
    }

    private static void Sort(int[] numbers) //looking for the smallest value first and put it at the front
    {
        for(int lastUnsortedIndex = numbers.length - 1; lastUnsortedIndex > 0; lastUnsortedIndex--)
        {
            int smallestIndex = 0;
            for (int i = 1; i <= lastUnsortedIndex; i++)
            {
                if (numbers[i] >= numbers[smallestIndex])
                {
                    smallestIndex = i;
                }
            }
            int temp = numbers[lastUnsortedIndex];
            numbers[lastUnsortedIndex] = numbers[smallestIndex];
            numbers[smallestIndex] = temp;
        }
    }
}