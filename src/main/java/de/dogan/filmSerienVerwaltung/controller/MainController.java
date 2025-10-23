package de.dogan.filmSerienVerwaltung.controller;

import de.dogan.filmSerienVerwaltung.listener.AddMediaListener;
import de.dogan.filmSerienVerwaltung.media.MedienSammlung;
import de.dogan.filmSerienVerwaltung.media.Movie;
import de.dogan.filmSerienVerwaltung.util.SammlungUtil;
import de.dogan.filmSerienVerwaltung.views.AddFrame;
import de.dogan.filmSerienVerwaltung.views.MainFrame;
import de.dogan.filmSerienVerwaltung.views.SammlungPanel;
import de.dogan.filmSerienVerwaltung.views.Sidebar;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class MainController {

    private final MainFrame mainFrame;

    private MainFrame getMainFrame() {
        return mainFrame;
    }

    public MainController() {
        this.mainFrame = new MainFrame();

        Sidebar sidebar = new Sidebar();

        SammlungPanel sammlungPanel = new SammlungPanel();
        SammlungUtil.addButtons(sammlungPanel, sidebar);

        JScrollPane scrollPane = new JScrollPane(sammlungPanel);
        scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
        scrollPane.getVerticalScrollBar().setUnitIncrement(16);

        sidebar.getAddButton().addActionListener(e -> {
            AddFrame addFrame = new AddFrame();
            addFrame.getAddPanel().getSubmitFilm().addActionListener(new AddMediaListener(
                addFrame, addFrame.getAddPanel(), sammlungPanel, sidebar
            ));
        });

        this.getMainFrame().getMainPanel().add(scrollPane, BorderLayout.CENTER);
        this.getMainFrame().getMainPanel().add(sidebar, BorderLayout.LINE_END);

        this.getMainFrame().setVisible(true);
    }
}
