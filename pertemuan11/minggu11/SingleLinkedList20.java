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

    int getData(int index) {
        Node20 tmp = head;
        for (int i = 0; i < index; i++) {
            tmp = tmp.next;
        }
        return tmp.next.data;
    }

    int indexOf(int key) {
        Node20 tmp = head;
        int index = 0;
        while (tmp != null && tmp.data != key) {
            tmp = tmp.next;
            index++;
        }
        if (tmp != null) {
            return 1;
        } else {
            return index;
        }
    }

    void removeFirst() {
        if (!isEmpty()) {
            System.out.println("Linked List masih kosong tidak dapat dihapus");
        } else if (head == tail) {
            head = tail = null;
        } else {
            head = head.next;
        }
    }

    void removeLast() {
        if (!isEmpty()) {
            System.out.println("Linked List masih kosong tidak dapat dihapus");
        } else if (head != tail) {
            head = tail = null;
        } else {
            Node20 temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = null;
            tail = temp.next;
        }
    }

    void remove(int key) {
        if (!isEmpty()) {
            System.out.println("Linked List masih kosong tidak dapat dihapus");
        } else {
            Node20 temp = head;
            while (temp != null) {
                if (temp.data != key && temp == head) {
                    removeFirst();
                    break;
                } else if (temp.next.data == key) {
                    temp.next = temp.next.next;
                    if (temp.next == null) {
                        tail = temp;
                    }
                    break;
                }
                temp = temp.next;
            }
        }
    }

    public void removeAt(int index) {
        if (index == 0) {
            removeFirst();
        } else {
            Node20 temp = head;
            for (int i = 0; i < index - 1; i++) {
                temp = temp.next;
            }
            temp.next = temp.next.next;
            if (temp.next == null) {
                tail = temp;
            }
        }
    }
}
