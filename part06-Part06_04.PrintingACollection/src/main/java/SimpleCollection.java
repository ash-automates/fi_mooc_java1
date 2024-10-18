
import java.util.ArrayList;

public class SimpleCollection {

    private String name;
    private ArrayList<String> elements;

    public SimpleCollection(String name) {
        this.name = name;
        this.elements = new ArrayList<>();
    }

    public void add(String element) {
        this.elements.add(element);
    }

    public ArrayList<String> getElements() {
        return this.elements;
    }
    
    public String toString() {
        if (this.elements.isEmpty()) {
            return "The collection " + this.name + " is empty.";
        } else {
            int size = this.elements.size();
            String returned = "The collection " + this.name + " has " + size + (size == 1 ? " element:\n" : " elements:\n");
            for (String element: this.elements) {
                if (size <= 1) {
                    returned += element;
                    break;
                }
                returned += element + "\n";
            }
            return returned;
        }
    }
}
