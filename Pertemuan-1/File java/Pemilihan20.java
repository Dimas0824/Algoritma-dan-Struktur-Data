import java.util.Scanner;

public class Pemilihan20 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Program Menghitung Nilai Akhir");
        System.out.println("===============================");
        int nilaiTugas, nilaiKuis, nilaiUTS, nilaiUAS;

        // Memasukkan nilai tugas
        System.out.print("Masukkan nilai tugas: ");
        nilaiTugas = input.nextInt();
        // Memasukkan nilai kuis
        System.out.print("Masukkan nilai kuis: ");
        nilaiKuis = input.nextInt();
        // Memasukkan nilai UTS
        System.out.print("Masukkan nilai UTS: ");
        nilaiUTS = input.nextInt();
        // Memasukkan nilai UAS
        System.out.print("Masukkan nilai UAS: ");
        nilaiUAS = input.nextInt();
        System.out.println("===============================");

        // Memeriksa validitas nilai pada akhir input
        if (isValidNilai(nilaiTugas) && isValidNilai(nilaiKuis) && isValidNilai(nilaiUTS) && isValidNilai(nilaiUAS)) {
            // Hitung nilai akhir
            double nilaiAkhir = (nilaiTugas * 0.2) + (nilaiKuis * 0.2) + (nilaiUTS * 0.3) + (nilaiUAS * 0.4);

            // Konversi nilai huruf
            String nilaiHuruf;
            if (nilaiAkhir >= 80) {
                nilaiHuruf = "A";
            } else if (nilaiAkhir >= 75) {
                nilaiHuruf = "B+";
            } else if (nilaiAkhir >= 70) {
                nilaiHuruf = "B";
            } else if (nilaiAkhir >= 65) {
                nilaiHuruf = "C+";
            } else if (nilaiAkhir >= 60) {
                nilaiHuruf = "C";
            } else {
                nilaiHuruf = "D";
            }

            // Tampilkan hasil
            System.out.println("===============================");
            System.out.println("Nilai Akhir: " + nilaiAkhir);
            System.out.println("Nilai Huruf: " + nilaiHuruf);
            System.out.println("===============================");
            System.out.println("===============================");
            if (nilaiHuruf.equals("A") || nilaiHuruf.equals("B+") || nilaiHuruf.equals("B") || nilaiHuruf.equals("C+")
                    || nilaiHuruf.equals("C")) {
                System.out.println("SELAMAT ANDA LULUS");
            } else {
                System.out.println("ANDA TIDAK LULUS");
            }
        } else {
            System.out.println("===============================");
            System.out.println("Nilai tidak valid");
            System.out.println("===============================");
            System.out.println("===============================");
        }
    }

    // Method untuk memeriksa apakah nilai berada dalam rentang 0-100
    public static boolean isValidNilai(int nilai) {
        return nilai >= 0 && nilai <= 100;
    }
}
