package Kuis2;

class LinkedList20 {
    Node20 head;

    public LinkedList20() {
        this.head = null;
    }

    public void tambahTim(TimVoli20 tim) {
        Node20 newNode = new Node20(tim);
        if (head == null || head.data.poin <= tim.poin) {
            newNode.next = head;
            head = newNode;
        } else {
            Node20 current = head;
            while (current.next != null && current.next.data.poin > tim.poin) {
                current = current.next;
            }
            newNode.next = current.next;
            current.next = newNode;
        }
    }

    public void updateKlasemen(TimVoli20[] semuaTim) {
        // Kosongkan linked list
        this.head = null;

        // Tambahkan semua tim ke linked list
        for (TimVoli20 tim : semuaTim) {
            this.tambahTim(tim);
        }
    }

    public void tampilkanRanking() {
        System.out.println(new String(new char[136]).replace("\0", "-"));
        String format = "| %-4s | %-35s | %-7s | %-4s | %-4s | %-4s | %-4s | %-4s | %-4s | %-4s | %-4s | %-4s | %-4s | %-7s |\n";
        System.out.format(format, "Rank", "Team", "Matches", "W", "L", "Pts.", "3-0", "3-1", "3-2", "2-3", "1-3", "0-3",
                "W", "L", "R");
        System.out.println(new String(new char[136]).replace("\0", "-"));
        Node20 current = head;
        int rank = 1;
        while (current != null) {
            TimVoli20 tim = current.data;
            int totalMatches = tim.menang + tim.kalah;
            double setRatio = (tim.totalSetKalah == 0) ? tim.totalSetMenang
                    : (double) tim.totalSetMenang / tim.totalSetKalah;
            System.out.format(format, rank, tim.namaTim, totalMatches, tim.menang, tim.kalah, tim.poin,
                    tim.setMenang3_0, tim.setMenang3_1, tim.setMenang3_2, tim.setKalah2_3, tim.setKalah1_3,
                    tim.setKalah0_3, tim.totalSetMenang, tim.totalSetKalah, String.format("%.4f", setRatio));
            current = current.next;
            rank++;
            System.out.println(new String(new char[136]).replace("\0", "-"));
        }
    }
}
