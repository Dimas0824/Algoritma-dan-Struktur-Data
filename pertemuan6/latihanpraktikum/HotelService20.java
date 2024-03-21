package pertemuan6.latihanpraktikum;

public class HotelService20 {

    private Hotel20[] kamar;
    private int jumlahKamar;

    // Konstruktor untuk kelas HotelService20
    public HotelService20() {
        kamar = new Hotel20[100];
        jumlahKamar = 0;
    }

    // Metode untuk menambahkan hotel
    public void tambah(Hotel20 H) {
        kamar[jumlahKamar] = H;
        jumlahKamar++;
    }

    // Metode untuk menampilkan semua hotel
    public void tampilkanSemua() {
        for (int i = 0; i < jumlahKamar; i++) {
            System.out.println("Nama Hotel: " + kamar[i].nama + ", Kota: " + kamar[i].kota + ", Harga: "
                    + kamar[i].harga + ", Bintang: " + kamar[i].bintang);
        }
    }

    // Metode untuk mengurutkan hotel berdasarkan harga (Bubble Sort)
    public void urutkanHargaBubbleSort() {
        for (int i = 0; i < jumlahKamar - 1; i++) {
            for (int j = 0; j < jumlahKamar - i - 1; j++) {
                if (kamar[j].harga > kamar[j + 1].harga) {
                    Hotel20 temp = kamar[j];
                    kamar[j] = kamar[j + 1];
                    kamar[j + 1] = temp;
                }
            }
        }
    }

    // Metode untuk mengurutkan hotel berdasarkan harga (Selection Sort)
    public void urutkanHargaSelectionSort() {
        for (int i = 0; i < jumlahKamar - 1; i++) {
            int minIdx = i;
            for (int j = i + 1; j < jumlahKamar; j++) {
                if (kamar[j].harga < kamar[minIdx].harga) {
                    minIdx = j;
                }
            }
            Hotel20 temp = kamar[minIdx];
            kamar[minIdx] = kamar[i];
            kamar[i] = temp;
        }
    }

    // Metode untuk mengurutkan hotel berdasarkan rating bintang (Bubble Sort)
    public void urutkanBintangBubbleSort() {
        for (int i = 0; i < jumlahKamar - 1; i++) {
            for (int j = 0; j < jumlahKamar - i - 1; j++) {
                if (kamar[j].bintang < kamar[j + 1].bintang) {
                    Hotel20 temp = kamar[j];
                    kamar[j] = kamar[j + 1];
                    kamar[j + 1] = temp;
                }
            }
        }
    }

    // Metode untuk mengurutkan hotel berdasarkan rating bintang (Selection Sort)
    public void urutkanBintangSelectionSort() {
        for (int i = 0; i < jumlahKamar - 1; i++) {
            int maxIdx = i;
            for (int j = i + 1; j < jumlahKamar; j++) {
                if (kamar[j].bintang > kamar[maxIdx].bintang) {
                    maxIdx = j;
                }
            }
            Hotel20 temp = kamar[maxIdx];
            kamar[maxIdx] = kamar[i];
            kamar[i] = temp;
        }
    }
}
