package de.dogan.filmSerienVerwaltung.listener;

import de.dogan.filmSerienVerwaltung.views.MediaPanel;
import de.dogan.filmSerienVerwaltung.views.Sidebar;

import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class SidebarMouseListener implements MouseListener {

    private final MediaPanel mediaPanel;
    private final Sidebar sidebar;

    public MediaPanel getMediaPanel() {
        return mediaPanel;
    }

    public Sidebar getSidebar() {
        return sidebar;
    }

    public SidebarMouseListener(MediaPanel mediaPanel, Sidebar sidebar) {
        this.mediaPanel = mediaPanel;
        this.sidebar = sidebar;
    }

    @Override
    public void mouseClicked(MouseEvent mouseEvent) {

    }

    @Override
    public void mousePressed(MouseEvent mouseEvent) {

    }

    @Override
    public void mouseReleased(MouseEvent mouseEvent) {

    }

    @Override
    public void mouseEntered(MouseEvent mouseEvent) {
        this.getMediaPanel().setBackground(Color.CYAN);
        this.getSidebar().getMediaInfo().update(this.getMediaPanel().getMedia());
    }

    @Override
    public void mouseExited(MouseEvent mouseEvent) {
        this.getMediaPanel().setBackground(new Color(238, 238, 238));
    }
}
