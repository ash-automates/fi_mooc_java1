/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hachem
 */
public class Bird {
    private String name;
    private String inLat;
    private int obs;

    public Bird(String name, String inLat) {
        this.name = name;
        this.inLat = inLat;
        this.obs = 0;
    }

    public String getName() {
        return name;
    }

    public int getObs() {
        return obs;
    }

    public void setObs(int obs) {
        this.obs = obs;
    }
    
    @Override
    public String toString() {
        return this.name + " (" + this.inLat +"): " + this.obs + " observations";
    }
    
}
