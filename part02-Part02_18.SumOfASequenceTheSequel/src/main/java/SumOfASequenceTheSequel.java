
import java.util.Scanner;

public class SumOfASequenceTheSequel {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("First number? ");
        int start = Integer.valueOf(scanner.nextLine());
        System.out.print("Last number? ");
        int end = Integer.valueOf(scanner.nextLine());
        int sum = 0;
        while (start <= end) {
            sum = sum + start;
            start = start + 1;
        }
        System.out.println("The sum is " + sum);
    }
}
