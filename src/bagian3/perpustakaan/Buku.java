package bagian3.perpustakaan;

public class Buku {
    //data yang dimiliki setiap buku
    private String judul;
    private String penulis;
    private boolean dipinjam;
    private int tahunTerbit; 

    // Constructor: diperbarui untuk menerima parameter tahunTerbit 
    public Buku(String judul, String penulis, int tahunTerbit) {
        this.judul = judul;
        this.penulis = penulis;
        this.tahunTerbit = tahunTerbit;
        this.dipinjam = false;
    }

    // Getter: cara membaca atribut dari luar class
    public String getJudul() {
        return judul;
    }

    public String getPenulis() {
        return penulis;
    }

    public boolean isDipinjam() {
        return dipinjam;
    }

    // Getter untuk tahunTerbit
    public int getTahunTerbit() {
        return tahunTerbit;
    }

    // Method untuk mengubah status pinjam
    public void setDipinjam(boolean dipinjam) {
        this.dipinjam = dipinjam;
    }

    // Mengembalikan keterangan buku dengan format tahun terbit baru 
    public String info() {
        String status = dipinjam ? "Dipinjam" : "Tersedia";
        return judul + " oleh " + penulis + " (" + tahunTerbit + ") [" + status + "]";
    }
}