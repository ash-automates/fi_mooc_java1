
import java.util.Scanner;

public class SumOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        
        
        while (true) {
            System.out.println("Give a number:");
            // The task is to read a user inputted number
            int number = Integer.valueOf(scanner.nextLine());

            // The task is to exit the loop if the user
            // has inputted zero
            if (number == 0) {
                break;
            }
            
            // The task is to sum up the values
            // if the user inputs a number
            sum = sum + number;
            
        }

        // The task is to print out the sum
        System.out.println("Sum of the numbers: " + sum);

    }
}
