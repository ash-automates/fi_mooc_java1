
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
public class BirdList {
    private ArrayList<Bird> birds;

    public BirdList() {
        this.birds = new ArrayList<>();
    }
    
    public void addBird(String name, String inLat) {
        this.birds.add(new Bird(name, inLat));
    }

    public Bird getBird(String name) {
        for (Bird bird : this.birds) {
            if (bird.getName().equals(name)) {
                return bird;
            }
        }
        return null;
    }

    public ArrayList<Bird> getBirds() {
        return birds;
    }
    
}
