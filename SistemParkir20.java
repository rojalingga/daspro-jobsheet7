import java.util.Scanner;

public class SistemParkir20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int jenis, durasi, total = 0, totalBayar = 0;

        while (true) {
            System.out.print("Masukkan jenis kendaraan (Mobil = 1, Motor = 2, Keluar = 0) : ");
            jenis = sc.nextInt();

            if (jenis == 0) {
                break;
            }

            if (jenis == 1 || jenis == 2) {
                System.out.print("Masukkan durasi parkir (dalam jam) : ");
                durasi = sc.nextInt();

                if (durasi > 5) {
                    total = 12500;
                } else if (jenis == 1) {
                    total = durasi * 3000;
                    System.out.println(String.format("Biaya Parkir Mobil selama %d jam: Rp. %d: ", durasi, total));
                } else if (jenis == 2){
                    total = durasi * 2000;
                    System.out.println(String.format("Biaya Parkir Motor selama %d jam: Rp. %d: ", durasi, total));
                }
                totalBayar += total;

            } else {
                System.out.println("Jenis kendaraan tidak valid. Silakan coba lagi.");
            }

        }

        System.out.println("Total pembayaran parkir: Rp. " + totalBayar);
    }
}