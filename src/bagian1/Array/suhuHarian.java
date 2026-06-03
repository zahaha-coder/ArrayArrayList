package bagian1.array;

public class suhuHarian {
    public static void main(String[] args) {
        System.out.println("=== Soal 1: Suhu Tertinggi & Terendah ===");
        double[] suhu = {30.5, 28.0, 33.2, 27.8, 31.1, 29.4};
        
        // Inisialisasi awal dengan elemen pertama array
        double max = suhu[0];
        double min = suhu[0];
        
        for (double s : suhu) {
            if (s > max) {
                max = s;
            }
            if (s < min) {
                min = s;
            }
        }
        
        System.out.println("Suhu Tertinggi: " + max + "°C");
        System.out.println("Suhu Terendah : " + min + "°C");
    }
}