package Latihan1;

import java.util.Scanner;

public class ArrayofObjects20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah kerucut: ");
        int jumlahKerucut = sc.nextInt();
        Kerucut20[] kerucutArray = new Kerucut20[jumlahKerucut];

        System.out.print("Masukkan jumlah limas segi empat: ");
        int jumlahLimasSegiEmpat = sc.nextInt();
        LimasSegiEmpat20[] limasSegiEmpatArray = new LimasSegiEmpat20[jumlahLimasSegiEmpat];

        System.out.print("Masukkan jumlah bola: ");
        int jumlahBola = sc.nextInt();
        Bola20[] bolaArray = new Bola20[jumlahBola];

        // Input atribut untuk setiap kerucut
        for (int i = 0; i < jumlahKerucut; i++) {
            System.out.println("Atribut kerucut ke-" + (i + 1));
            System.out.print("Masukkan jari-jari: ");
            int jariJari = sc.nextInt();
            System.out.print("Masukkan sisi miring: ");
            int sisiMiring = sc.nextInt();
            kerucutArray[i] = new Kerucut20(jariJari, sisiMiring);
            System.out.println();
        }

        // Input atribut untuk setiap limas segi empat
        for (int i = 0; i < jumlahLimasSegiEmpat; i++) {
            System.out.println("Atribut limas segi empat ke-" + (i + 1));
            System.out.print("Masukkan panjang sisi alas: ");
            int panjangSisiAlas = sc.nextInt();
            System.out.print("Masukkan tinggi: ");
            int tinggi = sc.nextInt();
            limasSegiEmpatArray[i] = new LimasSegiEmpat20(panjangSisiAlas, tinggi);
            System.out.println();
        }

        // Input atribut untuk setiap bola
        for (int i = 0; i < jumlahBola; i++) {
            System.out.println("Atribut bola ke-" + (i + 1));
            System.out.print("Masukkan jari-jari: ");
            int jariJariBola = sc.nextInt();
            bolaArray[i] = new Bola20(jariJariBola);
            System.out.println();
        }

        // Output untuk setiap kerucut
        System.out.println("\nHasil Perhitungan Kerucut:");
        for (int i = 0; i < jumlahKerucut; i++) {
            System.out.println("Luas kerucut ke-" + (i + 1) + ": " + kerucutArray[i].hitungLuas());
            System.out.println("Volume kerucut ke-" + (i + 1) + ": " + kerucutArray[i].hitungVolume());
            System.out.println();
        }

        // Output untuk setiap limas segi empat
        System.out.println("\nHasil Perhitungan Limas Segi Empat:");
        for (int i = 0; i < jumlahLimasSegiEmpat; i++) {
            System.out.println(
                    "Luas limas segi empat ke-" + (i + 1) + ": " + limasSegiEmpatArray[i].hitungLuasPermukaan());
            System.out.println("Volume limas segi empat ke-" + (i + 1) + ": " + limasSegiEmpatArray[i].hitungVolume());
            System.out.println();
        }

        // Output untuk setiap bola
        System.out.println("\nHasil Perhitungan Bola:");
        for (int i = 0; i < jumlahBola; i++) {
            System.out.println("Luas bola ke-" + (i + 1) + ": " + bolaArray[i].hitungLuasPermukaan());
            System.out.println("Volume bola ke-" + (i + 1) + ": " + bolaArray[i].hitungVolume());
            System.out.println();
        }
    }
}
