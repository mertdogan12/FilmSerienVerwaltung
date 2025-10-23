package de.dogan.filmSerienVerwaltung.listener;

import de.dogan.filmSerienVerwaltung.media.AMedia;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class RemoveMediaListener implements ActionListener {

    private final AMedia media;

    public RemoveMediaListener(AMedia media) {
        this.media = media;
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
