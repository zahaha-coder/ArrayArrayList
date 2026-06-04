package bagian3.perpustakaan;

public class MainPerpustakaan {
    public static void main(String[] args) {
        
        Perpustakaan perpus = new Perpustakaan();

        // Membuat objek Buku 
        perpus.tambahBuku(new Buku("Laskar Pelangi", "Andrea Hirata", 2005));
        perpus.tambahBuku(new Buku("Bumi Manusia", "Pramoedya", 1980));
        perpus.tambahBuku(new Buku("Negeri 5 Menara", "Ahmad Fuadi", 2009));
        
        perpus.tampilkanKoleksi();
        System.out.println();
        
        //pinjam buku
        perpus.pinjamBuku("Bumi Manusia");
        System.out.println("Buku tersedia: " + perpus.jumlahTersedia());
        System.out.println();
        
        //Mengembalikan buku yang sedang dipinjam
        System.out.println("--- Menguji Fitur Pengembalian Buku ---");
        perpus.kembalikanBuku("Bumi Manusia");
        System.out.println("Buku tersedia: " + perpus.jumlahTersedia());
        System.out.println();
        
        //Mencari buku berdasarkan nama penulis
        System.out.println("--- Menguji Fitur Pencarian Penulis ---");
        perpus.cariPenulis("Andrea Hirata");
    }
}