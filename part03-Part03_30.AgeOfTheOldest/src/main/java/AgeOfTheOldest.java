
import java.util.Scanner;

public class AgeOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int ageOfOldest = 0;
        while (true) {
            String input = scanner.nextLine();
            if (input.equals("")) {
                break;
            }
            String[] fragments = input.split(",");
            if (Integer.valueOf(fragments[1]) > ageOfOldest) {
                ageOfOldest = Integer.valueOf(fragments[1]);
            }
        }
        System.out.println("Age of the oldest: " + ageOfOldest);

    }
}
