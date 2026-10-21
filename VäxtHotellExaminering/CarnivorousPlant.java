package VäxtHotellExaminering;

// ARV
public class CarnivorousPlant extends Plant {
    private static final double BASE_LITERS = 0.1;
    private static final double LITERS_PER_METER = 0.2;

    public CarnivorousPlant(String name, double heightInMeters) {
        super(name, heightInMeters);
    }

    // POLYMORFISM
    @Override
    public double calculateDailyLiters() {
        return BASE_LITERS + LITERS_PER_METER * getHeightInMeters();
    }

    @Override
    public LiquidType getLiquidType() {
        return LiquidType.PROTEIN_DRINK;
    }
}
