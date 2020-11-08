/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if10k.pkg10119906.latihan38.ooperhitunganlingkaran;

/**
 *
 * @author senenngahenen
 * Nama     : Rizqy Ananda Rusmana
 * NIM      : 10119906
 * Kelas    : IF-10K
 */
public class Lingkaran {
    double jari;
    double luas;
    double keliling;
    
    public double jari2Lingkaran(double diameter){
        jari = diameter / 2;
        return jari;
           }
    public double luasLingkaran(double r){
        luas = Math.PI * r * r;
        return luas;
    }
    public double kelilingLingkaran(double r){
        luas = 2*Math.PI * r;
        return luas;
    }
}
