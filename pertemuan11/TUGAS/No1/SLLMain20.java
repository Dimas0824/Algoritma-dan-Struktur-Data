package pertemuan11.TUGAS.No1;

public class SLLMain20 {
    public static void main(String[] args) {
        SingleLinkedList20 singLL = new SingleLinkedList20();
        singLL.addFirst(111, "Anton");
        singLL.print();
        singLL.addLast(115, "Sari");
        singLL.print();
        singLL.insertAfter(111, "Anton", 112, "Prita");
        singLL.print();
        singLL.insertAt(2, 113, "Yusuf");
        singLL.print();
    }
}