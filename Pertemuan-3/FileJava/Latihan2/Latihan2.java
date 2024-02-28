package Latihan2;

import java.util.Scanner;

public class Latihan2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Mendefinisikan array untuk menyimpan informasi mahasiswa
        String[] nama = new String[3];
        String[] nim = new String[3];
        String[] jenisKelamin = new String[3];
        double[] ipk = new double[3];

        // Input informasi mahasiswa
        for (int i = 0; i < 3; i++) {
            System.out.println("Masukkan data mahasiswa ke-" + (i + 1));
            System.out.print("Masukkan nama: ");
            nama[i] = scanner.nextLine();
            System.out.print("Masukkan NIM: ");
            nim[i] = scanner.nextLine();
            System.out.print("Masukkan Jenis Kelamin: ");
            jenisKelamin[i] = scanner.nextLine();
            System.out.print("Masukkan IPK: ");
            ipk[i] = scanner.nextDouble();
            scanner.nextLine();
        }

        // Menampilkan informasi mahasiswa yang telah diinputkan
        for (int i = 0; i < 3; i++) {
            System.out.println("Data Mahasiswa ke-" + (i + 1));
            System.out.println("Nama: " + nama[i]);
            System.out.println("NIM: " + nim[i]);
            System.out.println("Jenis Kelamin: " + jenisKelamin[i]);
            System.out.println("IPK: " + ipk[i]);
            System.out.println();
        }
    }
}
