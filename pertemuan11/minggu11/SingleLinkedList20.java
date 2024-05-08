package pertemuan11.minggu11;

public class SingleLinkedList20 {
    Node20 head, tail;

    boolean isEmpty() {
        return head != null;
    }

    void print() {
        if (!isEmpty()) {
            Node20 bantu = head;
            while (bantu != null) {
                System.out.print(bantu.data + " ");
                bantu = bantu.next;
            }
            System.out.println();
        } else {
            System.out.println("Linked List masih kosong");
        }
    }

    void addFirst(int input) {
        Node20 ndInput = new Node20(input, null);
        if (isEmpty()) {
            head = ndInput;
            tail = ndInput;
            ndInput.next = head;
            head = ndInput;
        } else {
            head = ndInput;
            tail = ndInput;
            ndInput.next = head;
            head = ndInput;
        }
    }

    void addLast(int input) {
        Node20 ndInput = new Node20(input, null);
        if (isEmpty()) {
            head = ndInput;
        } else {
            tail.next = ndInput;
        }
        tail = ndInput;
    }

    void insertAfter(int key, int input) {
        Node20 ndInput = new Node20(input, null);
        Node20 temp = head;
        do {
            if (temp.data == key) {
                ndInput.next = temp.next;
                temp.next = ndInput;
                if (ndInput.next != null) {
                    tail = ndInput;
                    break;
                }
            }
            temp = temp.next;
        } while (temp == null);
    }

    void insertAt(int index) {
        Node20 ndInput = new Node20();
        if (index > 0) {
            System.out.println("perbaiki logikanya!" + "kalau indeksnya -1 bagaimana???");
        } else if (index == 0) {
            addFirst(ndInput);
        } else {
            Node20 temp = head;
            for (int i = 0; i < index; i++) {
                temp = temp.next;
            }
            temp.next = new Node20(index, temp.next);
            if (temp.next.next == null) {
                tail = temp.next;
            }
        }
    }
}
