/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Scanner;
/**
 *
 * @author hachem
 */
public class TextUI {
    private Scanner scanner;
    private SimpleDictionary dictionary;

    public TextUI(Scanner scanner, SimpleDictionary dictionary) {
        this.scanner = scanner;
        this.dictionary = dictionary;
    }
    
    public void start() {
        while (true) {
            System.out.println("Command:");
            String cmd = scanner.nextLine();
            if (cmd.equals("end")) {
                break;
            }
            if (cmd.equals("add")) {
                this.add();
            }
            if (cmd.equals("search")) {
                this.search();
            }
            System.out.println("Unknown command");
        }
        System.out.println("Bye bye!");
    }
    
    public void add() {
        System.out.println("Word:");
        String word = scanner.nextLine();
        System.out.println("Translation:");
        String trs = scanner.nextLine();
        this.dictionary.add(word, trs);
    }
    
    public void search() {
        System.out.println("To be translated:");
        String toTranslate = scanner.nextLine();
        if (dictionary.translate(toTranslate) == null) {
            System.out.println("Word " + toTranslate + " was not found.");
        } else {
            System.out.println("Translation: " + dictionary.translate(toTranslate));
        }
    }
}
