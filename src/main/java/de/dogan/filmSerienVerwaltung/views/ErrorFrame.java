package de.dogan.filmSerienVerwaltung.views;

import javax.swing.*;
import java.awt.*;

public class ErrorFrame extends JFrame {

    public static final int WIDTH = 300;
    public static final int HEIGHT = 100;

    private final JPanel errorPanel;

    public JPanel getErrorPanel() {
        return errorPanel;
    }

    public ErrorFrame(String errorMessage) {
        this.errorPanel = new JPanel();

        super.setTitle("Error");
        super.setSize(WIDTH, HEIGHT);

        this.getErrorPanel().setLayout(new BorderLayout());

        JLabel error = new JLabel();
        error.setText(errorMessage);
        this.getErrorPanel().add(error, BorderLayout.CENTER);

        super.add(this.getErrorPanel());

        super.setVisible(true);
    }
}
