package nomcalc;

import javax.swing.*;

public class setInputData {

    public double Double (String msg) {
        return Double.parseDouble(JOptionPane.showInputDialog(msg));
    }

    public int Integer (String msg) {
        return Integer.parseInt(JOptionPane.showInputDialog(msg));
    }

}
