package bagian1.array;

public class angka {
    public static void main(String[] args) {
        System.out.println("=== Soal 3: Hitung Banyak Angka Genap ===");
        int[] angka = {4, 8, 15, 16, 23, 42};
        int jumlahGenap = 0;
        
        for (int a : angka) {
            // Menggunakan operator modulus (%) untuk cek sisa bagi
            if (a % 2 == 0) {
                jumlahGenap++;
            }
        }
        
        System.out.println("Banyaknya angka genap di dalam array: " + jumlahGenap);
    }
}