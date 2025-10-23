package de.dogan.filmSerienVerwaltung.views;

import de.dogan.filmSerienVerwaltung.media.MedienSammlung;

import javax.swing.*;
import java.awt.*;

public class MainPanel extends JPanel {

    private final SammlungPanel sammlungPanel;

    public SammlungPanel getSammlungPanel() {
        return sammlungPanel;
    }

    public MainPanel(MedienSammlung sammlung) {
        this.sammlungPanel = new SammlungPanel(sammlung);

        JScrollPane scrollPane = new JScrollPane(this.getSammlungPanel());
        scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
        scrollPane.setPreferredSize(new Dimension(MainFrame.WIDTH, MainFrame.HEIGHT));
        scrollPane.getVerticalScrollBar().setUnitIncrement(16);

        super.setLayout(new BorderLayout());
        super.add(scrollPane, BorderLayout.LINE_START);
    }
}
