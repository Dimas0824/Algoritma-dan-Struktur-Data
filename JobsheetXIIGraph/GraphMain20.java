package JobsheetXIIGraph;

import java.util.Scanner;

public class GraphMain20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        GraphMatriks20 gdg = new GraphMatriks20(4);
        gdg.makeEdge(0, 1, 50);
        gdg.makeEdge(1, 0, 60);
        gdg.makeEdge(1, 2, 70);
        gdg.makeEdge(2, 1, 80);
        gdg.makeEdge(2, 3, 40);
        gdg.makeEdge(3, 0, 90);
        gdg.printGraph();
        System.out.println("Hasil setelah penghapusan edge");
        gdg.removeEdge(2, 1);
        gdg.printGraph();

        System.out.println();
        System.out.println("InDegree dari Gedung A: " + gdg.inDegree(0));
        System.out.println("OutDegree dari Gedung A: " + gdg.OutDegree(0));
        System.out.println("Total Degree dari Gedung A: " + gdg.totalDegree(0));

        sc.close();
    }
}