
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hachem
 */
public class RecipeList {
    private ArrayList<Recipe> recipes;

    public RecipeList() {
        this.recipes = new ArrayList<>();
    }
    
    public void addRecipe(String name, int cookTime, ArrayList<String> ings) {
        this.recipes.add(new Recipe(name, cookTime, ings));
    }

    public void list() {
        for (Recipe recipe : recipes) {
            System.out.println(recipe);
        }
    }
    
    public void findByName(String target) {
        for (Recipe recipe : recipes) {
            if (recipe.getName().contains(target)) {
                System.out.println(recipe);
            }
        }
    }
    
    public void findByCookTime(int max) {
        for (Recipe recipe : recipes) {
            if (recipe.getCookTime() <= max) {
                System.out.println(recipe);
            }
        }
    }
    
    public void findByIngredient(String target) {
        for (Recipe recipe : recipes) {
            if (recipe.getIngredients().contains(target)) {
                System.out.println(recipe);
            }
        }
    }
}
