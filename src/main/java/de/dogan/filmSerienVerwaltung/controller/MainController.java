package de.dogan.filmSerienVerwaltung.controller;

import de.dogan.filmSerienVerwaltung.media.MedienSammlung;
import de.dogan.filmSerienVerwaltung.media.Movie;
import de.dogan.filmSerienVerwaltung.util.SammlungUtil;
import de.dogan.filmSerienVerwaltung.views.MainFrame;
import de.dogan.filmSerienVerwaltung.views.SammlungPanel;
import de.dogan.filmSerienVerwaltung.views.Sidebar;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class MainController {

    private final MedienSammlung medienSammlung;

    private final MainFrame mainFrame;

    private MedienSammlung getMedienSammlung() {
        return medienSammlung;
    }

    private MainFrame getMainFrame() {
        return mainFrame;
    }

    public MainController() {
        this.medienSammlung = new MedienSammlung(new ArrayList<>(List.of(
                new Movie("Batman"),
                new Movie("Batman"),
                new Movie("Pluribus - Glück ist ansteckend")
        )));
        this.mainFrame = new MainFrame();

        Sidebar sidebar = new Sidebar();

        SammlungPanel sammlungPanel = new SammlungPanel(this.getMedienSammlung());
        SammlungUtil.addButtons(this.getMedienSammlung(), sammlungPanel, sidebar);

        JScrollPane scrollPane = new JScrollPane(sammlungPanel);
        scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
        scrollPane.getVerticalScrollBar().setUnitIncrement(16);

        this.getMainFrame().getMainPanel().add(scrollPane, BorderLayout.CENTER);
        this.getMainFrame().getMainPanel().add(sidebar, BorderLayout.LINE_END);
        this.getMainFrame().setVisible(true);
    }
}
