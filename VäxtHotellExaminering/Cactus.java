package VäxtHotellExaminering;

// ARV: en Cactus är en Plant.
public class Cactus extends Plant {
    // Två centiliter är 0,02 liter. Alla beräkningar använder liter.
    private static final double DAILY_LITERS = 0.02;

    public Cactus(String name, double heightInMeters) {
        super(name, heightInMeters);
    }

    // POLYMORFISM: kaktusens mängd är oberoende av höjden.
    @Override
    public double calculateDailyLiters() {
        return DAILY_LITERS;
    }

    @Override
    public LiquidType getLiquidType() {
        return LiquidType.MINERAL_WATER;
    }
}
