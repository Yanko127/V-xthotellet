package VäxtHotellExaminering;

// INTERFACE
// ARV
public abstract class Plant implements Waterable {
    // INKAPSLING
    private final String name;
    private final double heightInMeters;

    protected Plant(String name, double heightInMeters) {
        this.name = name;
        this.heightInMeters = heightInMeters;
    }

    public String getName() {
        return name;
    }

    public double getHeightInMeters() {
        return heightInMeters;
    }

    // POLYMORFISM
    @Override
    public abstract double calculateDailyLiters();

    @Override
    public abstract LiquidType getLiquidType();
}
