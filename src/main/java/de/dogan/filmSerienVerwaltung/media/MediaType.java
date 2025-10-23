package de.dogan.filmSerienVerwaltung.media;

public enum MediaType {
    FILM("Film"),
    SERIE("Serie")
    ;

    private final String title;

    public String getTitle() {
        return title;
    }

    MediaType(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return this.getTitle();
    }
}
