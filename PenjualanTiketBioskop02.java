import java.util.Scanner;

public class PenjualanTiketBioskop02 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Deklarasi variabel
        int jmlTiket;
        int totalTiket = 0;
        int hargaTiket = 50000;
        double totalPendapatan = 0;

        do {
            System.out.print("Masukkan jumlah tiket yang dibeli (negatif untuk keluar): ");
            jmlTiket = sc.nextInt();

            // Memeriksa input valid
            if (jmlTiket < 0) {
                System.out.println("Input negatif, program dihentikan.");
                break; // Keluar dari perulangan jika input negatif
            } else if (jmlTiket == 0) {
                System.out.println("Jumlah tiket tidak bisa nol, silakan masukkan jumlah yang valid.");
                continue; // Meminta input ulang jika jumlah tiket nol
            }

            // Menghitung total harga berdasarkan jumlah tiket dan diskon
            double hargaTotal = jmlTiket * hargaTiket;

            if (jmlTiket > 10) {
                hargaTotal *= 0.85; // Diskon 15%
            } else if (jmlTiket > 4) {
                hargaTotal *= 0.90; // Diskon 10%
            }

            // Menambahkan ke total tiket dan pendapatan
            totalTiket += jmlTiket;
            totalPendapatan += hargaTotal;

            System.out.println("Total harga untuk " + jmlTiket + " tiket: Rp " + hargaTotal);
        } while (true); // Terus meminta input hingga program dihentikan

        // Menampilkan total penjualan
        System.out.println("Total tiket terjual: " + totalTiket);
        System.out.println("Total pendapatan: Rp " + totalPendapatan);
    }
}
