package de.dogan.filmSerienVerwaltung.media;

public class Serie extends AMedia {

    public Serie(String name, double bewertung) {
        super(name, bewertung);
    }

    @Override
    public MediaType getType() {
        return MediaType.SERIE;
    }
}
