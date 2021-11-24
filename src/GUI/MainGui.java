package GUI;

import javax.swing.*;

public class MainGui {

    //
    public static void DialogTest(String WarnungsTitel, String WarnungMassege) {
        String backupDir = WarnungsTitel;
        // create a jframe
        JFrame frame = new JFrame("JOptionPane showMessageDialog example");
        // show a joptionpane dialog using showMessageDialog
        JOptionPane.showMessageDialog(frame, WarnungMassege);
    }
}
