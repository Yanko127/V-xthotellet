package VäxtHotellExaminering;

// ENUM
public enum LiquidType {
    TAP_WATER(Texts.TAP_WATER),
    MINERAL_WATER(Texts.MINERAL_WATER),
    PROTEIN_DRINK(Texts.PROTEIN_DRINK);

    // INKAPSLING
    private final String displayName;

    LiquidType(String displayName) {
        this.displayName = displayName;
    }

    public String getDisplayName() {
        return displayName;
    }
}
