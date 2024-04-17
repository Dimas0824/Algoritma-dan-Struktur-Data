package UTS;

public class angka20 {

    int[] nilaiAngka;
    int idx;

    void tampil() {
        for (int i = 0; i < nilaiAngka.length; i++) {
            System.out.print(nilaiAngka[i] + " ");
        }
        System.out.println();
    }

    void selectionSortAscending() {
        for (int i = 0; i < nilaiAngka.length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < nilaiAngka.length; j++) {
                if (nilaiAngka[j] < nilaiAngka[minIndex]) {
                    minIndex = j;
                }
            }
            int temp = nilaiAngka[i];
            nilaiAngka[i] = nilaiAngka[minIndex];
            nilaiAngka[minIndex] = temp;
        }
    }

    void selectionSortDescending() {
        for (int i = 0; i < nilaiAngka.length - 1; i++) {
            int maxIndex = i;
            for (int j = i + 1; j < nilaiAngka.length; j++) {
                if (nilaiAngka[j] > nilaiAngka[maxIndex]) {
                    maxIndex = j;
                }
            }
            int temp = nilaiAngka[i];
            nilaiAngka[i] = nilaiAngka[maxIndex];
            nilaiAngka[maxIndex] = temp;
        }
    }

    public int unsortedBinarySearch(int cari) {
        return unsortedBinarySearch(cari, 0, nilaiAngka.length - 1);
    }

    public int unsortedBinarySearch(int cari, int left, int right) {
        if (left <= right) {
            int mid = left + (right - left) / 2;

            if (nilaiAngka[mid] == cari) {
                return mid;
            }

            int leftResult = unsortedBinarySearch(cari, left, mid - 1);
            if (leftResult != -1) {
                return leftResult;
            }

            int rightResult = unsortedBinarySearch(cari, mid + 1, right);
            if (rightResult != -1) {
                return rightResult;
            }
        }
        return -1;
    }

    public int binSearchAscending(int cari, int left, int right) {
        selectionSortAscending();
        if (right >= left) {
            int mid = (left + right) / 2;
            if (cari == nilaiAngka[mid]) {
                return mid;
            } else if (cari < nilaiAngka[mid]) {
                return binSearchAscending(cari, left, mid - 1);
            } else {
                return binSearchAscending(cari, mid + 1, right);
            }
        }
        return -1;
    }

    public int binSearchDescending(int cari, int left, int right) {
        selectionSortDescending();
        if (right >= left) {
            int mid = (left + right) / 2;
            if (cari == nilaiAngka[mid]) {
                return mid;
            } else if (cari > nilaiAngka[mid]) {
                return binSearchDescending(cari, left, mid - 1);
            } else {
                return binSearchDescending(cari, mid + 1, right);
            }
        }
        return -1;
    }
}