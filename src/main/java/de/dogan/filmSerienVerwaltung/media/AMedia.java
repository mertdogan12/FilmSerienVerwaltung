package de.dogan.filmSerienVerwaltung.media;

public abstract class AMedia {

    private final String name;

    public String getName() {
        return name;
    }

    public abstract MediaType getType();

    public AMedia(String name) {
        this.name = name;
    }
}
