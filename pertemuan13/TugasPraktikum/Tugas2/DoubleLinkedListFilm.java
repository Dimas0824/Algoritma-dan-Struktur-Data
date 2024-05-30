package pertemuan13.TugasPraktikum.Tugas2;

public class DoubleLinkedListFilm {
    NodeFilm head;
    NodeFilm tail;
    int size;

    public void menu() {
        System.out.println("====================================");
        System.out.println("DATA FILM LAYAR LEBAR");
        System.out.println("====================================");
        System.out.println("1. Tambah data awal");
        System.out.println("2. Tambah data akhir");
        System.out.println("3. Tambah data indeks tertentu");
        System.out.println("4. Hapus data pertama");
        System.out.println("5. Hapus data terakhir");
        System.out.println("6. Hapus data tertentu");
        System.out.println("7. Cetak");
        System.out.println("8. Cari ID Film");
        System.out.println("9. Urutkan data Rating Film-DESC");
        System.out.println("10. Keluar");
        System.out.println("====================================");
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public void tambahNodeFilm(int id, String judul, double rating) {
        NodeFilm newNodeFilm = new NodeFilm(tail, id, judul, rating, null);
        if (isEmpty()) {
            head = tail = newNodeFilm;
        } else {
            tail.next = newNodeFilm;
            newNodeFilm.prev = tail; // Tambahan ini
            tail = newNodeFilm;
        }
        size++;
    }

    public int getSize() {
        return size;
    }

    public void tambahAwal(int id, String judul, double rating) {
        NodeFilm newFilm = new NodeFilm(null, id, judul, rating, head);
        if (isEmpty()) {
            head = tail = newFilm;
        } else {
            head.prev = newFilm;
            head = newFilm;
        }
        size++;
    }

    public void tambahAkhir(int id, String judul, double rating) {
        NodeFilm newFilm = new NodeFilm(tail, id, judul, rating, null);
        if (isEmpty()) {
            head = tail = newFilm;
        } else {
            tail.next = newFilm;
            newFilm.prev = tail; // Tambahan ini
            tail = newFilm;
        }
        size++;
    }

    public void tambahFilmIndeks(int index, int id, String judul, double rating) {
        if (index < 0 || index > size) {
            System.out.println("Indeks di luar batas daftar.");
            return;
        }

        if (index == 0) {
            tambahAwal(id, judul, rating);
        } else if (index == size) {
            tambahAkhir(id, judul, rating);
        } else {
            NodeFilm current = head;
            for (int i = 0; i < index - 1; i++) {
                current = current.next;
            }

            NodeFilm next = current.next;
            NodeFilm newFilm = new NodeFilm(current, id, judul, rating, next);
            current.next = newFilm;
            next.prev = newFilm;
            size++;
        }
    }

    public void hapusPertama() {
        if (isEmpty()) {
            System.out.println("Daftar film kosong.");
            return;
        }
        head = head.next;
        if (head != null) {
            head.prev = null;
        } else {
            tail = null;
        }
        size--;
    }

    public void hapusTerakhir() {
        if (isEmpty()) {
            System.out.println("Daftar film kosong.");
            return;
        }
        tail = tail.prev;
        if (tail != null) {
            tail.next = null;
        } else {
            head = null;
        }
        size--;
    }

    public void hapusbyId(int id) {
        if (isEmpty()) {
            System.out.println("Daftar film kosong.");
            return;
        }

        NodeFilm current = head;
        while (current != null) {
            if (current.id == id) {
                // Jika film yang akan dihapus adalah film pertama
                if (current == head) {
                    head = head.next;
                    if (head != null) {
                        head.prev = null;
                    } else {
                        tail = null;
                    }
                }
                // Jika film yang akan dihapus adalah film terakhir
                else if (current == tail) {
                    tail = tail.prev;
                    if (tail != null) {
                        tail.next = null;
                    } else {
                        head = null;
                    }
                }
                // Jika film yang akan dihapus berada di tengah
                else {
                    current.prev.next = current.next;
                    current.next.prev = current.prev;
                }
                size--;
                return;
            }
            current = current.next;
        }

        System.out.println("Film dengan ID " + id + " tidak ditemukan.");
    }

    public NodeFilm cariIDFilm(int id) {
        NodeFilm temp = head;
        int index = 0;
        while (temp != null) {
            if (temp.id == id) {
                System.out.println("Data ID Film: " + id + " berada di node ke- " + index);
                System.out.println("IDENTITAS: ");
                System.out.println("ID: " + temp.id);
                System.out.println("Judul: " + temp.judul);
                System.out.println("Rating: " + temp.rating);
                return temp;
            }
            temp = temp.next;
            index++;
        }
        System.out.println("Film dengan ID " + id + " tidak ditemukan.");
        return null;
    }

    public void urutkanRating() {
        NodeFilm current = null, index = null;
        double tempRating;
        int tempId;
        String tempJudul;

        for (current = head; current.next != null; current = current.next) {
            for (index = current.next; index != null; index = index.next) {
                if (current.rating < index.rating) {
                    tempRating = current.rating;
                    current.rating = index.rating;
                    index.rating = tempRating;

                    tempId = current.id;
                    current.id = index.id;
                    index.id = tempId;

                    tempJudul = current.judul;
                    current.judul = index.judul;
                    index.judul = tempJudul;
                }
            }
        }
    }

    public void printNodeFilms() {
        NodeFilm temp = head;
        while (temp != null) {
            System.out.println("ID: " + temp.id + " | Judul: " + temp.judul + " | Rating: " + temp.rating);
            temp = temp.next;
        }
    }
}
