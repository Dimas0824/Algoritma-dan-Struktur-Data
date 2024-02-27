import java.util.Scanner;

public class Perulangan20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan NIM: ");
        String nim = sc.nextLine();
        System.out.println("===============");

        int n = Integer.parseInt(nim.substring(nim.length() - 2));
        if (n < 10) {
            n += 10;
        }

        System.out.println("n: " + n);
        System.out.print("OUTPUT: ");
        for (int i = 1; i <= n; i++) {
            if (i > 12) {
                break;
            }
            if (i == 6 || i == 10) {
                continue; // Lewati angka 6 dan 10
            }
            if (i % 2 == 0) {
                System.out.print(i + " "); // Angka genap dicetak
            } else {
                System.out.print("* "); // Angka ganjil dicetak dengan *
            }
        }
    }
}
