package VäxtHotellExaminering;

import java.util.Locale;
import javax.swing.JOptionPane;

public class GreenestApp {
    public static void start() {
        PlantHotel hotel = new PlantHotel();

        while (true) {
            String input = JOptionPane.showInputDialog(
                    null, Texts.QUESTION, Texts.TITLE,
                    JOptionPane.QUESTION_MESSAGE);

            if (input == null) {
                return;
            }

            if (input.isBlank()) {
                JOptionPane.showMessageDialog(null, Texts.EMPTY_INPUT);
                continue;
            }

            Plant plant = hotel.findPlant(input);
            if (plant == null) {
                JOptionPane.showMessageDialog(null, Texts.UNKNOWN_PLANT);
                continue;
            }

            // POLYMORFISM
            String message = String.format(Locale.forLanguageTag(Texts.LANGUAGE_TAG),
                    Texts.RESULT_FORMAT, plant.getName(),
                    plant.calculateDailyLiters(),
                    plant.getLiquidType().getDisplayName());
            JOptionPane.showMessageDialog(null, message);
        }
    }
}
