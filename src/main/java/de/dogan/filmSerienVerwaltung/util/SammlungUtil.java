package de.dogan.filmSerienVerwaltung.util;

import de.dogan.filmSerienVerwaltung.listener.RemoveMediaListener;
import de.dogan.filmSerienVerwaltung.media.MedienSammlung;
import de.dogan.filmSerienVerwaltung.views.MediaPanel;
import de.dogan.filmSerienVerwaltung.views.SammlungPanel;

public final class SammlungUtil {

    private SammlungUtil() {}

    public static void addButtons(MedienSammlung sammlung, SammlungPanel sammlungPanel) {
        sammlungPanel.removeAll();
        sammlung.toList().forEach(media -> {
            MediaPanel mediaPanel = new MediaPanel(media);
            mediaPanel.getMediaRemoveButton()
                    .addActionListener(new RemoveMediaListener(sammlungPanel, media));
            sammlungPanel.add(mediaPanel);
        });
        sammlungPanel.revalidate();
        sammlungPanel.repaint();
    }
}
