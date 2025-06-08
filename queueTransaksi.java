public class queueTransaksi {
    transaksiLayanan[] data;
    int front,rear, size;

    public queueTransaksi(int kapasitas) {
        data = new transaksiLayanan[kapasitas];
        front = rear = size = 0;
    }

    void enqueue(transaksiLayanan t) {
        if (size == data.length) {
            System.out.println("Queue transaksi penuh!");
            return;
        }
        data[rear] = t;
        rear = (rear + 1) % data.length;
        size++;
    }

    void tampilkanTransaksi() {
        System.out.println("Riwayat Transaksi:");
        if (size == 0) {
            System.out.println("(Kosong)");
            return;
        }
        for (int i = 0; i < size; i++) {
            int idx = (front + i) % data.length;
            transaksiLayanan t = data[idx];
            System.out.println("Pasien: " + t.pasien.nama + ", Dokter: " + t.n +
                ", Durasi: " + t.durasiLayanan + " jam, Biaya: Rp" + t.biaya);
        }
    }
}


    
}
