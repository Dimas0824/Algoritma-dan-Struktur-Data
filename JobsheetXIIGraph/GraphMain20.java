package JobsheetXIIGraph;

public class GraphMain20 {
    public static void main(String[] args) {
        Graph20 gedung = new Graph20(6);
        gedung.addEdge(0, 1, 50);
        gedung.addEdge(0, 2, 100);
        gedung.addEdge(1, 3, 70);
        gedung.addEdge(2, 3, 40);
        gedung.addEdge(3, 4, 60);
        gedung.addEdge(4, 5, 80);
        try {
            gedung.degree(0);
        } catch (Exception e) {
            e.printStackTrace();
        }

        try {
            gedung.printGraph();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
