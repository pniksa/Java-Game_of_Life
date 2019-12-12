package gameoflife;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

/** Klasse Control hat einen MouseListener und einen ActionListener.*/
class Control implements MouseListener, ActionListener {

    /** Erzeugt Instanz der Klasse Regeln.*/
    static Regeln regel = new Regeln();

    /**Methode Initialise wird benutzt um die Werte des Farb-Arrays auf weiß zu setzen.*/
    public static String[][] initialise(final String[][] a) {
        String[][] b = a;
        for (int p = 0; p < GUI.konstant.getm(); p++) {
            for (int k = 0; k < GUI.konstant.getn(); k++) {
                b[p][k] = "white";
            }
        }
        return b;
    }

    /**Farbbestimmung überprüft an der Stelle x,y welche Farbe vorliegt und ändert diese.*/
    public void farbbestimmung(final int x, final int y) {
        int c = ((x) / GUI.konstant.getboxwidth());
        int d = ((y) / GUI.konstant.getboxwidth());
        //System.out.println(c+" "+d);

        if (GUI.konstant.getCoArr()[c][d].equals("white")) {
            GUI.konstant.setCoArr("black", c, d);
        } else {
            GUI.konstant.setCoArr("white", c, d);
        }        //System.out.println(c+" "+d+" "+CoArr[c][d]);
    }

    /**Verarbeitet Mausdrücke und gibt die Position an im Feld und führt Farbwechsel durch.*/
    public void mouseClicked(final MouseEvent e) {
        // System.out.println("ich bin geklickt");
        int x = (int) GUI.kasten.getMousePosition().getX();
        int y = (int) GUI.kasten.getMousePosition().getY();
        farbbestimmung(x, y);
        GUI.kasten.repaint();
        // System.out.println(x+" "+" "+y);
    }

    /**nicht benutzt.*/
    public void mousePressed(final MouseEvent e) {
        // throw new UnsupportedOperationException("Not supported yet.");
    }

    /**nicht benutzt.*/
    public void mouseReleased(final MouseEvent e) {
        // throw new UnsupportedOperationException("Not supported yet.");
    }

    /**nicht benutzt.*/
    public void mouseEntered(final MouseEvent e) {
        // throw new UnsupportedOperationException("Not supported yet.");
    }

    /**nicht benutzt.*/
    public void mouseExited(final MouseEvent e) {
        // throw new UnsupportedOperationException("Not supported yet.");
    }

    /**ActionListener für die Buttons.*/
    public void actionPerformed(final ActionEvent e) {
        if (e.getActionCommand().equals("Loeschen")) {
            GUI.konstant.setCoArrganz(initialise(GUI.konstant.getCoArr()));
            GUI.konstant.setstop(1);
            GUI.kasten.repaint();
        } else if (e.getActionCommand().equals("Start")) {
            GUI.konstant.setstop(0);
            // for (int i = 1; i <= 10; i++) {
            regel.start();

            GUI.kasten.repaint();
            /*    try {
            Thread.sleep(200);
            } catch (InterruptedException ex) {
            Logger.getLogger(Control.class.getName()).log(Level.SEVERE, null, ex);
            }*/
            //}




        } else if (e.getActionCommand().equals("Stop")) {
            GUI.konstant.setstop(1);
        }
    }
    /* public static void autostop(){
    if (Arrays.equals(GUI.konstant.getCoArr(), initialise(GUI.konstant.getCoArr()))){
    GUI.konstant.setstop(1);
    }
    }*/
}
