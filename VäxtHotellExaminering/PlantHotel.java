package VäxtHotellExaminering;

import java.util.List;

public class PlantHotel {
    private static final String IGGE_NAME = "Igge";
    private static final String LAURA_NAME = "Laura";
    private static final String MEATLOAF_NAME = "Meatloaf";
    private static final String OLOF_NAME = "Olof";
    private static final double IGGE_HEIGHT_METERS = 0.2;
    private static final double LAURA_HEIGHT_METERS = 5.0;
    private static final double MEATLOAF_HEIGHT_METERS = 0.7;
    private static final double OLOF_HEIGHT_METERS = 1.0;

    // INKAPSLING
    // POLYMORFISM
    private final List<Plant> plants = List.of(
            new Cactus(IGGE_NAME, IGGE_HEIGHT_METERS),
            new Palm(LAURA_NAME, LAURA_HEIGHT_METERS),
            new CarnivorousPlant(MEATLOAF_NAME, MEATLOAF_HEIGHT_METERS),
            new Palm(OLOF_NAME, OLOF_HEIGHT_METERS)
    );

    public Plant findPlant(String name) {
        if (name == null || name.isBlank()) {
            return null;
        }

        String cleanedName = name.trim();
        for (Plant plant : plants) {
            if (plant.getName().equalsIgnoreCase(cleanedName)) {
                return plant;
            }
        }
        return null;
    }
}
