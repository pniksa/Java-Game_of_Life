package gameoflife;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JLabel;

/**Erzeugt das JLabel Kästchen.*/
public class Kaestchen extends JLabel {
    //GUI gui = new GUI();
    //Control konstant = new Control();

    /** Instanzierung der Klasse Konstanten um an n und m zu kommen.*/
    private Konstanten konstant = new Konstanten();

    @Override
    public final void paint(final Graphics stift) {
        stift.setColor(Color.black);
        for (int i = 0; i < konstant.getm(); i++) {
            for (int j = 0; j < konstant.getn(); j++) {
                //System.out.println(GUI.konstant.getCoArr()[i][j]);
                if (GUI.konstant.getCoArr()[i][j].equals("white")) {
                    stift.setColor(Color.white); //Farb-Variante
                    stift.fillRect(i * konstant.getboxwidth(), j * konstant.getboxwidth(), konstant.getboxwidth(), konstant.getboxwidth()); //Farb-Variante
                    //stift.drawString("0", (i) * konstant.getboxwidth(), (j+1) * konstant.getboxwidth()); //Ascii-Variante
                } else {
                    stift.fillRect(i * konstant.getboxwidth(), j * konstant.getboxwidth(), konstant.getboxwidth(), konstant.getboxwidth()); //Farb-Variante
                    //stift.drawString("1", (i) * konstant.getboxwidth(), (j+1) * konstant.getboxwidth()); //Ascii-Variante
                }
                stift.setColor(Color.black);
                stift.drawRect((i * konstant.getboxwidth()), (j * konstant.getboxwidth()), konstant.getboxwidth(), konstant.getboxwidth());
            }
        }
    }
}
