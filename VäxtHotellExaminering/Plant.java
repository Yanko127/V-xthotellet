package VäxtHotellExaminering;

// INTERFACE: Plant lovar att växterna följer kontraktet Waterable.
// ARV: den abstrakta basklassen samlar det som alla växter har gemensamt.
public abstract class Plant implements Waterable {
    // INKAPSLING: fälten är privata och läses genom getters.
    // final betyder att värdena inte kan bytas efter konstruktionen.
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

    // POLYMORFISM: varje konkret växttyp ger metoderna sin egen kod.
    @Override
    public abstract double calculateDailyLiters();

    @Override
    public abstract LiquidType getLiquidType();
}
