package de.dogan.filmSerienVerwaltung.media;

import java.io.Serializable;

public class Movie extends AMedia {

    public Movie(String name) {
        super(name);
    }

    @Override
    public MediaType getType() {
        return MediaType.FILM;
    }
}
