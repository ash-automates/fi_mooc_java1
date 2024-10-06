
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalDetails {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String longestName = "";
        int longestNameSize = 0;
        int sumOfYears = 0;
        int count = 0;
        
        while (true) {
            String input = scanner.nextLine();
            if (input.equals("")) {
                break;
            }
            String[] fragments = input.split(",");
            sumOfYears += Integer.valueOf(fragments[1]);
            count += 1;
            if (fragments[0].length() > longestNameSize) {
                longestName = fragments[0];
                longestNameSize = fragments[0].length();
            }
        }
        System.out.println("Longest name: " + longestName);
        System.out.println("Average of the birth years: " + (1.0 * sumOfYears / count));
    }
}
