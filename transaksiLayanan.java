public class transaksiLayanan {
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

    
}
