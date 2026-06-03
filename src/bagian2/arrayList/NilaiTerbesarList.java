package bagian2.arraylist;

import java.util.ArrayList;

public class NilaiTerbesarList {
    public static void main(String[] args) {
        System.out.println("=== Soal 2: Nilai Terbesar di ArrayList ===");
        
        // Menggunakan Integer (Wrapper Class) karena ArrayList tidak bisa menyimpan tipe primitif int langsung
        ArrayList<Integer> nilai = new ArrayList<>();
        nilai.add(70);
        nilai.add(95);
        nilai.add(60);
        nilai.add(88);
        nilai.add(75);
        
        // Set nilai max awal dari elemen indeks ke-0
        int max = nilai.get(0);
        
        // Telusuri seluruh elemen menggunakan for-each
        for (int n : nilai) {
            if (n > max) {
                max = n; // Ganti nilai max jika ditemukan angka yang lebih besar
            }
        }
        
        System.out.println("Data Nilai    : " + nilai);
        System.out.println("Nilai Terbesar: " + max);
    }
}