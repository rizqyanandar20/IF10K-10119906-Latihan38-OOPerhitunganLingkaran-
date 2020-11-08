/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if10k.pkg10119906.latihan38.ooperhitunganlingkaran;
import java.util.Scanner;

/**
 *
 * @author senenngahenen
 * Nama     : Rizqy Ananda Rusmana
 * NIM      : 10119906
 * Kelas    : IF-10K
 */
public class IF10K10119906Latihan38OOPerhitunganLingkaran {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String diameter;
        double d;
        Scanner scanner  = new Scanner(System.in);
        Lingkaran clc = new Lingkaran();
        
        System.out.println("======Perhitungan Lingkaran======");
        do{
         System.out.print("Masukan nilai diameter lingkaran : ");
         diameter = scanner.nextLine();
         System.out.println((!diameter.matches("[0-9]*")) ?
                 "Nilai Diameter tidak sesuai\n":"");
         
     } while(!diameter.matches("[0-9]*"));
        System.out.println("======Hasil Perhitungan Lingkaran======");
        d = Double.parseDouble(diameter);
        
        System.out.printf("Jari-jari Lingkaran = %.0f cm %n",
                            clc.jari2Lingkaran(d));
        System.out.printf("Luas Lingkaran = %.2f cm %n",
                            clc.luasLingkaran(clc.jari2Lingkaran(d)));
        System.out.printf("Keliling Lingkaran = %.2f cm %n",
                            clc.kelilingLingkaran(clc.jari2Lingkaran(d)));
    }
    
}
