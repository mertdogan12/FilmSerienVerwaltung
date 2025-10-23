package de.dogan.filmSerienVerwaltung.listener;

import de.dogan.filmSerienVerwaltung.media.AMedia;
import de.dogan.filmSerienVerwaltung.media.MedienSammlung;
import de.dogan.filmSerienVerwaltung.util.SammlungUtil;
import de.dogan.filmSerienVerwaltung.views.RemoveButton;
import de.dogan.filmSerienVerwaltung.views.SammlungPanel;
import de.dogan.filmSerienVerwaltung.views.Sidebar;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class RemoveMediaListener implements ActionListener {

    private final SammlungPanel sammlungPanel;
    private final Sidebar sidebar;
    private final AMedia media;

    public SammlungPanel getSammlungPanel() {
        return sammlungPanel;
    }

    public AMedia getMedia() {
        return media;
    }

    public Sidebar getSidebar() {
        return sidebar;
    }

    public RemoveMediaListener(SammlungPanel sammlungPanel, Sidebar sidebar, AMedia media) {
        this.sammlungPanel = sammlungPanel;
        this.sidebar = sidebar;
        this.media = media;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        MedienSammlung.getMedienSammlung().removeMedia(this.getMedia());
        SammlungUtil.addButtons(this.getSammlungPanel(), this.getSidebar());
    }
}
