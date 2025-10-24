package de.dogan.filmSerienVerwaltung.views;

import de.dogan.filmSerienVerwaltung.media.AMedia;

import javax.swing.*;
import java.awt.*;

public class MediaInfo extends JPanel {

    private final JLabel nameLabel;
    private final JLabel typeLabel;
    private final JLabel bewertungsLabel;

    public JLabel getNameLabel() {
        return nameLabel;
    }

    public JLabel getTypeLabel() {
        return typeLabel;
    }

    public JLabel getBewertungsLabel() {
        return bewertungsLabel;
    }

    public MediaInfo() {
        this.nameLabel = new JLabel();
        this.typeLabel = new JLabel();
        this.bewertungsLabel = new JLabel();

        super.setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
        super.add(this.getNameLabel());
        super.add(this.getTypeLabel());
        super.add(this.getBewertungsLabel());
    }

    public void update(AMedia media) {
        this.getNameLabel().setText("Name: " + media.getName());
        this.getTypeLabel().setText("Type: " + media.getType());
        this.getBewertungsLabel().setText("Deine Bewertung: " + media.getBewertung());
    }
}
