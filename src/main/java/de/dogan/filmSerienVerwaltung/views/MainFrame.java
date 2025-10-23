package de.dogan.filmSerienVerwaltung.views;

import javax.swing.*;

public final class MainFrame {

    public static final int WIDTH = 1920 / 2;
    public static final int HEIGHT = 1080 / 2;
    public static final String TITLE = "Film und Serien Verwaltung";

    private final JFrame mainFrame;

    public JFrame getMainFrame() {
        return mainFrame;
    }

    public MainFrame() {
        this.mainFrame = new JFrame();

        this.getMainFrame().setSize(WIDTH, HEIGHT);
        this.getMainFrame().setTitle(TITLE);
        this.getMainFrame().setVisible(true);
    }

}
