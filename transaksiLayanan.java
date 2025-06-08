import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class transaksiLayanan {
    static Scanner input = new Scanner(System.in);
    static nodePasien head = null;
    static nodePasien tail = null;
    static Queue<transaksiLayanan> riwayatTransaksi = new LinkedList<>();
    pasien pasien;
    dokter dokter;
    int durasiLayanan;
    int biaya;

    public transaksiLayanan(pasien pasien, dokter dokter, int durasiLayanan) {
        this.pasien = pasien;
        this.dokter = dokter;
        this.durasiLayanan = durasiLayanan;
    }

    public int hitungBiaya() {
        this.biaya = this.durasiLayanan * 50000;
        return this.biaya;
    }

    static void tambahPasien() {
        System.out.print("Nama Pasien: ");
        String nama = input.nextLine();
        System.out.print("NIK: ");
        String nik = input.nextLine();
        System.out.print("Keluhan: ");
        String keluhan = input.nextLine();

        pasien pasien = new pasien(nama, nik, keluhan);
        nodePasien baru = new nodePasien(pasien);

        if (head == null) {
            head = tail = baru;
        } else {
            tail.next = baru;
            baru.prev = tail;
            tail = baru;
        }
        System.out.println(">> Pasien masuk ke dalam antrian.");
    }

    static void lihatAntrian() {
        if (head == null) {
            System.out.println("Antrian kosong.");
        } else {
            System.out.println("-- Antrian Pasien --");
            nodePasien current = head;
            while (current != null) {
                current.data.tampilkanInformasi();
                System.out.println();
                current = current.next;
            }
        }
    }

    static void layaniPasien() {
        if (head == null) {
            System.out.println("Tidak ada pasien dalam antrian.");
            return;
        }

        pasien pasien = head.data;
        head = head.next;
        if (head != null) head.prev = null;
        else tail = null;

        System.out.println("Pasien " + pasien.nama + " dipanggil");
        System.out.print("Masukkan ID Dokter: ");
        String id = input.nextLine();
        System.out.print("Masukkan Nama Dokter: ");
        String namaDokter = input.nextLine();
        System.out.print("Masukkan Durasi Layanan (jam): ");
        int durasi = input.nextInt();
        input.nextLine(); 

        dokter dokter = new dokter(id, namaDokter);
        transaksiLayanan transaksi = new transaksiLayanan(pasien, dokter, durasi);
        riwayatTransaksi.add(transaksi);
        System.out.println(">> Pasien telah dilayani, transaksi berhasil dicatat.");
    }

}
