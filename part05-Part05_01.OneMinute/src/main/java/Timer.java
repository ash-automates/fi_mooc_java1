/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hachem
 */
public class Timer {
    private ClockHand secs;
    private ClockHand hundrethOfSecs;
    
    public Timer() {
        this.secs = new ClockHand(60);
        this.hundrethOfSecs = new ClockHand(100);
    }
    
    public void advance() {
        this.hundrethOfSecs.advance();
        if (this.hundrethOfSecs.value() == 0) {
            this.secs.advance();
        }
    }
    
    public String toString() {
        return this.secs + ":" + this.hundrethOfSecs;
    }
}
