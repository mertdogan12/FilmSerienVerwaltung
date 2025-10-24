package de.dogan.filmSerienVerwaltung.listener;

import de.dogan.filmSerienVerwaltung.media.*;
import de.dogan.filmSerienVerwaltung.util.SammlungUtil;
import de.dogan.filmSerienVerwaltung.views.*;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AddMediaListener implements ActionListener {

    private final AddFrame mainFrame;
    private final AddPanel addPanel;
    private final SammlungPanel sammlungPanel;
    private final Sidebar sidebar;
    private AMedia media;

    public SammlungPanel getSammlungPanel() {
        return this.sammlungPanel;
    }

    public AMedia getMedia() {
        return this.media;
    }

    public Sidebar getSidebar() {
        return this.sidebar;
    }

    private void setMedia(AMedia media) {
        this.media = media;
    }

    public AddPanel getAddPanel() {
        return addPanel;
    }

    public AddFrame getMainFrame() {
        return mainFrame;
    }

    public AddMediaListener(AddFrame mainFrame, AddPanel addPanel, SammlungPanel sammlungPanel, Sidebar sidebar) {
        this.mainFrame = mainFrame;
        this.addPanel = addPanel;
        this.sammlungPanel = sammlungPanel;
        this.sidebar = sidebar;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        double bewertung;
        MediaType type = MediaType.values()[this.getAddPanel().getMediaType().getSelectedIndex()];

        try {
            bewertung = Double.parseDouble(this.getAddPanel().getBewertung().getText());
        } catch (NumberFormatException e) {
            error("Bewertung ist keine valide Zahl");
            return;
        }

        switch (type) {
            case FILM -> this.setMedia(new Movie(this.getAddPanel().getNameTextPane().getText(), bewertung));

            case SERIE -> this.setMedia(new Serie(this.getAddPanel().getNameTextPane().getText(), bewertung));

            default -> {
                error("Unsupported media type: " + type);
                return;
            }
        }

        MedienSammlung.getMedienSammlung().addMedia(this.getMedia());
        SammlungUtil.addButtons(this.getSammlungPanel(), this.getSidebar());
        this.getMainFrame().dispose();
    }

    private void error(String message) {
        new ErrorFrame(message);
    }
}
