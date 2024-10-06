
import java.util.Scanner;

public class FirstWords {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        if (input.equals("")) {
            return;
        }
        
        String[] fragments = input.split(" ");
        int index = 0;
        while (!(input.equals("")) && index < fragments.length) {
            System.out.println(fragments[0]);
            input = scanner.nextLine();
            fragments = input.split(" ");
            index = 0;
        }
    }
}
