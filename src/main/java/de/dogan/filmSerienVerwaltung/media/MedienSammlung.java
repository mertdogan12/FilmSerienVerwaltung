package de.dogan.filmSerienVerwaltung.media;

import java.util.ArrayList;
import java.util.List;

public final class MedienSammlung {

    private final List<AMedia> sammlung;

    public List<AMedia> getSammlung() {
        return new ArrayList<>(sammlung);
    }

    public MedienSammlung(List<AMedia> medien) {
        this.sammlung = medien;
    }

    public boolean addMedia(AMedia media) {
        return sammlung.add(media);
    }

    public boolean removeMedia(AMedia media) {
        return sammlung.remove(media);
    }
}
