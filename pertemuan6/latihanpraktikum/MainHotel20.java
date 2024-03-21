package pertemuan6.latihanpraktikum;

import java.util.Scanner;

public class MainHotel20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        HotelService20 hotelService = new HotelService20();

        hotelService.tambah(new Hotel20("Flava Hotel", "Jakarta", 500000, (byte) 3));
        hotelService.tambah(new Hotel20("Horizon", "Bandung", 400000, (byte) 4));
        hotelService.tambah(new Hotel20("Boulevard Dreams", "Yogyakarta", 600000, (byte) 5));
        hotelService.tambah(new Hotel20("Sunday Vibes", "Surabaya", 450000, (byte) 2));
        hotelService.tambah(new Hotel20("Montana Hills", "Bali", 700000, (byte) 1));

        System.out.println("=============================================================");
        System.out.println("Pilih metode pengurutan yang ingin digunakan:");
        System.out.println("1. Pengurutan harga termurah ke harga tertinggi ");
        System.out.println("2. Pengurutan bintang tertinggi (5) ke terendah (1)");
        System.out.print("Pilihan: ");
        int pilihan = sc.nextInt();

        System.out.println("Sebelum pengurutan:");
        hotelService.tampilkanSemua();

        switch (pilihan) {
            case 1:
                System.out.println("\nSetelah pengurutan harga menggunakan Bubble Sort:");
                hotelService.urutkanHargaBubbleSort();
                hotelService.tampilkanSemua();
                System.out.println("\nSetelah pengurutan harga menggunakan Selection Sort:");
                hotelService.urutkanHargaSelectionSort();
                hotelService.tampilkanSemua();
                break;

            case 2:
                System.out.println("\nSetelah pengurutan bintang menggunakan Bubble Sort:");
                hotelService.urutkanBintangBubbleSort();
                hotelService.tampilkanSemua();
                System.out.println("\nSetelah pengurutan bintang menggunakan Selection Sort:");
                hotelService.urutkanBintangSelectionSort();
                hotelService.tampilkanSemua();
                break;

            default:
                System.out.println("Pilihan tidak valid.");
                break;
        }
    }
}
