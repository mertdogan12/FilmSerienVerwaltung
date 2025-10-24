package de.dogan.filmSerienVerwaltung.media;

import java.io.Serializable;
import java.util.Objects;

public abstract class AMedia implements Serializable {

    private String name;
    private double bewertung;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getBewertung() {
        return bewertung;
    }

    public void setBewertung(double bewertung) {
        this.bewertung = bewertung;
    }

    public abstract MediaType getType();

    public AMedia(String name, double bewertung) {
        this.setName(name);
        this.setBewertung(bewertung);
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
