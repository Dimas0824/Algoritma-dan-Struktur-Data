package pertemuan13.doublelinkedlist;

public class Node {
    int data;
    Node next, prev;

    Node(Node prev, int data, Node next) {
        this.prev = prev;
        this.data = data;
        this.next = next;
    }
}
