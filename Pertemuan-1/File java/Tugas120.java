import java.util.Scanner;

public class Tugas120 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        char Kode[] = { 'A', 'B', 'D', 'E', 'F', 'G', 'H', 'L', 'N', 'T' };
        char Kota[][] = {
                { 'B', 'A', 'N', 'T', 'E', 'N' },
                { 'J', 'A', 'K', 'A', 'R', 'T', 'A' },
                { 'B', 'A', 'N', 'D', 'U', 'N', 'G' },
                { 'C', 'I', 'R', 'E', 'B', 'O', 'N' },
                { 'B', 'O', 'G', 'O', 'R' },
                { 'P', 'E', 'K', 'A', 'L', 'O', 'N', 'G', 'A', 'N' },
                { 'S', 'E', 'M', 'A', 'R', 'A', 'N', 'G' },
                { 'S', 'U', 'R', 'A', 'B', 'A', 'Y', 'A' },
                { 'M', 'A', 'L', 'A', 'N', 'G' },
                { 'T', 'E', 'G', 'A', 'L' }
        };

        System.out.print("Masukkan kode Plat Kendaraan: ");
        char kode = sc.next().toUpperCase().charAt(0);
        boolean kodeDitemukan = false; // Menandakan apakah kode ditemukan atau tidak
        int index = 0;
        for (int i = 0; i < Kode.length; i++) {
            if (Kode[i] == kode) {
                kodeDitemukan = true;
                index = i;
                break; // Keluar dari loop jika kode ditemukan
            }
        }

        if (kodeDitemukan) {
            System.out.println("Kota pencarian kode plat " + kode + " adalah: ");
            for (int i = 0; i < Kota[index].length; i++) {
                System.out.print(Kota[index][i] + " ");
            }
        } else {
            System.out.println("Kode plat tidak ada!");
        }
    }
}
