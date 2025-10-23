package de.dogan.filmSerienVerwaltung.controller;

import de.dogan.filmSerienVerwaltung.media.MedienSammlung;
import de.dogan.filmSerienVerwaltung.media.Movie;
import de.dogan.filmSerienVerwaltung.views.MainFrame;

import java.util.List;

public class MainController {

    public MainController() {
        MedienSammlung sammlung = new MedienSammlung(List.of(
                new Movie("Batman"),
                new Movie("Batman"),
                new Movie("Pluribus - Glück ist ansteckend")
        ));

        new MainFrame(sammlung);
    }
}
