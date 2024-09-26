
import java.util.Scanner;

public class NumberOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int values = 0;
        
        
        while (true) {
            System.out.println("Give a number:");
            // The task is to read a user inputted number
            int number = Integer.valueOf(scanner.nextLine());

            // The task is to exit the loop if the user
            // has inputted zero
            if (number == 0) {
                break;
            }
            
            // The task is to increase the amount of values
            // if the user inputs a number
            values = values + 1;
            
        }

        // The task is to print out the total of values
        System.out.println("Number of numbers: " + values);
    }
}
