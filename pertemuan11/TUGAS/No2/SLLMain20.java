package pertemuan11.TUGAS.No2;

import java.util.Scanner;

public class SLLMain20 {
    public static void menu() {
        System.out.println("=================================");
        System.out.println("1. Tambah antrian baru");
        System.out.println("2. Antrian keluar");
        System.out.println("3. Cek antrian terdepan");
        System.out.println("4. Cek antrian terbelakang");
        System.out.println("5. Cek semua antrian");
        System.out.println("6. Exit");
        System.out.println("=================================");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);

        QueueLinkedList20 Q = new QueueLinkedList20();

        int pilih = 0;
        do {
            menu();
            System.out.print("Masukkan pilihan : ");
            pilih = sc.nextInt();
            System.out.println();
            switch (pilih) {
                case 1:
                    System.out.println("=================================");
                    System.out.print("Masukkan NIM : ");
                    int NIM = sc.nextInt();
                    System.out.print("Masukkan nama : ");
                    String nama = sc2.next();
                    Q.addLast(NIM, nama);
                    System.out.println("=================================");
                    System.out.println();
                    break;
                case 2:
                    Q.removeFirst();
                    break;
                case 3:
                    Q.peekHead();
                    break;
                case 4:
                    Q.peekTail();
                    break;
                case 5:
                    Q.print();
                    break;
                case 6:
                    System.exit(0);
                    break;
                default:
                    break;
            }
        } while (pilih != 6);
    }
}
