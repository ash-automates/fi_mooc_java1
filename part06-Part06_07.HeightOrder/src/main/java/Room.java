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
public class Room {
    private ArrayList<Person> persons;

    public Room() {
        this.persons = new ArrayList<>();
    }
    
    public void add(Person person) {
        this.persons.add(person);
    }
    
    public boolean isEmpty() {
        return this.persons.isEmpty();
    }
    
    public ArrayList<Person> getPersons() {
        return this.persons;
    }
    
    public Person shortest() {
        if (this.isEmpty()) {
            return null;
        }
        
        Person rtnObj = getPersons().get(0);
        for (Person prs: persons) {
            if (prs.getHeight() < rtnObj.getHeight()) {
                rtnObj = prs;
            }
        }
        
        return rtnObj;
    }
    
    public Person take() {
        Person shortest = this.shortest();
        this.persons.remove(shortest);
        return shortest;
    }
}
