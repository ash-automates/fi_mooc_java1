
import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Give a number: ");
        int n = Integer.valueOf(scanner.nextLine());
        int product;
        if (n == 0) {
            product = 0;
        } else {
            product = 1;
            int step = 1;
            while (step <= n) {
                product = product * step;
                step = step + 1;
            }
        }
        
        System.out.println("Factorial: " + product);
    }
}
