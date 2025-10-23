package de.dogan.filmSerienVerwaltung.media;

public class Serie extends AMedia {

    public Serie(String name) {
        super(name);
    }

    @Override
    public MediaType getType() {
        return MediaType.SERIE;
    }
}
