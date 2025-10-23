package de.dogan.filmSerienVerwaltung.media;

import java.util.Objects;

public abstract class AMedia {

    private final String name;

    public String getName() {
        return name;
    }

    public abstract MediaType getType();

    public AMedia(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return String.format("%s (%s)", this.getName(), this.getType().toString());
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof AMedia aMedia)) return false;
        return Objects.equals(name, aMedia.name);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(name);
    }
}
