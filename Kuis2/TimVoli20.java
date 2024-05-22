package Kuis2;

public class TimVoli20 {
    String namaTim;
    int menang, kalah, poin;
    int setMenang3_0, setMenang3_1, setMenang3_2, setKalah2_3, setKalah1_3, setKalah0_3;
    int totalSetMenang, totalSetKalah;
    Match[] historiPertandingan;
    int jmlMatch;

    public TimVoli20(String namaTim, int jmlMatch) {
        this.namaTim = namaTim;
        menang = 0;
        kalah = 0;
        poin = 0;
        setMenang3_0 = 0;
        setMenang3_1 = 0;
        setMenang3_2 = 0;
        setKalah2_3 = 0;
        setKalah1_3 = 0;
        setKalah0_3 = 0;
        totalSetMenang = 0;
        totalSetKalah = 0;
        this.historiPertandingan = new Match[jmlMatch];
        this.jmlMatch = 0;
    }

    public void updatepoin(int menang, int kalah, String lawan) {
        this.menang += (menang > kalah) ? 1 : 0;
        this.kalah += (kalah > menang) ? 1 : 0;

        if (menang == 3 && kalah == 0) {
            this.poin += 3;
            this.setMenang3_0++;
        } else if (menang == 3 && kalah == 1) {
            this.poin += 3;
            this.setMenang3_1++;
        } else if (menang == 3 && kalah == 2) {
            this.poin += 2;
            this.setMenang3_2++;
        } else if (menang == 2 && kalah == 3) {
            this.poin += 1;
            this.setKalah2_3++;
        } else if (menang == 1 && kalah == 3) {
            this.poin += 0;
            this.setKalah1_3++;
        } else if (menang == 0 && kalah == 3) {
            this.poin += 0;
            this.setKalah0_3++;
        }

        this.totalSetMenang += menang;
        this.totalSetKalah += kalah;

        if (jmlMatch < historiPertandingan.length) {
            historiPertandingan[jmlMatch++] = new Match(menang, kalah, lawan);
        } else {
            System.out.println("Riwayat pertandingan penuh.");
        }
    }

    class Match {
        int menang;
        int kalah;
        String lawan;

        public Match(int menang, int kalah, String lawan) {
            this.menang = menang;
            this.kalah = kalah;
            this.lawan = lawan;
        }
    }

    public void tampilkanRiwayatPertandingan() {
        System.out.println("Riwayat Pertandingan untuk " + this.namaTim + ":");
        System.out.println(new String(new char[101]).replace("\0", "-"));
        String format = "| %-30s | %-30s | %-5s | %-5s | %-5s |\n";
        System.out.format(format, "Tim", "Lawan", "W", "L", "Poin");
        System.out.println(new String(new char[101]).replace("\0", "-"));

        for (int i = 0; i < jmlMatch; i++) {
            Match match = historiPertandingan[i];
            int poin = (match.menang > match.kalah) ? 3 : 0; // calculate points based on win/loss
            System.out.format(format, this.namaTim, match.lawan, match.menang, match.kalah, poin);
            System.out.println(new String(new char[101]).replace("\0", "-"));
        }
    }
}
