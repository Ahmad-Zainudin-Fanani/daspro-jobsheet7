import java.util.Scanner;

public class ParkirKendaraan02 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Deklarasi variabel
        int jenis, durasi, total = 0;

        do {
            System.out.print("Masukkan jenis kendaraan (1: Mobil, 2: Motor, 0: Keluar): ");
            jenis = sc.nextInt();

            if (jenis == 0) {
                break; // Keluar dari perulangan jika input 0
            }

            // Memeriksa apakah jenis kendaraan valid
            if (jenis == 1 || jenis == 2) {
                System.out.print("Masukkan durasi parkir (jam): ");
                durasi = sc.nextInt();

                // Menentukan total biaya
                if (durasi > 5) {
                    total += 12500; // Tarif tetap
                } else {
                    if (jenis == 1) {
                        total += durasi * 3000; // Tarif mobil
                    } else if (jenis == 2) {
                        total += durasi * 2000; // Tarif motor
                    }
                }
            } else {
                System.out.println("Jenis kendaraan tidak valid! Masukkan 1 untuk mobil atau 2 untuk motor.");
            }
        } while (true);

        // Menampilkan total biaya parkir
        System.out.println("Total pembayaran parkir: Rp " + total);
    }
}
