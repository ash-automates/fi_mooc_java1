
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
public class GradeStatistics {
    private ArrayList<Integer> grades;
    private ArrayList<Integer> passing;

    public GradeStatistics() {
        this.grades = new ArrayList<>();
        this.passing = new ArrayList<>();
    }
    
    public void addGrade(int grade) {
        if (grade <= 100 && grade >= 0) {
            if (grade >= 50) {
                this.passing.add(grade);
            }
            this.grades.add(grade);
        }    
    }
    
    public double average() {
        int sum = 0;
        for (int grade : grades) {
            sum = sum + grade;
        }
        return (double) sum / this.grades.size();
    }
    
    public double passingAverage() {
        int sum = 0;
        for (int grade : passing) {
            sum = sum + grade;
        }
        return (double) sum / this.passing.size();
    }
    
    public double passingPercentage() {
        return 100.0 * this.passing.size() / this.grades.size();
    }
    
    public void printDist() {
        int[] dist = {0, 0, 0, 0, 0, 0};
        for (int grade : grades) {
            if (grade < 50) {
                dist[0] += 1;
            } else if (grade < 60) {
                dist[1] += 1;
            } else if (grade < 70) {
                dist[2] += 1;
            } else if (grade < 80) {
                dist[3] += 1;
            } else if (grade < 90) {
                dist[4] += 1;
            } else {
                dist[5] += 1;
            }
        }
        System.out.println("Grade distribution:");
        for (int i = dist.length - 1; i >= 0; i--) {
            System.out.print(i + ": ");
            for (int j = 0; j < dist[i]; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
