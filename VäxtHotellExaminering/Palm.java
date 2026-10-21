package VäxtHotellExaminering;

// ARV
public class Palm extends Plant {
    private static final double LITERS_PER_METER = 0.5;

    public Palm(String name, double heightInMeters) {
        super(name, heightInMeters);
    }

    // POLYMORFISM
    @Override
    public double calculateDailyLiters() {
        return LITERS_PER_METER * getHeightInMeters();
    }

    @Override
    public LiquidType getLiquidType() {
        return LiquidType.TAP_WATER;
    }
}
