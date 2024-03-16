import java.util.Scanner;

public class MainPangkat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("====================================");
        System.out.print("Masukkan jumlah elemen yang dihitung: ");
        int elemen = sc.nextInt();

        Pangkat20[] png20 = new Pangkat20[elemen];
        for (int i = 0; i < elemen; i++) {
            System.out.println("Masukkan nilai yang hendak dipangkatkan: ");
            int nilai = sc.nextInt();
            System.out.println("Masukkan nilai pemangkat: ");
            int pangkat = sc.nextInt();
            png20[i] = new Pangkat20(nilai, pangkat);
        }

        System.out.println("================================================");
        System.out.println("Pilih metode perpangkatan yang ingin digunakan: ");
        System.out.println("1. Brute Force");
        System.out.println("2. Divide and Conquer");
        System.out.print("Pilihan: ");
        int pilihan = sc.nextInt();

        switch (pilihan) {
            case 1:
                System.out.println("HASIL PANGKAT - BRUTE FORCE");
                for (int i = 0; i < elemen; i++) {
                    System.out.println("Hasil dari " + png20[i].nilai + " pangkat " + png20[i].pangkat + " adalah "
                            + png20[i].pangkatBF(png20[i].nilai, png20[i].pangkat));
                }
                break;
            case 2:
                System.out.println("HASIL PANGKAT - DIVIDE AND CONQUER");
                for (int i = 0; i < elemen; i++) {
                    System.out.println("Hasil dari " + png20[i].nilai + " pangkat " + png20[i].pangkat + " adalah "
                            + png20[i].pangkatDC(png20[i].nilai, png20[i].pangkat));
                }
                break;
            default:
                System.out.println("Pilihan tidak tersedia");
                break;
        }

    }
}
