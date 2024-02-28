package Latihan2;

public class Mahasiswa20 {
    public String nama, nim, jenisKelamin;
    public double ipk;

    public Mahasiswa20(String nama, String nim, String jenisKelamin, double ipk) {
        this.nama = nama;
        this.nim = nim;
        this.jenisKelamin = jenisKelamin;
        this.ipk = ipk;
    }

    // Method untuk menghitung rata-rata IPK
    public static double hitungRataIPK(Mahasiswa20[] mhs) {
        double totalIPK = 0;
        for (Mahasiswa20 mahasiswa : mhs) {
            totalIPK += mahasiswa.ipk;
        }
        return totalIPK / mhs.length;
    }

    // Method untuk menampilkan data mahasiswa dengan IPK terbesar
    public static Mahasiswa20 mahasiswaTerbaik(Mahasiswa20[] mhs) {
        Mahasiswa20 terbaik = mhs[0];
        for (Mahasiswa20 mahasiswa : mhs) {
            if (mahasiswa.ipk > terbaik.ipk) {
                terbaik = mahasiswa;
            }
        }
        return terbaik;
    }
}
