package gameoflife;

import java.util.logging.Level;
import java.util.logging.Logger;

/** Main.*/
public class Main {

    /** Aufrufen des JFrame GUI und Instanzierung der Klasse GUI.*/
    private static GUI gui = new GUI();
    /** Variable time entspricht der zeitlichen Verzögerung in der Endlosschleife.*/
    private final static int TIME = 300;

    /**main-Methode aufrufen.*/
    public static void main(final String[] args) {
        //Controll.Initialise(Controll.CoArr);
        // GUI gui = new GUI();
        //Kaestchen kasten = new Kaestchen();
        //GUI gui = new GUI();
        while (true) {
            // while (GUI.konstant.getstop() == 0) {
            if (GUI.konstant.getstop() == 0) {
                // Control.autostop();
                Control.regel.start();
                gui.repaint();
                //System.out.println(GUI.konstant.getstop());
            }
            try {
                Thread.sleep(TIME);
            } catch (InterruptedException ex) {
                Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
            }

        }

    }
}
