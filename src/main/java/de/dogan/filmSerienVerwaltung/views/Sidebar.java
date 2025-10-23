package de.dogan.filmSerienVerwaltung.views;

import de.dogan.filmSerienVerwaltung.media.Movie;

import javax.swing.*;
import java.awt.*;

public class Sidebar extends JPanel {

    private final AddButton addButton;
    private final MediaInfo mediaInfo;

    public AddButton getAddButton() {
        return addButton;
    }

    public MediaInfo getMediaInfo() {
        return mediaInfo;
    }

    public Sidebar() {
        this.addButton = new AddButton();
        this.mediaInfo = new MediaInfo();

        super.setLayout(new BorderLayout());

        super.setPreferredSize(new Dimension((int) (MainFrame.WIDTH * 0.3), 0));
        super.add(this.getAddButton(), BorderLayout.PAGE_END);
        super.add(this.getMediaInfo(), BorderLayout.PAGE_START);
    }
}
