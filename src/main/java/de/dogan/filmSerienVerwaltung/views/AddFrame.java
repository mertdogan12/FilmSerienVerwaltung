package de.dogan.filmSerienVerwaltung.views;

import javax.swing.*;

public class AddFrame extends JFrame {

    public static final int WIDTH = 400;
    public static final int HEIGHT = 200;

    private final AddPanel addPanel;

    public AddPanel getAddPanel() {
        return addPanel;
    }

    public AddFrame() {
        super.setTitle("File/Serie hinzufügen");
        super.setSize(WIDTH, HEIGHT);
        super.setVisible(true);

        this.addPanel = new AddPanel();

        super.add(this.getAddPanel());
    }
}
