import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class serviceAntrian {
     static Scanner input = new Scanner(System.in);
    static doubleLinkedListPasien antrian = new doubleLinkedListPasien();
    static Queue<transaksiLayanan> riwayatTransaksi = new LinkedList<>();

     static void tambahPasien() {
        System.out.print("Nama Pasien: ");
        String nama = input.nextLine();
        System.out.print("NIK: ");
        String nik = input.nextLine();
        System.out.print("Keluhan: ");
        String keluhan = input.nextLine();

        pasien pasien = new pasien(nama, nik, keluhan);
        antrian.tambahPasien(pasien);
        System.out.println(">> Pasien masuk ke dalam antrian.");
    }

    static void lihatAntrian() {
        if (antrian.isEmpty()) {
            System.out.println("Antrian kosong.");
        } else {
            System.out.println("-- Antrian Pasien --");
            antrian.tampilkanAntrian();
        }
    }

    static void layaniPasien() {
        if (antrian.isEmpty()) {
            System.out.println("Tidak ada pasien dalam antrian.");
            return;
        }
        pasien pasien = antrian.removeFirst();
        System.out.println("Pasien " + pasien.nama + " dipanggil");
        System.out.print("Masukkan ID Dokter: ");
        String id = input.nextLine();
        System.out.print("Masukkan Nama Dokter: ");
        String namaDokter = input.nextLine();
        System.out.print("Masukkan Durasi Layanan (jam): ");
        int durasi = input.nextInt();
        input.nextLine(); // Buang newline

        dokter dokter = new dokter(id, namaDokter);
        transaksiLayanan transaksi = new transaksiLayanan(pasien, dokter, durasi);
        riwayatTransaksi.add(transaksi);
        System.out.println(">> Pasien telah dilayani, transaksi berhasil dicatat.");
    }
}
