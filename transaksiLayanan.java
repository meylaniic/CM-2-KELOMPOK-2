class transaksiLayanan {
    pasien pasien;
    dokter dokter;
    int durasiLayanan;
    int biaya;

    public transaksiLayanan(pasien pasien, dokter dokter, int durasiLayanan) {
        this.pasien = pasien;
        this.dokter = dokter;
        this.durasiLayanan = durasiLayanan;
        this.biaya = hitungBiaya();
    }

    int hitungBiaya() {
        return durasiLayanan * 50000;
    }
}