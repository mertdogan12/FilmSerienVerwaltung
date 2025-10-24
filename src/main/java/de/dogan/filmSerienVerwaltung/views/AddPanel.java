package de.dogan.filmSerienVerwaltung.views;

import de.dogan.filmSerienVerwaltung.media.MediaType;

import javax.swing.*;
import java.awt.*;

public class AddPanel extends JPanel {

    private final JTextPane nameTextPane;
    private final JTextPane bewertung;
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

    public JTextPane getBewertung() {
        return bewertung;
    }

    public AddPanel() {
        super.setLayout(new BorderLayout());

        this.nameTextPane = new JTextPane();
        this.bewertung = new JTextPane();
        this.submitFilm = new JButton("submit");
        this.mediaType = new JComboBox<>(MediaType.values());

        this.getBewertung().setBackground(Color.CYAN);
        this.getBewertung().setPreferredSize(new Dimension((int) (AddFrame.WIDTH * 0.3), 0));

        this.getNameTextPane().setText("Film/Serien Name");
        this.getBewertung().setText("Deine Bewertung");

        super.add(this.getMediaType(), BorderLayout.PAGE_START);
        super.add(this.getNameTextPane(), BorderLayout.CENTER);
        super.add(this.getBewertung(), BorderLayout.LINE_END);
        super.add(this.getSubmitFilm(), BorderLayout.PAGE_END);
    }
}
