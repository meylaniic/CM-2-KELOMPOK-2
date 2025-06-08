import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class transaksiLayanan {
    static Scanner input = new Scanner(System.in);
    static node head = null;
    static node tail = null;
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
        node baru = new node(pasien);

        if (head == null) {
            head = tail = baru;
        } else {
            tail.next = baru;
            baru.prev = tail;
            tail = baru;
        }
        System.out.println(">> Pasien masuk ke dalam antrian.");
    }

}
