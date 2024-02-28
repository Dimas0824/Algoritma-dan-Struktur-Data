public class SegitigaSgArray20 {
    public static void main(String[] args) {
        Segitiga20[] sgArray = new Segitiga20[4];

        sgArray[0] = new Segitiga20(10, 4);
        sgArray[1] = new Segitiga20(20, 10);
        sgArray[2] = new Segitiga20(15, 6);
        sgArray[3] = new Segitiga20(25, 10);

        for (int i = 0; i < sgArray.length; i++) {
            System.out.println("Segitiga ke-" + i);
            System.out.println("Luas: " + sgArray[i].hitungLuas());
            System.out.println("Keliling: " + sgArray[i].hitungKeliling());
        }
    }
}