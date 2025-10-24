package de.dogan.filmSerienVerwaltung.media;

public class Movie extends AMedia {

    public Movie(String name, double bewertung) {
        super(name, bewertung);
    }

    @Override
    public MediaType getType() {
        return MediaType.FILM;
    }
}
