package pertemuan11.minggu11;

public class SingleLinkedList20 {
    Node20 head, tail;

    boolean isEmpty() {
        return head == null;
    }

    void print() {
        if (!isEmpty()) {
            Node20 bantu = head;
            System.out.print("Isi Linked List : ");
            while (bantu != null) {
                System.out.print(bantu.data + " ");
                bantu = bantu.next;
            }
            System.out.println("");
        } else {
            System.out.println("Linked List masih kosong");
        }
    }

    void addFirst(int input) {
        Node20 ndInput = new Node20(input, null);
        if (isEmpty()) {
            head = ndInput;
            tail = ndInput;
        } else {
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

    void insertAt(int index, int input) {
        if (index < 0) {
            System.out.println("Index tidak boleh negatif");
            return;
        }
        if (index == 0) {
            addFirst(input);
            return;
        }
        Node20 ndInput = new Node20(input, null);
        Node20 temp = head;
        for (int i = 0; i < index - 1; i++) {
            if (temp == null) {
                System.out.println("Indeks melebihi panjang linked list");
                return;
            }
            temp = temp.next;
        }
        if (temp == null) {
            System.out.println("Indeks melebihi panjang linked list");
            return;
        }
        ndInput.next = temp.next;
        temp.next = ndInput;
        if (ndInput.next == null) {
            tail = ndInput;
        }
    }
}
