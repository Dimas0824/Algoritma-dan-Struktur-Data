package JobsheetXIIGraph;

public class Node20 {
    int data;
    Node20 prev, next;
    int jarak;

    Node20(Node20 prev, int data, int jarak, Node20 next) {
        this.prev = prev;
        this.data = data;
        this.next = next;
        this.jarak = jarak;
    }
}