import java.util.Scanner;

public class MainPangkat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("====================================");
        System.out.print("Masukkan jumlah elemen yang dihitung: ");
        int elemen = sc.nextInt();

        Pangkat20[] png20 = new Pangkat20[elemen];
        for (int i = 0; i < elemen; i++) {
            png20[i] = new Pangkat20();
            System.out.println("Masukkan nilai yang hendak dipangkatkan: ");
            png20[i].nilai = sc.nextInt();
            System.out.println("Masukkan nilai pemangkat: ");
            png20[i].pangkat = sc.nextInt();
        }

        System.out.println("HASIL PANGKAT - BRUTE FORCE");
        for (int i = 0; i < elemen; i++) {
            System.out.println("Hasil dari " + png20[i].nilai + " pangkat " + png20[i].pangkat + " adalah "
                    + png20[i].pangkatBF(png20[i].nilai, png20[i].pangkat));
        }

        System.out.println("HASIL PANGKAT - DIVIDE AND CONQUER");
        for (int i = 0; i < elemen; i++) {
            System.out.println("Hasil dari " + png20[i].nilai + " pangkat " + png20[i].pangkat + " adalah "
                    + png20[i].pangkatDC(png20[i].nilai, png20[i].pangkat));
        }
    }
}
