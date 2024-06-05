package JobsheetXIIGraph;

import java.util.Scanner;

public class GraphMain20 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Graph20 graph = new Graph20(4);

        char choice;
        do {
            System.out.println("\nMenu Program:");
            System.out.println("a) Add Edge");
            System.out.println("b) Remove Edge");
            System.out.println("c) InDegree");
            System.out.println("d) OutDegree");
            System.out.println("e) TotalDegree");
            System.out.println("f) Print Graph");
            System.out.println("g) Check Edge");
            System.out.println("h) Update Jarak");
            System.out.println("i) Hitung banyaknya Edge");
            System.out.println("0) Exit");

            System.out.print("\nMasukkan pilihan: ");
            choice = scanner.next().charAt(0);

            switch (choice) {
                case 'a':
                    System.out.print("Masukkan asal: ");
                    int asal = scanner.nextInt();
                    System.out.print("Masukkan tujuan: ");
                    int tujuan = scanner.nextInt();
                    System.out.print("Masukkan jarak: ");
                    int jarak = scanner.nextInt();
                    graph.addEdge(asal, tujuan, jarak);
                    break;
                case 'b':
                    try {
                        System.out.print("Masukkan asal: ");
                        asal = scanner.nextInt();
                        System.out.print("Masukkan tujuan: ");
                        tujuan = scanner.nextInt();
                        graph.removeEdge(asal, tujuan);
                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case 'c':
                    System.out.print("Masukkan vertex (angka bulat mulai dari 0): ");
                    int vertex = scanner.nextInt();
                    System.out.println("InDegree dari Gedung " + vertex + ": " + graph.inDegree(vertex));
                    break;
                case 'd':
                    System.out.print("Masukkan vertex (angka bulat mulai dari 0): ");
                    vertex = scanner.nextInt();
                    System.out.println("OutDegree dari Gedung " + vertex + ": " + graph.outDegree(vertex));
                    break;
                case 'e':
                    System.out.print("Masukkan vertex (angka bulat mulai dari 0): ");
                    vertex = scanner.nextInt();
                    System.out.println("Total Degree dari Gedung " + vertex + ": " + graph.totalDegree(vertex));
                    break;
                case 'f':
                    try {
                        graph.printGraph();
                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case 'g':
                    System.out.print("Masukkan asal: ");
                    asal = scanner.nextInt();
                    System.out.print("Masukkan tujuan: ");
                    tujuan = scanner.nextInt();
                    graph.checkBertentangga(graph, asal, tujuan);
                    break;
                case 'h':
                    System.out.print("Masukkan asal: ");
                    asal = scanner.nextInt();
                    System.out.print("Masukkan tujuan: ");
                    tujuan = scanner.nextInt();
                    System.out.print("Masukkan jarak: ");
                    int jarakBaru = scanner.nextInt();
                    graph.updateJarak(asal, tujuan, jarakBaru);
                    break;
                case 'i':
                    System.out.println("Jumlah Edge: " + graph.hitungEdge());
                    break;
                case '0':
                    System.out.println("Program selesai.");
                    break;
                default:
                    System.out.println("Pilihan tidak valid. Silakan coba lagi.");
            }
        } while (choice != '0');

        scanner.close();
    }
}
