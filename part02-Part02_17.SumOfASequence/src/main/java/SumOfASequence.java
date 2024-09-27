
import java.util.Scanner;

public class SumOfASequence {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Last number? ");
        int n = Integer.valueOf(scanner.nextLine());
        int step = 0;
        int sum = 0;
        while (step <= n) {
            sum = sum + step;
            step = step + 1;
        }
        System.out.println("The sum is " + sum);
    }
}
