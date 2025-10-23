package de.dogan.filmSerienVerwaltung.controller;

import de.dogan.filmSerienVerwaltung.media.MedienSammlung;
import de.dogan.filmSerienVerwaltung.media.Movie;
import de.dogan.filmSerienVerwaltung.views.MainFrame;
import de.dogan.filmSerienVerwaltung.views.SammlungPanel;

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

        SammlungController sammlungController = new SammlungController(this.getMedienSammlung());

        JScrollPane scrollPane = new JScrollPane(sammlungController.getSammlungPanel());
        scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
        scrollPane.getVerticalScrollBar().setUnitIncrement(16);

        this.getMainFrame().getMainPanel().add(scrollPane, BorderLayout.LINE_START);
        this.getMainFrame().setVisible(true);
    }
}
