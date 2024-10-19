/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.ArrayList;
/**
 *
 * @author hachem
 */
public class Hold {
    private int maxWeight;
    private ArrayList<Suitcase> suitcases;

    public Hold(int maxWeight) {
        this.maxWeight = maxWeight;
        this.suitcases = new ArrayList<>();
    }
    
    public int totalWeight() {
        int totalWeight = 0;
        for (Suitcase sc: suitcases) {
            totalWeight += sc.totalWeight();
        }
        return totalWeight;
    }
    
    public void addSuitcase(Suitcase suitcase) {
        if (this.maxWeight - this.totalWeight() >= suitcase.totalWeight()) {
            suitcases.add(suitcase);
        }
    }
    
    public String toString() {
        return suitcases.size() + " suitcases (" + totalWeight() + " kg)";
    }
    
    public void printItems() {
        for (Suitcase sc: suitcases) {
            sc.printItems();
        }
    }
}
