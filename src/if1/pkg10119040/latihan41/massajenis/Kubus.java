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
public class Kubus {
    public int sisi;
    public int massa;

    public int getSisi() {
        return sisi;
    }

    public void setSisi(int sisi) {
        this.sisi = sisi;
    }

    public int getMassa() {
        return massa;
    }

    public void setMassa(int massa) {
        this.massa = massa;
    }
    
    public int hitungVolume(int parSisi){
        return parSisi*parSisi*parSisi;
    }
    
    public int hitungMassaJenis(int parMassa, int volume){
        return parMassa/volume;
    }
}