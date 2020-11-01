/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas21;

import java.util.Scanner;

/**
 *
 * @author
 * Aris Prabowo
 * IF10K - 10119914
 */
public class Main {
    public static void main(String[] args) {
        Scanner Keyboard = new Scanner(System.in);
        int JumlahMahasiswa;
        float NilaiMahasiswa, TotalNilai;
        
        System.out.println("Masukan Jumlah Mahasiswa : ");
        JumlahMahasiswa = Keyboard.nextInt();
        TotalNilai = 0;
        
        for(var i=0; i<JumlahMahasiswa; i++){
            System.out.println("Masukan Nilai Mahasiswa ke-"+(i+1)+" : ");
            NilaiMahasiswa = Keyboard.nextFloat();
            TotalNilai = TotalNilai + NilaiMahasiswa;
        }
        String NilaiRataRata = String.format("%.2f", TotalNilai/JumlahMahasiswa);
        System.out.println("Maka Nilai Rata-ratanya adalah : "+NilaiRataRata);
    }
}
