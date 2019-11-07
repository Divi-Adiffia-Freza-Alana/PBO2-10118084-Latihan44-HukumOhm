/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10118084.latihan44.hukumohm;

/**
*Nama  : Divi Adiffia Freza Alana
*Kelas : PBO2
*Nim   : 10118084
*Deskripsi Program : Program ini berisi program untuk menghtiung tegangan

 */
public class PBO210118084Latihan44HukumOhm {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Baterai baterai2 = new Baterai(3,12);
        baterai2.setHambatan(12);
        System.out.println("====Hukum Ohm====");
        System.out.println("Kuat arus yang mengalir pada suatu kawat penghantar akan berbanding lurus dengan beda potensial "
                + "pada ujung-ujung kawat penghantar tersebut asalkan suhu kawat dijaga konstan");
        System.out.println("Kuat Arus :"+baterai2.getKuatarus()+" ampere");
        System.out.println("Hambatan :"+baterai2.getHambatan()+" ohm");
        System.out.println("Hasil Tegangan :"+baterai2.hitungTegangan()+" volt");
        
        
        
    }
    
}
