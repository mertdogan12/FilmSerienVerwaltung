package de.dogan.filmSerienVerwaltung.views;

import de.dogan.filmSerienVerwaltung.media.MedienSammlung;

import javax.swing.*;
import java.awt.*;

public class MainPanel extends JPanel {

    private final SammlungPanel sammlungPanel;

    public SammlungPanel getSammlungPanel() {
        return sammlungPanel;
    }

    public MainPanel() {
        super.setLayout(new BorderLayout());
    }
}
