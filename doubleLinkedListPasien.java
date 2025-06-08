public class doubleLinkedListPasien {
    nodePasien head;
    nodePasien tail;
    int size;

    void tambahPasien(pasien data) {
        nodePasien newNode = new nodePasien(data);
        if (head == null) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
        size++;
    }

    pasien removeFirst() {
        if (head == null) return null;
        pasien removed = head.data;
        head = head.next;
        if (head != null) head.prev = null;
        else tail = null;
        size--;
        return removed;
    }

    boolean isEmpty() {
        return size == 0;
    }

    int getSize() {
        return size;
    }

    void tampilkanAntrian() {
        nodePasien current = head;
        while (current != null) {
            current.data.tampilkanInformasi();
            System.out.println();
            current = current.next;
        }
    }

}
