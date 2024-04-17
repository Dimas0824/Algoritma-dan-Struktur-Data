package UTS;

import java.util.Scanner;

public class main20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        angka20 angka = new angka20();
        angka.nilaiAngka = new int[] { 13, 11, 41, 6, 44, 27, 7, 27, 26, 13, 49, 21, 1, 42, 7, 45, 48 };

        System.out.println("Data angka yang tersedia: ");
        angka.tampil();

        System.out.println("========================================================================");
        System.out.print("Masukkan angka yang akan dicari: ");
        int cari = sc.nextInt();

        System.out.println("========================================================================");
        System.out.println("data sebelum diurutkan: ");
        angka.tampil();
        int posisi = angka.unsortedBinarySearch(cari);
        if (posisi != -1) {
            System.out.println("Angka " + cari + " ditemukan pada indeks: " + posisi);
        } else {
            System.out.println("Angka " + cari + " tidak ditemukan dalam data angka.");
        }
        System.out.println("========================================================================");

        angka.selectionSortAscending();
        System.out.println("data setelah diurutkan secara ascending: ");
        angka.tampil();
        angka.selectionSortAscending();
        int posisiSetelahPengurutanAscending = angka.binSearchAscending(cari, 0, angka.nilaiAngka.length - 1);
        if (posisiSetelahPengurutanAscending != -1) {
            System.out.println("Angka " + cari + " ditemukan pada indeks ke-" + (posisiSetelahPengurutanAscending)
                    + " setelah pengurutan ascending");
        } else {
            System.out.println("Angka " + cari + " tidak ditemukan pada data angka");
        }
        System.out.println("========================================================================");

        angka.selectionSortDescending();
        System.out.println("data setelah diurutkan secara descending: ");
        angka.tampil();
        angka.selectionSortDescending();
        int posisiSetelahPengurutanDescending = angka.binSearchDescending(cari, 0, angka.nilaiAngka.length - 1);
        if (posisiSetelahPengurutanDescending != -1) {
            System.out.println("Angka " + cari + " ditemukan pada indeks ke-" + (posisiSetelahPengurutanDescending)
                    + " setelah pengurutan descending");
        } else {
            System.out.println("Angka " + cari + " tidak ditemukan pada data angka");
        }
        System.out.println("========================================================================");
    }
}
