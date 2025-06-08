public class nodePasien {
    pasien data;
    nodePasien prev;
    nodePasien next;

    public nodePasien(pasien data) {
        this.data = data;
        this.prev = null;
        this.next = null;
    }  
}