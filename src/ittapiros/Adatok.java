/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ittapiros;

/**
 *
 * @author Péter
 */
public class Adatok {
    private int helyzet;
    private boolean eltalaltaE;
    private boolean ujraosztas;
    
    public Adatok(String sor) {
        String [] s = sor.split(";");
        this.helyzet = Integer.parseInt(s[0]);
        this.eltalaltaE = Boolean.parseBoolean(s[1]);
        this.ujraosztas = Boolean.parseBoolean(s[2]);
    }

    public int getHelyzet() {
        return helyzet;
    }

    public boolean isEltalaltaE() {
        return eltalaltaE;
    }

    public boolean isUjraosztas() {
        return ujraosztas;
    }
    
    
    
    
    
}
