package gameoflife;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

/** GUI-Ausgabe.*/
public class GUI extends JFrame {

    /** Instanzierung der Klasse Control.*/
    private Control control = new Control();
    /** Instanzierung der Klasse Kaestchen.*/
    static Kaestchen kasten = new Kaestchen();
    /** Instanzierung der Klasse Konstanten.*/
    static Konstanten konstant = new Konstanten();
    /** Erstellung des JButton Start.*/
    private final JButton start = new JButton("Start");
    /** Erstellung des JButton Stop.*/
    private final JButton stop = new JButton("Stop");
    /** Erstellung des JButton Löschen.*/
    private final JButton loeschen = new JButton("Löschen");
    /** Breite des Frames.*/
    private final int framewidth = 1024;
    /** Höhe des Frames.*/
    private final int frameheigth = 900;
    /** Erstellung des JPanel panel.*/
    private final JPanel panel;

    /**Konstrukter erstellt das JFrame.*/
    public GUI() {
        super("Game of Life");
        panel = new JPanel();
        this.setSize(framewidth, frameheigth);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new BorderLayout());
        panel.setLayout(new GridLayout(1, 3));
        panel.add(start);
        panel.add(stop);
        panel.add(loeschen);
        this.add(panel, BorderLayout.NORTH);

        konstant.setCoArrganz(Control.initialise(konstant.getCoArr()));

        //System.out.println(konstant.getCoArr()[1][1]);

        //System.out.println(konstant.getCoArr()[1][1]);
        start.addActionListener(control);
        start.setActionCommand("Start");
        stop.addActionListener(control);
        stop.setActionCommand("Stop");
        loeschen.addActionListener(control);
        loeschen.setActionCommand("Loeschen");
        this.addMouseListener(control);
        //Control.Initialise(Control.CoArr);

        this.add(kasten, BorderLayout.CENTER);

        //this.repaint();
        this.setVisible(true);
    }
}
