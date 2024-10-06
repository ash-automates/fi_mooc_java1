
import java.util.Scanner;

public class NameOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int ageOfOldest = 0;
        String nameOfOldest = "";
        while (true) {
            String input = scanner.nextLine();
            if (input.equals("")) {
                break;
            }
            String[] fragments = input.split(",");
            if (Integer.valueOf(fragments[1]) > ageOfOldest) {
                nameOfOldest = fragments[0];
                ageOfOldest = Integer.valueOf(fragments[1]);
            }
        }
        System.out.println("Name of the oldest: " + nameOfOldest);

    }
}
