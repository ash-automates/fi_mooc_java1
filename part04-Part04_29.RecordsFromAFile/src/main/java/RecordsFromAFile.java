
import java.nio.file.Paths;
import java.util.Scanner;

public class RecordsFromAFile {

    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);
        System.out.println("Name of the file:");
        String input = inputScanner.nextLine();
        try (Scanner scanner = new Scanner(Paths.get(input))) {
            while (scanner.hasNextLine()) {
                String[] parts = scanner.nextLine().split(",");
                String name = parts[0];
                int age = Integer.valueOf(parts[1]);
                String pluralize = age == 1 ? "year" : "years";
                System.out.println(name + ", age: " + age + " " + pluralize);
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
