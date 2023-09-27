public class Main {
    public static void main(String[] args) {
        int[] numbers = new int[5];

        numbers[0] = 19;
        numbers[1] = 24;
        numbers[2] = 15;
        numbers[3] = 69;
        numbers[4] = 7;

        System.out.println("Unsorted:");
        printArray(numbers);
        System.out.println("\n");

        selectionSort(numbers);

        System.out.println("Selection Sorted:");
        printArray(numbers);
        System.out.println("\n");
    }

    public static void bubbleSort(int[] array) //Descending order
    {
        // i = pass
        for (int i = 0; i < array.length; i++)
        {
            for (int j = 0; j < (array.length - 1) - i; j++)
            {
                if (array[j] < array[j+1])
                {
                    // Switch Values
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
            }
        }
    }

    public static void selectionSort(int[] array)
    {
        for(int lastUnsortedIndex = array.length - 1; lastUnsortedIndex > 0; lastUnsortedIndex--)
        {
            int smallestIndex = 0;
            for (int i = 1; i <= lastUnsortedIndex; i++)
            {
                if (array[i] <= array[smallestIndex])
                {
                    smallestIndex = i;
                }
            }
            int temp = array[lastUnsortedIndex];
            array[lastUnsortedIndex] = array[smallestIndex];
            array[smallestIndex] = temp;

            //Checker
            System.out.println("\npass " + lastUnsortedIndex + ":");
            printArray(array);
            System.out.println("\n");
        }
    }

    public static void printArray(int[] array)
    {
        for (int number : array)
        {
            System.out.print(number + ", ");
        }
    }
}