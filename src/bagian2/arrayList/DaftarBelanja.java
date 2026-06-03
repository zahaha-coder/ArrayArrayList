package bagian2.arraylist;

import java.util.ArrayList; // Wajib di-import, bre!

public class DaftarBelanja {
    public static void main(String[] args) {
        System.out.println("=== Soal 1: Daftar Belanja ===");
        
        ArrayList<String> belanja = new ArrayList<>();
        
        // 1. Tambah 4 item
        belanja.add("Beras");
        belanja.add("Minyak Goreng"); // Ini item ke-2 (berada di indeks 1)
        belanja.add("Telur");
        belanja.add("Gula");
        
        System.out.println("Isi awal list     : " + belanja);
        
        // 2. Hapus item ke-2 (ingat, komputer mulai menghitung indeks dari 0, jadi item ke-2 adalah indeks 1)
        belanja.remove(1);
        
        // 3. Tampilkan isi list dan jumlah akhirnya
        System.out.println("Isi setelah dihapus: " + belanja);
        System.out.println("Jumlah akhir list  : " + belanja.size());
    }
}