import java.util.Scanner;

public class Array20 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String[] mataKuliah = { "Pancasila", "Konsep Teknologi Informasi", "Critical Thinking and Problem Solving",
                "Matematika Dasar", "Bahasa Inggris", "Dasar Pemrograman", "Praktikum Dasar Pemrograman",
                "Keselamatan dan Kesehatan Kerja" };
        double[] sks = { 2, 2, 2, 3, 2, 2, 3, 2 };

        System.out.println("Program Menghitung IP Semester");
        System.out.println("==============================");

        double[] nilaiAngka = new double[mataKuliah.length];

        // Memasukkan nilai angka untuk setiap mata kuliah
        for (int i = 0; i < mataKuliah.length; i++) {
            System.out.print("Masukkan nilai Angka untuk MK " + mataKuliah[i] + ": ");
            nilaiAngka[i] = input.nextDouble();
        }

        System.out.println("\nHasil Konversi Nilai");
        System.out.println("==============================");
        System.out.printf("%-40s %-15s %-15s %-15s\n", "MK", "Nilai Angka", "Nilai Huruf", "Bobot Nilai");

        double totalBobotSks = 0; // Menyimpan total bobot SKS
        double totalSks = 0; // Menyimpan total SKS

        // Menampilkan nilai angka, nilai huruf, bobot nilai, dan bobot SKS
        for (int i = 0; i < mataKuliah.length; i++) {
            String nilaiHuruf = konversiNilaiHuruf(nilaiAngka[i]);
            double bobotNilai = konversiNilaiSetara(nilaiAngka[i]);
            double bobotSks = bobotNilai * sks[i];
            totalBobotSks += bobotSks;
            totalSks += sks[i];
            System.out.printf("%-40s %-15.2f %-15s %-15.2f\n", mataKuliah[i], nilaiAngka[i], nilaiHuruf,
                    bobotNilai);
        }

        // Menghitung IP semester
        double ipSemester = totalBobotSks / totalSks;

        System.out.println("\nIP Semester Anda: " + String.format("%.2f", ipSemester));
    }

    // Method untuk mengkonversi nilai angka menjadi nilai huruf
    public static String konversiNilaiHuruf(double nilaiAngka) {
        if (nilaiAngka >= 80) {
            return "A";
        } else if (nilaiAngka >= 75) {
            return "B+";
        } else if (nilaiAngka >= 65) {
            return "B";
        } else if (nilaiAngka >= 60) {
            return "C+";
        } else if (nilaiAngka >= 50) {
            return "C";
        } else if (nilaiAngka >= 40) {
            return "D";
        } else {
            return "E";
        }
    }

    // Method untuk menghitung bobot nilai setara berdasarkan nilai angka
    public static double konversiNilaiSetara(double nilaiAngka) {
        if (nilaiAngka >= 80) {
            return 4;
        } else if (nilaiAngka >= 75) {
            return 3.5;
        } else if (nilaiAngka >= 65) {
            return 3;
        } else if (nilaiAngka >= 60) {
            return 2.5;
        } else if (nilaiAngka >= 50) {
            return 2;
        } else if (nilaiAngka >= 40) {
            return 1;
        } else {
            return 0;
        }
    }
}
