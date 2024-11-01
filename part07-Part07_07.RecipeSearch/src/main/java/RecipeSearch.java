
import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;
import java.nio.file.Paths;

public class RecipeSearch {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        RecipeList rl = new RecipeList();
        System.out.println("File to read:");
            String uri = scanner.nextLine();
            try (Scanner fs = new Scanner(Paths.get(uri))) {
                ArrayList<String> lines = new ArrayList<>();
                while (fs.hasNextLine()) {
                    String line = fs.nextLine();
                    if (line.isEmpty() || !fs.hasNextLine()) {
                        String name = lines.get(0);
                        int cookTime = Integer.valueOf(lines.get(1));
                        ArrayList<String> ingredients = new ArrayList<>();
                        for (int i = 2; i < lines.size(); i++) {
                            ingredients.add(lines.get(i));
                        }
                        rl.addRecipe(name, cookTime, ingredients);
                        lines.clear();
                        continue;
                    }
                    lines.add(line);   
                }
            } catch (Exception e) {
                System.out.println("Error: " + e.getMessage());
            }
        while (true) {
            System.out.println("");
            System.out.println("Commands:");
            System.out.println("list - lists the recipes");
            System.out.println("stop - stops the program");
            System.out.println("find name - searches recipes by name");
            System.out.println("find cooking time - searches recipes by cooking time");
            System.out.println("find ingredient - searches recipes by ingredient");
            System.out.println("");
            System.out.println("Enter command:");
            String cmd = scanner.nextLine();
            if (cmd.equals("stop")) {
                break;
            }
            
            if (cmd.equals("list")) {
                System.out.println("\nRecipes:");
                rl.list();
            }
            if (cmd.equals("find name")) {
                System.out.println("Searched word:");
                String target = scanner.nextLine();
                System.out.println("\nRecipes:");
                rl.findByName(target);
            }
            if (cmd.equals("find cooking time")) {
                System.out.println("Max cooking time:");
                int max = Integer.valueOf(scanner.nextLine());
                System.out.println("\nRecipes:");
                rl.findByCookTime(max);
            }
            if (cmd.equals("find ingredient")) {
                System.out.println("Ingredient:");
                String target = scanner.nextLine();
                System.out.println("\nRecipes:");
                rl.findByIngredient(target);
            }
        }
    }

}
