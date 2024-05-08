package pertemuan11.TUGAS.No2;

public class QueueLinkedList20 {
    Node20 head, tail;

    boolean isEmpty() {
        return head == null;
    }

    void print() {
        if (!isEmpty()) {
            Node20 bantu = head;
            System.out.println("=================================");
            System.out.print("Isi Linked List : ");
            while (bantu != null) {
                System.out.print("(NIM: " + bantu.NIM + ", " + " Nama: " + bantu.nama + "), ");
                bantu = bantu.next;
            }
            System.out.println("");
            System.out.println("=================================");
            System.out.println();
        } else {
            System.out.println("Linked List masih kosong");
        }
    }

    void addLast(int NIM, String nama) {
        Node20 ndInput = new Node20(NIM, nama, null);
        if (isEmpty()) {
            head = ndInput;
        } else {
            tail.next = ndInput;
        }
        tail = ndInput;
    }

    void removeFirst() {
        if (isEmpty()) {
            System.out.println("Linked list masih kosong, tidak dapat dihapus");
        } else if (head == tail) {
            head = tail = null;
        } else {
            head = head.next;
        }
    }
}
