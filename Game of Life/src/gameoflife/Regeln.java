package gameoflife;

/**Klasse enthält Regeln zur Farbänderung samt Abfrage.*/
public class Regeln {

    /** Zählt schwarze Kästchen um ein Feld herum.*/
    private int counter;
    /**Variable zu Vermeidung von Überläufen wegen den Rändern des Felders.*/
    private int k1;
    /**Variable zu Vermeidung von Überläufen wegen den Rändern des Felders.*/
    private int l1;
    /**Variable zu Vermeidung von Überläufen wegen den Rändern des Felders.*/
    private int k2;
    /**Variable zu Vermeidung von Überläufen wegen den Rändern des Felders.*/
    private int l2;
    //GUI control = new GUI();
    //Control konstant = new Control();
    /** Instanzierung der Klasse Konstanten um an n und m zu kommen.*/
    private Konstanten konstant = new Konstanten();

    /** Methode Start führt Regelüberprüfung durch.*/
    public final void start() {
        String[][] coArrsp = new String[konstant.getm()][konstant.getn()];
        for (int u = 0; u < konstant.getm(); u++) {
            System.arraycopy(GUI.konstant.getCoArr()[u], 0, coArrsp[u], 0, konstant.getn());
        }

        for (int i = 0; i < (konstant.getm()); i++) {
            for (int j = 0; j < (konstant.getn()); j++) {

                int b = 0;
                if ((i + 1) == konstant.getm()) {
                    k1 = 0;
                } else {
                    k1 = i + 1;
                }
                if ((i - 1) == -1) {
                    k2 = (konstant.getm() - 1);
                } else {
                    k2 = i - 1;
                }
                if ((j + 1) == konstant.getn()) {
                    l1 = 0;
                } else {
                    l1 = j + 1;
                }
                if ((j - 1) == -1) {
                    l2 = (konstant.getn() - 1);
                } else {
                    l2 = j - 1;
                }

                counter = 0;

                if (coArrsp[i][j].equals("black")) {
                    if (coArrsp[k2][l2].equals("black")) {
                        counter++;
                    }
                    if (coArrsp[k2][j].equals("black")) {
                        counter++;
                    }
                    if (coArrsp[k2][l1].equals("black")) {
                        counter++;
                    }
                    if (coArrsp[k1][l2].equals("black")) {
                        counter++;
                    }
                    if (coArrsp[k1][j].equals("black")) {
                        counter++;
                    }
                    if (coArrsp[k1][l1].equals("black")) {
                        counter++;
                    }
                    if (coArrsp[i][l2].equals("black")) {
                        counter++;
                    }
                    if (coArrsp[i][l1].equals("black")) {
                        counter++;
                    }
                    if (counter <= 1 || counter >= 4) {
                        GUI.konstant.setCoArr("white", i, j);
                    }
                } else {
                    if (coArrsp[k2][l2].equals("black")) {
                        counter++;
                    }
                    if (coArrsp[k2][j].equals("black")) {
                        counter++;
                    }
                    if (coArrsp[k2][l1].equals("black")) {
                        counter++;
                    }
                    if (coArrsp[k1][l2].equals("black")) {
                        counter++;
                    }
                    if (coArrsp[k1][j].equals("black")) {
                        counter++;
                    }
                    if (coArrsp[k1][l1].equals("black")) {
                        counter++;
                    }
                    if (coArrsp[i][l2].equals("black")) {
                        counter++;
                    }
                    if (coArrsp[i][l1].equals("black")) {
                        counter++;
                    }
                    if (counter == 3) {
                        GUI.konstant.setCoArr("black", i, j);
                    }
                }
            }
        }
    }
}
