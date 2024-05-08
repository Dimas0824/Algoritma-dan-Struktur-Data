# <p align ="center"> LAPORAN PRAKTIKUM ALGORITMA DAN STRUKTUR DATA </p>

<br><br><br><br>

<p align="center">
   <img src="https://static.wikia.nocookie.net/logopedia/images/8/8a/Politeknik_Negeri_Malang.png/revision/latest?cb=20190922202558" width="33%"> </p>

<br><br><br><br><br>

<p align = "center"> Nama : Muhammad Irsyad Dimas Abdillah </p>
<p align = "center"> Absen: 20 </p>
<p align = "center"> NIM  : 2341720088 </p>
<p align = "center"> Prodi: TEKNIK INFOMATIKA</p>
<p align = "center"> Kelas: 1B </p>

<br><br><br>

# Praktikum 1: Pembuatan Single Linked List

Code<br>

```java
package pertemuan11.minggu11;

public class Node20 {
    int data;
    Node20 next;

    Node20(int nilai, Node20 berikutnya) {
        data = nilai;
        next = berikutnya;
    }
}
```

```java
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
```

```java
package pertemuan11.minggu11;

public class SLLMain20 {
    public static void main(String[] args) {
        SingleLinkedList20 singLL = new SingleLinkedList20();
        singLL.print();
        singLL.addFirst(890);
        singLL.print();
        singLL.addLast(760);
        singLL.print();
        singLL.addFirst(700);
        singLL.print();
        singLL.insertAfter(700, 999);
        singLL.print();
        singLL.insertAt(3, 833);
        singLL.print();
    }
}
```

Output<br>![alt text](img/OptP1.png)

## Pertanyaan

1. Mengapa hasil compile kode program di baris pertama menghasilkan “Linked List Kosong”?<br>
   Jawab: karena program melakukan print data kosong terlebih dahulu dan belum diinputkan nilai linked list. Kemudian setelah print, baru diinputkan datanya.<br>
2. Jelaskan kegunaan variable temp secara umum pada setiap method! <br>
   Jawab: variabel temp(temporary) digunakan sebagai tempat penyimpanan sementara dalam proses atau operasi tertentu sebelum nilai atau hasilnya ditransfer atau digunakan lebih lanjut dalam konteks suatu metode atau fungsi. <br>
3. Perhatikan class SingleLinkedList, pada method insertAt Jelaskan kegunaan kode berikut <br>

```java
if(temp.next.next==null) tail = temp.next;
```

Jawab: Kode diatas digunakan untuk memeriksa apakah node yang diikuti oleh temp adalah node terakhir dalam linked list. Jika ya, maka tail akan diatur ke node tersebut. ini digunakan untuk memperbarui nilai tail ketika menambahkan node baru di akhir linked list. <br>

# Praktikum 2: Modifikasi Elemen pada Single Linked List

Code<br>

```java

```

```java

```

```java

```

Output<br>
