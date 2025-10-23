package de.dogan.filmSerienVerwaltung.media;

import de.dogan.filmSerienVerwaltung.views.Sidebar;

import java.util.ArrayList;
import java.util.List;

public final class MedienSammlung {

    private static MedienSammlung medienSammlung;

    public static MedienSammlung getMedienSammlung() {
        if (medienSammlung == null) {
            medienSammlung = new MedienSammlung(new ArrayList<>(List.of(new Movie("Test"), new Serie("Test"))));
        }

        return medienSammlung;
    }

    private final List<AMedia> sammlung;

    public MedienSammlung(List<AMedia> medien) {
        this.sammlung = medien;
    }

    public boolean addMedia(AMedia media) {
        return sammlung.add(media);
    }

    public boolean removeMedia(AMedia media) {
        return sammlung.remove(media);
    }

    public List<AMedia> toList() {
        return new ArrayList<>(sammlung);
    }

    public AMedia[] toArray() {
        return sammlung.toArray(AMedia[]::new);
    }
}
