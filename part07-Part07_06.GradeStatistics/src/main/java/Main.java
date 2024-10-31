
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        GradeStatistics gs = new GradeStatistics();
        
        while (true) {
            int input = Integer.valueOf(scanner.nextLine());
            if (input == -1) {
                break;
            }
            gs.addGrade(input);
        }
        System.out.println("Point average (all): " + gs.average());
        System.out.println("Point average (passing): " + gs.passingAverage());
        System.out.println("Pass percentage: " + gs.passingPercentage());
        gs.printDist();
    }
}
