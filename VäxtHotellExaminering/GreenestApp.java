package VäxtHotellExaminering;

import java.util.Locale;
import javax.swing.JOptionPane;

// Appen ansvarar för dialogrutorna och ordningen på användarens steg.
public class GreenestApp {
    public static void start() {
        PlantHotel hotel = new PlantHotel();

        // Fråga igen efter ett svar eller fel. Avbryt avslutar loopen.
        while (true) {
            String input = JOptionPane.showInputDialog(
                    null, Texts.QUESTION, Texts.TITLE,
                    JOptionPane.QUESTION_MESSAGE);

            // Avbryt eller kryss ger null.
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

            // POLYMORFISM: objektets växttyp avgör vilka metoder som körs.
            String message = String.format(Locale.forLanguageTag(Texts.LANGUAGE_TAG),
                    Texts.RESULT_FORMAT, plant.getName(),
                    plant.calculateDailyLiters(),
                    plant.getLiquidType().getDisplayName());
            JOptionPane.showMessageDialog(null, message);
        }
    }
}
