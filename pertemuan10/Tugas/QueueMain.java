package pertemuan10.Tugas;

import java.util.Scanner;

public class QueueMain {
    public static void menu() {
        System.out.println("1. Tambah antrian baru");
        System.out.println("2. Antrian keluar");
        System.out.println("3. Cek antrian terdepan");
        System.out.println("4. Cek semua antrian");
        System.out.println("5. Cek antrian belakang");
        System.out.println("6. Cari antrian pembeli");
        System.out.println("7. Exit");
        System.out.println("----------------------------------");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);

        System.out.print("Masukkan kapasitas antrian : ");
        int jumlah = sc.nextInt();

        Queue20 Q = new Queue20(jumlah);

        int pilih = 0;
        do {
            menu();
            pilih = sc.nextInt();
            switch (pilih) {
                case 1:
                    System.out.println("Masukkan nama : ");
                    String nama = sc.next();
                    System.out.println("Masukkan noHp : ");
                    int noHp = sc2.nextInt();
                    Pembeli20 pembeli = new Pembeli20(nama, noHp);
                    Q.Enqueue(pembeli);
                    break;
                case 2:
                    Pembeli20 data = Q.Dequeue();
                    if (data != null) {
                        System.out.println("Antrian yang dikeluarkan : " + data.nama + " " + data.noHP);
                    }
                    break;
                case 3:
                    Q.peek();
                    break;
                case 4:
                    Q.daftarPembeli();
                    break;
                case 5:
                    Q.peekRear();
                    break;
                case 6:
                    System.out.println("Masukkan nama Pembeli : ");
                    String cariNama = sc.next();
                    Q.peekPosition(cariNama);
                    break;
                case 7:
                    System.exit(0);
                    break;
                default:
                    break;
            }
        } while (pilih != 7);
    }
}
