package ArrayBalok;

public class ArrayBalok20 {
    public static void main(String[] args) {
        Balok20[] blArray = new Balok20[3];

        blArray[0] = new Balok20(100, 30, 12);
        blArray[1] = new Balok20(120, 40, 15);
        blArray[2] = new Balok20(210, 50, 25);

        for (int i = 0; i < 3; i++) {
            System.out.println("Volume balok ke-" + i + ": " + blArray[i].hitungVolume());
        }
    }
}
