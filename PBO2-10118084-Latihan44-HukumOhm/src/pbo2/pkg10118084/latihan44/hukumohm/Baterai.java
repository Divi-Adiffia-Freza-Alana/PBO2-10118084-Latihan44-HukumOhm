/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10118084.latihan44.hukumohm;

/**
 *
 * @author Freza
 */
public class Baterai {
    private float kuatarus;
    private float hambatan;

    public float getKuatarus() {
        return kuatarus;
    }

    public void setKuatarus(float kuatarus) {
        this.kuatarus = kuatarus;
    }

    public float getHambatan() {
        return hambatan;
    }

    public void setHambatan(float hambatan) {
        this.hambatan = hambatan;
    }
    
    public Baterai(){
        System.out.println("baterai 1");
    }

    public Baterai(float kuatarus, float hambatan) {
        this.kuatarus = kuatarus;
        this.hambatan = hambatan;
    
    }
    public float hitungTegangan(){
    return hambatan*kuatarus;
    }
    
}
