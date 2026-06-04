package tugas;

public class Mahasiswa {
    private String nama;
    private String npm;
    private double nilai;

    // Constructor untuk menginisialisasi data mahasiswa
    public Mahasiswa(String nama, String npm, double nilai) {
        this.nama = nama;
        this.npm = npm;
        this.nilai = nilai;
    }

    // Getter untuk mengambil data atribut dari luar class
    public String getNama() {
        return nama;
    }

    public String getNpm() {
        return npm;
    }

    public double getNilai() {
        return nilai;
    }

    // Method lulus() mengembalikan true jika nilai >= 60
    public boolean lulus() {
        return this.nilai >= 60;
    }
}