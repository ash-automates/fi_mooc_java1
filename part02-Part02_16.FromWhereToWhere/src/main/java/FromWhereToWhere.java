
import java.util.Scanner;

public class FromWhereToWhere {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Where to? ");
        int limit = Integer.valueOf(scanner.nextLine());
        System.out.print("Where from? ");
        int iteration = Integer.valueOf(scanner.nextLine());
        while (iteration <= limit) {
            System.out.println(iteration);
            iteration++;
        }
    }
}
