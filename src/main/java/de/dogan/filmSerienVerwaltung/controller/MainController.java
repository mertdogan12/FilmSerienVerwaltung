package de.dogan.filmSerienVerwaltung.controller;

import de.dogan.filmSerienVerwaltung.media.MedienSammlung;
import de.dogan.filmSerienVerwaltung.media.Movie;
import de.dogan.filmSerienVerwaltung.views.MainFrame;
import de.dogan.filmSerienVerwaltung.views.SammlungPanel;

import javax.swing.*;
import java.awt.*;
import java.util.List;

public class MainController {

    private final MedienSammlung medienSammlung;

    private MedienSammlung getMedienSammlung() {
        return medienSammlung;
    }

    public MainController() {
        this.medienSammlung = new MedienSammlung(List.of(
                new Movie("Batman"),
                new Movie("Batman"),
                new Movie("Pluribus - Glück ist ansteckend")
        ));

        MainFrame mainFrame = new MainFrame();

        SammlungPanel sammlungPanel = new SammlungPanel(this.getMedienSammlung());

        JScrollPane scrollPane = new JScrollPane(sammlungPanel);
        scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
        scrollPane.getVerticalScrollBar().setUnitIncrement(16);

        mainFrame.getMainPanel().add(scrollPane, BorderLayout.LINE_START);
    }
}
