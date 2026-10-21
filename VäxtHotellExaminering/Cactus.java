package VäxtHotellExaminering;

// ARV
public class Cactus extends Plant {
    
    private static final double DAILY_LITERS = 0.02;

    public Cactus(String name, double heightInMeters) {
        super(name, heightInMeters);
    }

    // POLYMORFISM
    @Override
    public double calculateDailyLiters() {
        return DAILY_LITERS;
    }

    @Override
    public LiquidType getLiquidType() {
        return LiquidType.MINERAL_WATER;
    }
}
