package VäxtHotellExaminering;

import javax.swing.SwingUtilities;

public class Main {
    public static void main(String[] args) {
        // Starta fönstren på den tråd som Swing använder.
        SwingUtilities.invokeLater(GreenestApp::start);
    }
}
