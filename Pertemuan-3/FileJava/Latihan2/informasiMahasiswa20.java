package Latihan2;

import java.util.Scanner;

public class informasiMahasiswa20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Mahasiswa20[] mahasiswa = new Mahasiswa20[3];

        for (int i = 0; i < 3; i++) {
            System.out.println("Masukkan data mahasiswa ke-" + (i + 1));
            System.out.print("Masukkan nama: ");
            String nama = sc.nextLine();
            System.out.print("Masukkan NIM: ");
            String nim = sc.nextLine();
            System.out.print("Masukkan Jenis Kelamin: ");
            String jenisKelamin = sc.nextLine();
            System.out.print("Masukkan IPK: ");
            double ipk = sc.nextDouble();
            sc.nextLine();

            mahasiswa[i] = new Mahasiswa20(nama, nim, jenisKelamin, ipk);
        }
        System.out.println();

        // Menampilkan informasi mahasiswa yang telah diinputkan
        for (int i = 0; i < 3; i++) {
            System.out.println("Data Mahasiswa ke-" + (i + 1));
            System.out.println("Nama: " + mahasiswa[i].nama);
            System.out.println("NIM: " + mahasiswa[i].nim);
            System.out.println("Jenis Kelamin: " + mahasiswa[i].jenisKelamin);
            System.out.println("IPK: " + mahasiswa[i].ipk);
        }

    }
}
