
public class StarSign {

    public static void main(String[] args) {

        
        //The tests are not checking the main, so you can modify it freely.
        //NB: If the tests don't seem to pass, you should try the methods here
        //in the main to make sure they print the correct shapes!
        
        printStars(3);
        System.out.println("\n---");  // printing --- between the shapes
        printSquare(4);
        System.out.println("\n---");
        printRectangle(5, 6);
        System.out.println("\n---");
        printTriangle(3);
        System.out.println("\n---");
    }

    public static void printStars(int number) {
        int i = 0;
        while(i < number) {
            System.out.print("*");
            i = i + 1;
        }
        System.out.println("");
    }

    public static void printSquare(int size) {
        int i = 0;
        while (i < size) {
            printStars(size);
            i = i + 1;
        }
    }

    public static void printRectangle(int width, int height) {
        int i = 0;
        while (i < height) {
            printStars(width);
            i = i + 1;
        }
    }

    public static void printTriangle(int size) {
        int i = 1;
        while (i <= size) {
            printStars(i);
            i = i + 1;
        }
    }
}
