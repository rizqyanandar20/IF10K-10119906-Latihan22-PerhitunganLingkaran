/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if10k.pkg10119906.latihan22.perhitunganlingkaran;

import java.util.Scanner;
import java.text.DecimalFormat;

/**
 *
 * @author senenngahenen
 * Nama     : Rizqy Ananda Rusmana
 * NIM      : 10119906
 * Kelas    : IF-10K
 * Deskripsi Program : untuk menghitung diameter lingkaran.
 */
public class IF10K10119906Latihan22PerhitunganLingkaran {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);
        double PHI = 3.14159265358979323846;
        double nKeliling, nDiameter = 0, njariJari, nLuas;
        
        System.out.println("========Perhitungan Lingkaran========");
        do {
            System.out.print("\nMasukan nilai diameter lngkaran : ");
            try {
                nDiameter = scanner.nextDouble();
            } catch (Exception e) {
                System.out.println("Nilai diameter tidak sesuai");
                scanner.nextLine();
            }

        } while (nDiameter == 0);
        
        njariJari = nDiameter / 2;
        nLuas = (float) (PHI * (njariJari * njariJari));
        nKeliling = (PHI * nDiameter);
        
        DecimalFormat DF = new DecimalFormat("#.##");
        System.out.println("\n=====Hasil Perhitungan Lingkaran=====");
        System.out.printf("Jari jari lingkaran \t= %s"+" cm%n", DF.format(njariJari));
        System.out.printf("Luas Lingkaran\t\t= %s"+" cm%n", DF.format(nLuas));
        System.out.printf("Keliling Lingkaran\t= %s"+" cm%n", DF.format(nKeliling));
    }
    
}
