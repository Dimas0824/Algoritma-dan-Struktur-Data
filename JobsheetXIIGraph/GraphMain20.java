package JobsheetXIIGraph;

import java.util.Scanner;

public class GraphMain20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Graph20 gedung = new Graph20(6);

        // Menambahkan edge awal
        gedung.addEdge(0, 1, 50);
        gedung.addEdge(0, 2, 100);
        gedung.addEdge(1, 3, 70);
        gedung.addEdge(2, 3, 40);
        gedung.addEdge(3, 4, 60);
        gedung.addEdge(4, 5, 80);

        try {
            gedung.degree(0);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        System.out.print("Masukkan Gedung asal: ");
        int asal = sc.nextInt();

        System.out.print("Masukkan Gedung tujuan: ");
        int tujuan = sc.nextInt();

        if (asal == tujuan) {
            System.out.println("Gedung " + (char) ('A' + asal) + " dan Gedung " + (char) ('A' + tujuan) + " sama!");
            return;
        }

        try {
            gedung.checkBertentangga(gedung, asal, tujuan);
            gedung.addEdge(asal, tujuan, 0);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}