/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if1.pkg10119040.latihan41.massajenis;

/**
 *
 * @author User
 * Nama : Agus Deri Dermawan
 * NIM  :10119040
 * Kelas: IF1
 * Program menghitung massa jenis kubus dengan metode
 * pendekatan berbasis objek
 */
public class IF110119040Latihan41MassaJenis {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Kubus kubus = new Kubus();
        kubus.setSisi(5);
        kubus.setMassa(250);
        
        System.out.println("======Massa Jenis Kubus======");
        System.out.println("Sisi : " + kubus.getSisi());
        System.out.println("Masssa : " + kubus.getMassa());
        System.out.println("======Hasil Perhitungan======");
        System.out.println("Volume : " + kubus.hitungVolume(kubus.getSisi()));
        System.out.println("Massa Jenis : " + kubus.hitungMassaJenis(kubus.getMassa(),kubus.hitungVolume(kubus.getSisi())));
    }
    
}
