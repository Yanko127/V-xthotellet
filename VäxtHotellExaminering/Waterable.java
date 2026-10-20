package VäxtHotellExaminering;

// INTERFACE: ett kontrakt för objekt som har ett dagligt vätskebehov.
public interface Waterable {
    double calculateDailyLiters();
    LiquidType getLiquidType();
}
