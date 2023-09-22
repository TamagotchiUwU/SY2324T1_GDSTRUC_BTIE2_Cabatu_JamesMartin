// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        float[] numbers = new float[5];

        numbers[0] = 8.34f;
        numbers[1] = 12.24724f;
        numbers[2] = 24.4564f;
        numbers[3] = 48.13233f;
        numbers[4] = 72.1346f;

        // printing array
        for (int i = 0; i < numbers.length; i++)
        {
            System.out.print(numbers[i] + ", ");
        }

        // Linear Search
        int index = -1;
        float number = 48.13233f;

        for (int i = 0; i < numbers.length; i++)
        {
            if (numbers[i] == number)
            {
                index = i;
                break;
            }
        }

        if (index > -1)
        {
            System.out.println("Number " + number + " is at index " + index);
        }
        else
        {
            System.out.println("Number " + number + " is not in the array");
        }

        }
    }