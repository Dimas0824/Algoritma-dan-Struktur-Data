package Latihan1;

public class Kerucut20 {
    double jariJari;
    double sisiMiring;

    public Kerucut20(double jariJari, double sisiMiring) {
        this.jariJari = jariJari;
        this.sisiMiring = sisiMiring;
    }

    public double hitungLuas() {
        return Math.PI * jariJari * jariJari;
    }

    public double hitungVolume() {
        return (1.0 / 3.0) * Math.PI * jariJari * jariJari * sisiMiring;
    }
}
