import java.util.Scanner;
public class NumberListProgram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[5];
        int count = 0;

        while (true) {
            System.out.print("Enter numbers and type Stop for exit: ");
            String input = scanner.next();
            if (input.equalsIgnoreCase("Stop")) {
                break;
            }
            try {
                int number = Integer.parseInt(input);
                if (count == numbers.length) {
                    numbers = resizeArray(numbers);
                }
                numbers[count] = number;
                count++;
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a valid number or 'exit'.");
            }
        }
        System.out.println("Input Numbers:");
        for (int i = 0; i < count; i++) {
            System.out.println(numbers[i]);
        }

        scanner.close();
    }

    private static int[] resizeArray(int[] array) {
        int newSize = array.length * 2;
        int[] newArray = new int[newSize];
        System.arraycopy(array, 0, newArray, 0, array.length);
        return newArray;
    }
}
