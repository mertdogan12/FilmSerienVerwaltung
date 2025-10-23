package de.dogan.filmSerienVerwaltung.views;

import de.dogan.filmSerienVerwaltung.media.AMedia;

import javax.swing.*;
import java.awt.*;

public class MediaPanel extends JPanel {

    private final AMedia media;
    private final MediaLabel mediaLablel;
    private final RemoveButton mediaRemoveButton;

    public MediaLabel getMediaLablel() {
        return mediaLablel;
    }

    public RemoveButton getMediaRemoveButton() {
        return mediaRemoveButton;
    }

    public AMedia getMedia() {
        return media;
    }

    public MediaPanel(AMedia media) {
        this.media = media;
        this.mediaLablel = new MediaLabel(this.getMedia());
        this.mediaRemoveButton = new RemoveButton();

        super.setLayout(new BorderLayout());
        super.setMaximumSize(new Dimension(Integer.MAX_VALUE, MainFrame.HEIGHT / 20));

        super.add(this.getMediaLablel(), BorderLayout.LINE_START);
        super.add(this.getMediaRemoveButton(), BorderLayout.LINE_END);
    }
}
