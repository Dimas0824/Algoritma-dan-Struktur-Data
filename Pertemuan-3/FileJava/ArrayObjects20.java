import java.util.Scanner;

public class ArrayObjects20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah Persegi Panjang: ");
        int jumlahPP = sc.nextInt();

        PersegiPanjang20[] ppArray = new PersegiPanjang20[jumlahPP];
        for (int i = 0; i < jumlahPP; i++) {
            ppArray[i] = new PersegiPanjang20();
            System.out.println("Persegi Panjang ke-" + i);
            System.out.print("Masukkan panjang: ");
            ppArray[i].panjang = sc.nextInt();
            System.out.print("Masukkan lebar: ");
            ppArray[i].lebar = sc.nextInt();
        }

        for (int i = 0; i < jumlahPP; i++) {
            System.out.println("Persegi Panjang ke-" + i);
            System.out.println("Panjang: " + ppArray[i].panjang + ", Lebar: " + ppArray[i].lebar);
        }
    }
}