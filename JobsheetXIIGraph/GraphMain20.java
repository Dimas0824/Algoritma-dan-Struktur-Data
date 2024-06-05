package JobsheetXIIGraph;

import java.util.Scanner;

public class GraphMain20 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        GraphMatriks20 graph = new GraphMatriks20(4);

        char choice;
        do {
            System.out.println("\nMenu Program:");
            System.out.println("1) Add Edge");
            System.out.println("2) Remove Edge");
            System.out.println("3) InDegree");
            System.out.println("4) OutDegree");
            System.out.println("5) TotalDegree");
            System.out.println("6) Print Graph");
            System.out.println("7) Check Edge");
            System.out.println("8) Update Jarak");
            System.out.println("9) Hitung banyaknya Edge");
            System.out.println("0) Exit");

            System.out.print("\nMasukkan pilihan: ");
            choice = scanner.next().charAt(0);

            switch (choice) {
                case '1':
                    System.out.print("Masukkan asal: ");
                    int asal = scanner.nextInt();
                    System.out.print("Masukkan tujuan: ");
                    int tujuan = scanner.nextInt();
                    System.out.print("Masukkan jarak: ");
                    int jarak = scanner.nextInt();
                    graph.makeEdge(asal, tujuan, jarak);
                    break;
                case '2':
                    System.out.print("Masukkan asal: ");
                    asal = scanner.nextInt();
                    System.out.print("Masukkan tujuan: ");
                    tujuan = scanner.nextInt();
                    graph.removeEdge(asal, tujuan);
                    break;
                case '3':
                    System.out.print("Masukkan vertex (angka bulat mulai dari 0): ");
                    int vertex = scanner.nextInt();
                    System.out.println("InDegree dari Gedung " + vertex + ": " + graph.inDegree(vertex));
                    break;
                case '4':
                    System.out.print("Masukkan vertex (angka bulat mulai dari 0): ");
                    vertex = scanner.nextInt();
                    System.out.println("OutDegree dari Gedung " + vertex + ": " + graph.OutDegree(vertex));
                    break;
                case '5':
                    System.out.print("Masukkan vertex (angka bulat mulai dari 0): ");
                    vertex = scanner.nextInt();
                    System.out.println("Total Degree dari Gedung " + vertex + ": " + graph.totalDegree(vertex));
                    break;
                case '6':
                    graph.printGraph();
                    break;
                case '7':
                    System.out.print("Masukkan asal: ");
                    asal = scanner.nextInt();
                    System.out.print("Masukkan tujuan: ");
                    tujuan = scanner.nextInt();
                    if (graph.matriks[asal][tujuan] != -1) {
                        System.out.println("Edge dari Gedung " + asal + " ke Gedung " + tujuan
                                + " ada dengan jarak " + graph.matriks[asal][tujuan]);
                    } else {
                        System.out.println("Edge dari Gedung " + asal + " ke Gedung " + tujuan + " tidak ada");
                    }
                    break;
                case '8':
                    System.out.print("Masukkan asal: ");
                    asal = scanner.nextInt();
                    System.out.print("Masukkan tujuan: ");
                    tujuan = scanner.nextInt();
                    System.out.print("Masukkan jarak: ");
                    int jarakBaru = scanner.nextInt();
                    graph.updateJarak(asal, tujuan, jarakBaru);
                    break;
                case '9':
                    System.out.print("Masukkan vertex (angka bulat mulai dari 0): ");
                    vertex = scanner.nextInt();
                    System.out.println("Jumlah Edge dari Gedung " + vertex + ": " + graph.hitungEdge());
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
