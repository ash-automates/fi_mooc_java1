
import java.util.Scanner;

public class mainProgram {

    public static void main(String[] args) {
        // NB! Do not create other scanner objects than the one below
        // if and when you create other classes, pass the scanner to them
        // as a parameter

        Scanner scan = new Scanner(System.in);
        BirdList bl = new BirdList();
        while (true) {
            System.out.println("?");
            String cmd = scan.nextLine();
            if (cmd.equals("Quit")) {
                break;
            }
            if (cmd.equals("Add")) {
                System.out.println("Name:");
                String name = scan.nextLine();
                System.out.println("Name in Latin:");
                String inLat = scan.nextLine();
                bl.addBird(name, inLat);
            }
            if (cmd.equals("Observation")) {
                System.out.println("Bird?");
                String bird = scan.nextLine();
                Bird fetched = bl.getBird(bird);
                if (fetched != null) {
                    fetched.setObs(fetched.getObs() + 1);
                } else {
                    System.out.println("Not a bird!");
                }   
            }
            if (cmd.equals("All")) {
                for (Bird bird : bl.getBirds()) {
                    System.out.println(bird);
                }
            }
            if (cmd.equals("One")) {
                System.out.println("Bird?");
                String bird = scan.nextLine();
                Bird fetched = bl.getBird(bird);
                if (fetched != null) {
                    System.out.println(fetched);
                } else {
                    System.out.println("Not a bird!");
                }
            }
        }
    }

}
