package de.dogan.filmSerienVerwaltung.views;

import de.dogan.filmSerienVerwaltung.media.AMedia;

import javax.swing.*;
import java.awt.*;

public class MediaPanel extends JPanel {

    private final AMedia media;
    private final MediaLabel mediaLable;

    public AMedia getMedia() {
        return media;
    }

    public MediaPanel(AMedia media) {
        this.media = media;
        this.mediaLable = new MediaLabel(media);

        super.setLayout(new BorderLayout());
        super.setMaximumSize(new Dimension(Integer.MAX_VALUE, MainFrame.HEIGHT / 20));

        super.add(mediaLable, BorderLayout.LINE_START);
        super.add(new RemoveButton(media), BorderLayout.LINE_END);
    }
}
