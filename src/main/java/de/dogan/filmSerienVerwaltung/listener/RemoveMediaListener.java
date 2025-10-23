package de.dogan.filmSerienVerwaltung.listener;

import de.dogan.filmSerienVerwaltung.media.AMedia;
import de.dogan.filmSerienVerwaltung.util.SammlungUtil;
import de.dogan.filmSerienVerwaltung.views.RemoveButton;
import de.dogan.filmSerienVerwaltung.views.SammlungPanel;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class RemoveMediaListener implements ActionListener {

    private final SammlungPanel sammlungPanel;
    private final AMedia media;

    public SammlungPanel getSammlungPanel() {
        return sammlungPanel;
    }

    public AMedia getMedia() {
        return media;
    }

    public RemoveMediaListener(SammlungPanel sammlungPanel, AMedia media) {
        this.sammlungPanel = sammlungPanel;
        this.media = media;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        this.getSammlungPanel().getSammlung().removeMedia(this.getMedia());
        SammlungUtil.addButtons(this.getSammlungPanel().getSammlung(), this.getSammlungPanel());
    }
}
