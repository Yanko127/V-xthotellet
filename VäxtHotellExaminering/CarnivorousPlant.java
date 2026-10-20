package VäxtHotellExaminering;

// ARV: en CarnivorousPlant är en Plant.
public class CarnivorousPlant extends Plant {
    private static final double BASE_LITERS = 0.1;
    private static final double LITERS_PER_METER = 0.2;

    public CarnivorousPlant(String name, double heightInMeters) {
        super(name, heightInMeters);
    }

    // POLYMORFISM: köttätande växter använder basnivå plus höjdtillägg.
    @Override
    public double calculateDailyLiters() {
        return BASE_LITERS + LITERS_PER_METER * getHeightInMeters();
    }

    @Override
    public LiquidType getLiquidType() {
        return LiquidType.PROTEIN_DRINK;
    }
}
