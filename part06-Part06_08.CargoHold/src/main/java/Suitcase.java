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
public class Suitcase {
    private ArrayList<Item> items;
    private int maxWeight;

    public Suitcase(int maxWeight) {
        this.items = new ArrayList<>();
        this.maxWeight = maxWeight;
    }
    
    public int totalWeight() {
        int totalWeight = 0;
        for (Item i: items) {
            totalWeight += i.getWeight();
        }
        return totalWeight;
    }
    
    public void addItem(Item item) {
        if (maxWeight - totalWeight() >= item.getWeight()) {
            items.add(item);
        }
    }
    
    public String toString() {
        if (items.isEmpty()) {
            return "no items (0 kg)";
        }
        return items.size() + " " + (items.size() > 1 ? "items" : "item") + " (" + this.totalWeight() + " kg)";
    }
    
    public void printItems() {
        for (Item i: items) {
            System.out.println(i);
        }
    }
    
    public Item heaviestItem() {
        if (items.isEmpty()) {
            return null;
        }
        Item rtnObj = items.get(0);
        for (Item i: items) {
            if (i.getWeight() > rtnObj.getWeight()) {
                rtnObj = i;
            }
        }
        return rtnObj;
    }
}
