package bagian1.array;

public class namaHari {
    public static void main(String[] args) {
        System.out.println("=== Soal 2: Nama Hari Lebih Dari 5 Huruf ===");
        String[] hari = {"Senin", "Selasa", "Rabu", "Kamis", "Jumat"};
        
        for (String h : hari) {
            // .length() dengan kurung untuk menghitung jumlah huruf pada String
            if (h.length() > 5) {
                System.out.println("Hari: " + h + " (" + h.length() + " huruf)");
            }
        }
    }
}