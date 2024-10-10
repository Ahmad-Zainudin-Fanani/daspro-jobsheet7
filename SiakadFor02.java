import java.util.Scanner;

public class SiakadFor02 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Deklarasi variabel
        double nilai, tertinggi = 0, terendah = 100;
        int lulus = 0, tidakLulus = 0;
        int batasKelulusan = 60;  // Batas kelulusan minimal 60

        for (int i = 1; i <= 10; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + i + ": ");
            nilai = sc.nextDouble();
            
            // Memeriksa nilai tertinggi dan terendah
            if (nilai > tertinggi) {
                tertinggi = nilai;
            }
            if (nilai < terendah) {
                terendah = nilai;
            }
            
            // Menghitung jumlah mahasiswa lulus dan tidak lulus
            if (nilai >= batasKelulusan) {
                lulus++;
            } else {
                tidakLulus++;
            }
        }

        // Menampilkan hasil
        System.out.println("Nilai tertinggi: " + tertinggi);
        System.out.println("Nilai terendah: " + terendah);
        System.out.println("Jumlah mahasiswa lulus: " + lulus);
        System.out.println("Jumlah mahasiswa tidak lulus: " + tidakLulus);
    }
}
