package de.dogan.filmSerienVerwaltung.views;

import de.dogan.filmSerienVerwaltung.media.MediaType;

import javax.swing.*;
import java.awt.*;

public class AddPanel extends JPanel {

    private final JTextPane nameTextPane;
    private final JButton submitFilm;
    private final JComboBox<MediaType> mediaType;

    public JTextPane getNameTextPane() {
        return nameTextPane;
    }

    public JButton getSubmitFilm() {
        return submitFilm;
    }

    public JComboBox<MediaType> getMediaType() {
        return mediaType;
    }

    public AddPanel() {
        super.setLayout(new BorderLayout());

        this.nameTextPane = new JTextPane();
        this.submitFilm = new JButton("submit");
        this.mediaType = new JComboBox<>(MediaType.values());

        super.add(this.getMediaType(), BorderLayout.PAGE_START);
        super.add(this.getNameTextPane(), BorderLayout.CENTER);
        super.add(this.getSubmitFilm(), BorderLayout.PAGE_END);
    }
}
