public class mainAntrianKlinik {
    public static void main(String[] args) {
        int pilih;
        do {
            System.out.println("\n=== SISTEM ANTRIAN KLINIK ===");
            System.out.println("1. Tambah Pasien ke Antrian");
            System.out.println("2. Lihat Antrian");
            System.out.println("3. Layani Pasien");
            System.out.println("4. Cek Sisa Antrian Pasien");
            System.out.println("5. Lihat Riwayat Transaksi");
            System.out.println("0. Keluar");
            System.out.print("Pilih: ");
            pilih = serviceAntrian.input.nextInt();
            serviceAntrian.input.nextLine(); 

            switch (pilih) {
                case 1:
                    serviceAntrian.tambahPasien();
                    break;
                case 2:
                    serviceAntrian.lihatAntrian();
                    break;
                case 3:
                    serviceAntrian.layaniPasien();
                    break;
                case 4:
                    serviceAntrian.cekSisaAntrian();
                    break;
                case 5:
                    serviceAntrian.lihatRiwayatTransaksi();
                    break;
                case 0:
                    System.out.println("Terima kasih.");
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
            }
        } while (pilih != 0);
    }

}
