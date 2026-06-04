package tugas;

import java.util.ArrayList;

public class KelasKuliah {
    // Menyimpan banyak objek Mahasiswa di dalam ArrayList dinamis
    private ArrayList<Mahasiswa> daftarMahasiswa = new ArrayList<>();

    // Method untuk menambah mahasiswa baru ke koleksi
    public void tambahMahasiswa(Mahasiswa m) {
        daftarMahasiswa.add(m);
        System.out.println("Berhasil menambahkan mahasiswa: " + m.getNama());
    }

    // Method untuk menghitung rata-rata nilai seluruh mahasiswa di kelas
    public double hitungRataRata() {
        if (daftarMahasiswa.isEmpty()) {
            return 0;
        }
        
        double total = 0;
        for (Mahasiswa m : daftarMahasiswa) {
            total += m.getNilai();
        }
        return total / daftarMahasiswa.size();
    }

    // Method untuk menghitung berapa banyak mahasiswa yang berstatus lulus
    public int jumlahLulus() {
        int jumlah = 0;
        for (Mahasiswa m : daftarMahasiswa) {
            if (m.lulus()) {
                jumlah++;
            }
        }
        return jumlah;
    }

    // Method untuk menampilkan semua mahasiswa dalam bentuk list tabel rapi
    public void tampilkanSemua() {
        System.out.println("==================================================");
        System.out.printf("%-12s %-15s %-10s %-10s\n", "NPM", "Nama", "Nilai", "Status");
        System.out.println("==================================================");
        for (Mahasiswa m : daftarMahasiswa) {
            String status = m.lulus() ? "LULUS" : "TIDAK LULUS";
            System.out.printf("%-12s %-15s %-10.2f %-10s\n", m.getNpm(), m.getNama(), m.getNilai(), status);
        }
        System.out.println("==================================================");
    }

    // Method pembantu (helper) untuk mendapatkan jumlah elemen saat ini
    public int getJumlahData() {
        return daftarMahasiswa.size();
    }
}