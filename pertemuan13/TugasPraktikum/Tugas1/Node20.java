package pertemuan13.TugasPraktikum.Tugas1;

public class Node20 {
    String nama;
    int nomorAntrian;
    Node20 next, prev;

    public Node20(Node20 prev, int nomorAntrian, String nama, Node20 next) {
        this.prev = prev;
        this.nomorAntrian = nomorAntrian;
        this.nama = nama;
        this.next = next;
    }
}
