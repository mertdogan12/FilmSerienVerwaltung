package de.dogan.filmSerienVerwaltung.views;

import de.dogan.filmSerienVerwaltung.media.AMedia;

import javax.swing.*;
import java.awt.*;

public class MediaLabel extends JLabel {

    private final AMedia media;

    public AMedia getMedia() {
        return media;
    }

    public MediaLabel(AMedia media) {
        this.media = media;

        super.setText(media.toString());
    }
}
