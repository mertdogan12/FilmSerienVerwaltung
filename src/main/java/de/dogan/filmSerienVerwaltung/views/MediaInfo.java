package de.dogan.filmSerienVerwaltung.views;

import de.dogan.filmSerienVerwaltung.media.AMedia;

import javax.swing.*;
import java.awt.*;

public class MediaInfo extends JPanel {

    private final JLabel nameLabel;
    private final JLabel typeLabel;

    public JLabel getNameLabel() {
        return nameLabel;
    }

    public JLabel getTypeLabel() {
        return typeLabel;
    }

    public MediaInfo() {
        this.nameLabel = new JLabel();
        this.typeLabel = new JLabel();

        super.setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
        super.add(this.getNameLabel());
        super.add(this.getTypeLabel());
    }

    public void update(AMedia media) {
        this.getNameLabel().setText("Name: " + media.getName());
        this.getTypeLabel().setText("Type: " + media.getType());
    }
}
