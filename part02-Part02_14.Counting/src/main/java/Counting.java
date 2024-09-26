
import java.util.Scanner;

public class Counting {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int end = Integer.valueOf(scanner.nextLine());
        int iteration = 0;
        while (iteration <= end) {
            System.out.println(iteration);
            iteration++;
        }
    }
}
