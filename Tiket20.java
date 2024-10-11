import java.util.Scanner;

public class Tiket20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        int hargaTiket = 50000, jumlahTiket;
        double totalHarga;
        int totalTiket = 0, totalOmset = 0;
        
        do {
            System.out.print("Masukkan jumlah tiket (Ketik 0 untuk akhiri): ");
            jumlahTiket = sc.nextInt();

            if (jumlahTiket < 0) {
                System.out.println("Jumlah Tiket tidak valid. Mohon Masukkan bilangan positif.");
                continue;
            }

            totalHarga = jumlahTiket * hargaTiket;

            if (jumlahTiket==0) {
                System.out.println("Transaksi Hari ini selesai");
                System.out.println("------Berikut penjualan hari ini------");
                System.out.println("Tiket terjual : "+totalTiket);
                System.out.println("Total omset : "+totalOmset);
                break;
            }

            if (jumlahTiket > 4) {
                totalHarga *= 0.90;
                System.out.println("Anda mendapatkan diskon : 10%");
            } else if (jumlahTiket > 10) {
                totalHarga *= 0.85; 
                System.out.println("Anda mendapatkan diskon : 15%");
            }

            System.out.println("Total harga yang harus dibayar : " +totalHarga);

            totalTiket += jumlahTiket;
            totalOmset += totalHarga;
            System.out.println("Tiket terjual : "+totalTiket);
            System.out.println("Total omset : "+totalOmset);

        } while(true);

    }
}
