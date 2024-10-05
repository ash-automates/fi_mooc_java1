
import java.util.Scanner;

public class Login {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter username: ");
        String usr = scanner.nextLine();
        System.out.print("Enter password: ");
        String pwd = scanner.nextLine();
        if ((usr.equals("alex") && pwd.equals("sunshine")) || (usr.equals("emma") && pwd.equals("haskell"))) {
            System.out.println("You have successfully logged in!");
        } else {
            System.out.println("Incorrect username or password!");
        }
    }
}
