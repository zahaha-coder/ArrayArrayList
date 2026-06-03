package bagian2.arraylist;

import java.util.ArrayList;

public class FilterNama {
    public static void main(String[] args) {
        System.out.println("=== Soal 3: Nama Berawalan Huruf A ===");
        
        ArrayList<String> daftarNama = new ArrayList<>();
        
        // Menambahkan 6 nama ke dalam ArrayList
        daftarNama.add("Andi");
        daftarNama.add("Budi");
        daftarNama.add("Ayu");
        daftarNama.add("Citra");
        daftarNama.add("Adit");
        daftarNama.add("Doni");
        
        System.out.println("Semua Nama: " + daftarNama);
        System.out.println("Nama yang diawali huruf 'A':");
        
        // Telusuri dan filter menggunakan method startsWith()
        for (String nama : daftarNama) {
            if (nama.startsWith("A")) {
                System.out.println("- " + nama);
            }
        }
    }
}