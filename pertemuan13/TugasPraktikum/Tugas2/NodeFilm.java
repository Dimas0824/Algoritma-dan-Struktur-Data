package pertemuan13.TugasPraktikum.Tugas2;

public class NodeFilm {
    int id;
    String judul;
    double rating;
    NodeFilm next;
    NodeFilm prev;

    public NodeFilm(NodeFilm prev, int id, String judul, double rating, NodeFilm next) {
        this.prev = prev;
        this.id = id;
        this.judul = judul;
        this.rating = rating;
        this.next = next;
    }
}
