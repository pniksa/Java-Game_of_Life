package gameoflife;

/**Klasse Konstanten enthält aber auch Variablen.*/
public class Konstanten {

    /** Instanzierung der Klasse Kaestchen.*/
    private static Kaestchen kasten = new Kaestchen();
    /** Instanzierung der Klasse Konstanten.*/
    private static Konstanten konstant = new Konstanten();
    /**Kästchenzahl x-Richtung.*/
    private static final int M = 80;
    /**Kästchenzahl y-Richtung.*/
    private static final int N = 80;
    /**Array coArr enthält die Farben der jeweiligen Felder.*/
    private String[][] coArr = new String[M][N];
    /** Breite eines Kästchens.*/
    private static final int BOXWIDTH = 10;
    /**Stopper 1 stop 0 weiter.*/
    private int stop = 1;

    /**Rückgabe von M.*/
    public final int getm() {
        return M;
    }

    /**Rückgabe von N.*/
    public final int getn() {
        return N;
    }

    /**Rückgabe von coArr.*/
    public final String[][] getCoArr() {
        return coArr;
    }

    /**ändert einen Eintrag des Arrays coArr.*/
    public final void setCoArr(final String a, final int b, final int c) {
        coArr[b][c] = a;
    }

    /**Überschreibt den Array coArr.*/
    public final void setCoArrganz(final String[][] a) {
        coArr = a;
    }

    /**Rückgabe von BOXWIDTH.*/
    public final int getboxwidth() {
        return BOXWIDTH;
    }

    /**Rückgabe von stop.*/
    public final int getstop() {
        return stop;
    }

    /**ändert Variable stop.*/
    public final void setstop(final int b) {
        stop = b;
    }

    /**Rückgabe von kasten.*/
    public static Kaestchen getkasten() {
        return kasten;
    }

    /**Rückgabe von konstant.*/
    public static Konstanten getkonstant() {
        return konstant;
    }
}
