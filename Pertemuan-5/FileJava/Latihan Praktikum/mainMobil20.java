public class mainMobil20 {
    public static void main(String[] args) {

        dataMobil20 outputMobil = new dataMobil20();
        System.out.println("============================================================");
        System.out.println("Mobil dengan top_accaleration tertinggi adalah "
                + outputMobil.maxAcceleration(outputMobil.topAcceleration, 0, outputMobil.topAcceleration.length - 1));
        System.out.println("Mobil dengan top_accaleration terendah adalah "
                + outputMobil.minAcceleration(outputMobil.topAcceleration, 0, outputMobil.topAcceleration.length - 1));
        System.out.println("Rata-rata top_power adalah " + outputMobil.rataPower());
    }
}
