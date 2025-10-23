package de.dogan.filmSerienVerwaltung.controller;

import de.dogan.filmSerienVerwaltung.media.MedienSammlung;
import de.dogan.filmSerienVerwaltung.util.SammlungUtil;
import de.dogan.filmSerienVerwaltung.views.SammlungPanel;

public class SammlungController {

    private final MedienSammlung medienSammlung;

    public final SammlungPanel sammlungPanel;

    public MedienSammlung getMedienSammlung() {
        return medienSammlung;
    }

    public SammlungPanel getSammlungPanel() {
        return sammlungPanel;
    }

    public SammlungController(MedienSammlung medienSammlung) {
        this.medienSammlung = medienSammlung;
        this.sammlungPanel = new SammlungPanel(this.getMedienSammlung());

        SammlungUtil.addButtons(this.getMedienSammlung(), this.getSammlungPanel());
    }
}
