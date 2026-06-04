/*
 * Nama : M Reza Maulani Aditya
 * NPM  : 2410010638
 */


package tugas;

public class MainTugas {
    public static void main(String[] args) {
        
       //Menyimpan daftar nama mata kuliah dalam array 
        String[] mataKuliah = {"Pemrograman Berbasis Objek 1", "Sistem Informasi Geografis", "Cloud Computing"};
        
        System.out.println("=== DAFTAR MATA KULIAH ===");
        for (int i = 0; i < mataKuliah.length; i++) {
            System.out.println((i + 1) + ". " + mataKuliah[i]);
        }
        System.out.println();

        KelasKuliah kelas = new KelasKuliah();

        //Menambahkan 5 objek Mahasiswa
        System.out.println("--- Proses Input 5 Mahasiswa Awal ---");
        kelas.tambahMahasiswa(new Mahasiswa("M. Reza", "22100101", 85.5));
        kelas.tambahMahasiswa(new Mahasiswa("Aditya", "22100102", 55.0));
        kelas.tambahMahasiswa(new Mahasiswa("Andi", "22100103", 75.0));
        kelas.tambahMahasiswa(new Mahasiswa("Budi", "22100104", 42.5));
        kelas.tambahMahasiswa(new Mahasiswa("Citra", "22100105", 90.0));
        System.out.println();

        // Menampilkan seluruh mahasiswa beserta ringkasan nilai awal
        System.out.println("--- Laporan Data Kelas Awal ---");
        kelas.tampilkanSemua();
        System.out.printf("Rata-rata Nilai Kelas   : %.2f\n", kelas.hitungRataRata());
        System.out.println("Jumlah Mahasiswa Lulus  : " + kelas.jumlahLulus());
        System.out.println();

        //Menambahkan satu objek Mahasiswa baru 
        System.out.println("--- Tambahan Input 1 Mahasiswa Baru ---");
        kelas.tambahMahasiswa(new Mahasiswa("Dewi", "22100106", 88.0));
        
        // Menampilkan kembali jumlah data terbaru
        System.out.println("Jumlah total data mahasiswa saat ini: " + kelas.getJumlahData());
        System.out.println();

        // Menampilkan kembali laporan data akhir setelah penambahan data baru
        System.out.println("--- Laporan Data Kelas Akhir ---");
        kelas.tampilkanSemua();
        System.out.printf("Rata-rata Nilai Terbaru : %.2f\n", kelas.hitungRataRata());
        System.out.println("Jumlah Mahasiswa Lulus  : " + kelas.jumlahLulus());
    }
}