package de.dogan.filmSerienVerwaltung.views;

import de.dogan.filmSerienVerwaltung.media.MedienSammlung;

import javax.swing.*;
import java.awt.*;

public class SammlungPanel extends JPanel {

    private final MedienSammlung sammlung;

    public MedienSammlung getSammlung() {
        return sammlung;
    }

    public SammlungPanel(MedienSammlung sammlung) {
        this.sammlung = sammlung;

        super.setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
        super.setPreferredSize(new Dimension((int) (MainFrame.WIDTH * 0.7), 0));
    }

    public void load() {
        super.removeAll();
        sammlung.toList().forEach(media -> {
            MediaPanel mediaPanel = new MediaPanel(media);
            super.add(mediaPanel);
        });
    }
}
