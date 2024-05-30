package pertemuan13.TugasPraktikum.Tugas2;

import java.util.Scanner;

public class MainFilm {
    public static void main(String[] args) {

        DoubleLinkedListFilm film = new DoubleLinkedListFilm();

        Scanner scA = new Scanner(System.in);
        Scanner scS = new Scanner(System.in);

        int pilih = 0;
        while (pilih != 10) {
            film.menu();
            pilih = scA.nextInt();
            switch (pilih) {
                case 1:
                    System.out.println("Masukkan Data Film Posisi Awal");
                    System.out.println("ID Film : ");
                    int id = scA.nextInt();
                    System.out.println("Judul Film : ");
                    String judul = scS.nextLine();
                    System.out.println("Rating Film : ");
                    double rating = scA.nextDouble();
                    film.tambahAwal(id, judul, rating); // Perbaikan di sini
                    break;

                case 2:
                    System.out.println("Masukkan Data Posisi Akhir");
                    System.out.println("ID Film : ");
                    id = scA.nextInt();
                    System.out.println("Judul Film : ");
                    judul = scS.nextLine();
                    System.out.println("Rating Film : ");
                    rating = scA.nextDouble();
                    film.tambahAkhir(id, judul, rating); // Perbaikan di sini
                    break;

                case 3:
                    System.out.println("Masukkan Data Film");
                    System.out.println("Urutan Film : ");
                    int urutan = scA.nextInt();
                    System.out.println("ID Film : ");
                    id = scA.nextInt();
                    System.out.println("Judul Film : ");
                    judul = scS.nextLine();
                    System.out.println("Rating Film : ");
                    rating = scA.nextDouble();
                    film.tambahFilmIndeks(urutan - 1, id, judul, rating);
                    System.out.println("Data film ini akan masuk di urutan ke-" + urutan);
                    break;

                case 4:
                    System.out.println("Hapus Data Pertama");
                    film.hapusPertama();
                    break;

                case 5:
                    System.out.println("Hapus Data Terakhir");
                    film.hapusTerakhir();
                    break;

                case 6:
                    System.out.println("Hapus Data Film Tertentu");
                    System.out.println("Masukkan ID Film yang ingin di hapus : ");
                    id = scA.nextInt();
                    film.hapusbyId(id);
                    break;

                case 7:
                    System.out.println("Cetak Data Film");
                    film.printNodeFilms();
                    break;

                case 8:
                    System.out.println("Cari ID Film");
                    System.out.println("Masukkan ID Film yang ingin di cari : ");
                    id = scA.nextInt();
                    film.cariIDFilm(id);
                    break;

                case 9:
                    System.out.println("Urutkan Data Rating Film-DESC");
                    film.urutkanRating();
                    break;

                case 10:
                    System.out.println("Program Selesai");
                    break;

                default:
                    System.out.println("Pilihan Tidak Tersedia");
                    break;
            }
        }
    }
}
