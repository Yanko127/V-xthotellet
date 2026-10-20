package VäxtHotellExaminering;

// ARV: en Palm är en Plant och ärver namn och höjd.
public class Palm extends Plant {
    private static final double LITERS_PER_METER = 0.5;

    public Palm(String name, double heightInMeters) {
        super(name, heightInMeters);
    }

    // POLYMORFISM: palm använder sin egen formel.
    @Override
    public double calculateDailyLiters() {
        return LITERS_PER_METER * getHeightInMeters();
    }

    @Override
    public LiquidType getLiquidType() {
        return LiquidType.TAP_WATER;
    }
}
