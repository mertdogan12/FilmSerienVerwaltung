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

        super.setLayout(new GridBagLayout());
        super.setMaximumSize(getDimensions());

        GridBagConstraints gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.fill = GridBagConstraints.HORIZONTAL;
        gridBagConstraints.gridy = 0;

        gridBagConstraints.gridx = 0;
        gridBagConstraints.weightx = 0.8;
        super.add(mediaLable, gridBagConstraints);

        gridBagConstraints.gridx = 1;
        gridBagConstraints.weightx = 0.2;
        super.add(new RemoveButton(), gridBagConstraints);
    }

    public static Dimension getDimensions() {
        return new Dimension(MainFrame.WIDTH, MainFrame.HEIGHT / 20);
    }
}
