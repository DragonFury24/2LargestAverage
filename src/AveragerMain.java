import java.util.Arrays;
import java.util.Scanner;

public class AveragerMain {
    public static void main(String[] args) {
        Scanner keyType = new Scanner(System.in);
        int[]   numbers = new int[10];

        System.out.println("Type in 10 numbers.");

        //Instantiates @numbers with user input
        for (int i = 0; i < 10; i++)
            numbers[i] = NumberInput.intInput(keyType);

        keyType.nextLine();

        //Sort @numbers
        numbers = Arrays.stream(numbers)
                        .sorted()
                        .toArray();

        //Calculate average of 2 largest numbers
        int twoLargestAverage = average(numbers[numbers.length - 1], numbers[numbers.length - 2]);

        System.out.println("Average of 2 largest numbers is " + twoLargestAverage);
    }

    static int average(int num1, int num2) {
        return num1 + num2;
    }
}
