package de.dogan.filmSerienVerwaltung.media;

import de.dogan.filmSerienVerwaltung.util.SaveUtil;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public final class MedienSammlung {

    private static MedienSammlung medienSammlung;
    private static final String FILE_PATH = "./media.data";

    public static MedienSammlung getMedienSammlung() {
        if (medienSammlung == null) {
            List<AMedia> list = new ArrayList<>();

            try {
                //noinspection unchecked
                list = (List<AMedia>) SaveUtil.readObject(FILE_PATH);
            } catch (IOException | ClassNotFoundException e) {
                System.out.println("Error while reading medien sammlung. Medien sammlung will be empty");
                e.printStackTrace();
            }

            medienSammlung = new MedienSammlung(list);
        }

        return medienSammlung;
    }

    private final List<AMedia> sammlung;

    public MedienSammlung(List<AMedia> medien) {
        this.sammlung = medien;
    }

    public void addMedia(AMedia media) {
        sammlung.add(media);
        this.save();
    }

    public void removeMedia(AMedia media) {
        sammlung.remove(media);
        this.save();
    }

    public List<AMedia> toList() {
        return new ArrayList<>(sammlung);
    }

    public AMedia[] toArray() {
        return sammlung.toArray(AMedia[]::new);
    }

    private void save() {
        try {
            SaveUtil.writeObject(this.toList(), FILE_PATH);
        } catch (IOException e) {
            System.out.println("Error while saving medien sammlung");
            e.printStackTrace();
        }
    }
}
