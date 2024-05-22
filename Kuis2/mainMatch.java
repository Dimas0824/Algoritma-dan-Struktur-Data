package Kuis2;

import java.util.Scanner;

public class mainMatch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedList20 ranking = new LinkedList20();

        // Set jumlah pertandingan yang akan dimainkan
        int jumlahPertandingan = 7;

        // Inisialisasi tim-tim dengan nama mereka
        TimVoli20 tim1 = new TimVoli20("JAKARTA STIN BIN", jumlahPertandingan);
        TimVoli20 tim2 = new TimVoli20("PALEMBANG BANK", jumlahPertandingan);
        TimVoli20 tim3 = new TimVoli20("JAKARTA LAVANI ALLO BANK ELECTRIC", jumlahPertandingan);
        TimVoli20 tim4 = new TimVoli20("JAKARTA BHAYANGKARA PRESISI", jumlahPertandingan);
        TimVoli20 tim5 = new TimVoli20("JAKARTA PERTAMINA PERTAMAX", jumlahPertandingan);
        TimVoli20 tim6 = new TimVoli20("KUDUS SUKUN BADAK", jumlahPertandingan);
        TimVoli20 tim7 = new TimVoli20("JAKARTA GARUDA JAYA", jumlahPertandingan);

        // Daftar semua tim
        TimVoli20[] semuaTim = { tim1, tim2, tim3, tim4, tim5, tim6, tim7 };

        // Simulasi pertandingan manual
        for (int i = 0; i < jumlahPertandingan; i++) {
            TimVoli20 tim1Match = pilihTim(sc, semuaTim, "pertama");
            System.out.println();
            TimVoli20 tim2Match = pilihTim(sc, semuaTim, "kedua");
            System.out.println();

            if (tim1Match == null || tim2Match == null) {
                System.out.println("Nama tim tidak ditemukan. Silakan coba lagi.");
                i--;
                continue;
            }

            boolean validInput = false;
            while (!validInput) {
                System.out.println(
                        "Masukkan hasil pertandingan untuk " + tim1Match.namaTim + " vs " + tim2Match.namaTim);
                System.out.print("Jumlah set menang untuk " + tim1Match.namaTim + ": ");
                if (sc.hasNextInt()) {
                    int menangTim1 = sc.nextInt();
                    System.out.print("Jumlah set kalah untuk " + tim1Match.namaTim + ": ");
                    if (sc.hasNextInt()) {
                        int kalahTim1 = sc.nextInt();
                        sc.nextLine();
                        if (menangTim1 >= 0 && kalahTim1 >= 0 && menangTim1 + kalahTim1 <= 5) {
                            tim1Match.updatepoin(menangTim1, kalahTim1, tim2Match.namaTim);
                            tim2Match.updatepoin(kalahTim1, menangTim1, tim1Match.namaTim);
                            validInput = true;
                            System.out.println();
                        } else {
                            System.out.println("Jumlah set tidak valid. Silakan coba lagi.");
                            System.out.println();
                        }
                    } else {
                        System.out.println("Input tidak valid. Silakan masukkan angka.");
                        System.out.println();
                        sc.nextLine();
                    }
                } else {
                    System.out.println("Input tidak valid. Silakan masukkan angka.");
                    System.out.println();
                    sc.nextLine();
                }
            }
        }

        // Tambahkan tim ke linked list
        for (TimVoli20 tim : semuaTim) {
            ranking.tambahTim(tim);
        }

        int pilih;
        do {

            System.out.println("================ Menu Sistem Pertandingan Voli ================");
            System.out.println("1. Tampilkan Klasemen");
            System.out.println("2. Tampilkan riwayat pertandingan setiap tim yang dipilih");
            System.out.println("3. Exit");
            System.out.print("Pilih menu: ");
            pilih = sc.nextInt();
            System.out.println();

            switch (pilih) {
                case 1:
                    // Tampilkan ranking
                    System.out.println("Klasemen Tim Proliga Voli Indonesia:");
                    ranking.tampilkanRanking();
                    System.out.println();
                    break;
                case 2:
                    // Tampilkan riwayat pertandingan setiap tim yang dipilih
                    System.out.println("Pilih tim:");
                    TimVoli20 timDipilih = pilihTim(sc, semuaTim, "");
                    if (timDipilih != null) {
                        timDipilih.tampilkanRiwayatPertandingan();
                    } else {
                        System.out.println("Nama tim tidak ditemukan.");
                    }
                    System.out.println();
                    break;
                case 3:
                    System.out.println("Program selesai.");
                    System.out.println();
                    break;
                default:
                    System.out.println("Pilihan tidak valid. Silakan coba lagi.");
                    System.out.println();
            }
        } while (pilih != 3);

        sc.close();
    }

    public static TimVoli20 pilihTim(Scanner sc, TimVoli20[] semuaTim, String urutan) {
        System.out.println("Pilih nama tim " + urutan + ":");
        for (int i = 0; i < semuaTim.length; i++) {
            System.out.println((i + 1) + ". " + semuaTim[i].namaTim);
        }
        System.out.print("Masukkan pilihan (1-" + semuaTim.length + "): ");
        int pilihan = sc.nextInt();
        sc.nextLine();

        if (pilihan > 0 && pilihan <= semuaTim.length) {
            return semuaTim[pilihan - 1];
        } else {
            System.out.println("Pilihan tidak valid. Silakan coba lagi.");
            return null;
        }
    }
}