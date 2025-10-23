package de.dogan.filmSerienVerwaltung.views;

import de.dogan.filmSerienVerwaltung.media.MedienSammlung;

import javax.swing.*;

public class MainFrame extends JFrame {

    public static final int WIDTH = 1920 / 2;
    public static final int HEIGHT = 1080 / 2;
    public static final String TITLE = "Film und Serien Verwaltung";

    private final MainPanel mainPanel;

    public MainPanel getMainPanel() {
        return mainPanel;
    }

    public MainFrame() {
        super.setSize(WIDTH, HEIGHT);
        super.setTitle(TITLE);
        super.setDefaultCloseOperation(EXIT_ON_CLOSE);

        this.mainPanel = new MainPanel();
        super.add(mainPanel);
    }

}
