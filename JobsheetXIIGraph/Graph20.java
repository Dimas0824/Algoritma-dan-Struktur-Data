package JobsheetXIIGraph;

public class Graph20 {
    int vertex;
    DoubleLinkedList20[] list;

    public Graph20(int v) {
        vertex = v;
        list = new DoubleLinkedList20[v];
        for (int i = 0; i < vertex; i++) {
            list[i] = new DoubleLinkedList20();
        }
    }

    public void addEdge(int asal, int tujuan, int jarak) {
        list[asal].addFirst(tujuan, jarak);
    }

    public void degree(int asal) throws Exception {
        int totalIn = 0, totalOut = 0;
        for (int i = 0; i < vertex; i++) {
            // inDegree
            for (int j = 0; j < list[i].size(); j++) {
                if (list[i].get(j) == asal) {
                    totalIn++;
                }
            }
            // out degree
            if (i == asal) {
                totalOut = list[i].size();
            }
        }
        System.out.println("InDegree dari Gedung " + (char) ('A' + asal) + ": " + totalIn);
        System.out.println("OutDegree dari Gedung " + (char) ('A' + asal) + ": " + totalOut);
        System.out.println("Total Degree dari Gedung " + (char) ('A' + asal) + ": " + (totalIn + totalOut));
    }

    public void removeEdge(int asal, int tujuan) throws Exception {
        list[asal].remove(tujuan);
    }

    public void removeAllEdges(int asal) throws Exception {
        for (int i = 0; i < vertex; i++) {
            list[i].clear();
        }
        System.out.println("Graph berhasil dikosongkan");
    }

    public void printGraph() throws Exception {
        for (int i = 0; i < vertex; i++) {
            if (list[i].size() > 0) {
                System.out.println("Gedung " + (char) ('A' + i) + " terhubung dengan ");
                for (int j = 0; j < list[i].size(); j++) {
                    System.out.print((char) ('A' + list[i].get(j)) + " (" + list[i].getJarak(j) + " m),");
                }
                System.out.println(" ");
            }
        }
        System.out.println(" ");
    }

    public void checkBertentangga(Graph20 graph, int asal, int tujuan) {
        boolean bertetangga = false;
        try {
            for (int i = 0; i < graph.list[asal].size(); i++) {
                if (graph.list[asal].get(i) == tujuan) {
                    bertetangga = true;
                    break;
                }
            }
            if (bertetangga) {
                System.out.println(
                        "Gedung " + (char) ('A' + asal) + " dan Gedung " + (char) ('A' + tujuan) + " bertetangga");
            } else {
                System.out.println("Gedung " + (char) ('A' + asal) + " dan Gedung " + (char) ('A' + tujuan)
                        + " tidak bertetangga");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}