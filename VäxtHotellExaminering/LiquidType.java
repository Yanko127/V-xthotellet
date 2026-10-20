package VäxtHotellExaminering;

// ENUM: vätsketypen kan bara vara ett av dessa tre alternativ.
public enum LiquidType {
    TAP_WATER(Texts.TAP_WATER),
    MINERAL_WATER(Texts.MINERAL_WATER),
    PROTEIN_DRINK(Texts.PROTEIN_DRINK);

    // INKAPSLING: visningsnamnet är privat och kan inte bytas ut.
    private final String displayName;

    LiquidType(String displayName) {
        this.displayName = displayName;
    }

    public String getDisplayName() {
        return displayName;
    }
}
