package de.dogan.filmSerienVerwaltung.controller;

import de.dogan.filmSerienVerwaltung.media.MedienSammlung;
import de.dogan.filmSerienVerwaltung.media.Movie;
import de.dogan.filmSerienVerwaltung.media.Serie;
import de.dogan.filmSerienVerwaltung.views.MainFrame;

import java.util.List;

public class MainController {

    public MainController() {
        MedienSammlung sammlung = new MedienSammlung(List.of(
                new Movie("Batman"),
                new Serie("Niklas "),
                new Serie("Niklas "),
                new Serie("Niklas "),
                new Serie("Niklas "),
                new Serie("Niklas "),
                new Serie("Niklas "),
                new Serie("Niklas "),
                new Serie("Niklas "),
                new Serie("Niklas "),
                new Serie("Niklas "),
                new Serie("Niklas "),
                new Serie("Niklas "),
                new Serie("Niklas "),
                new Serie("Niklas "),
                new Serie("Niklas "),
                new Serie("Niklas "),
                new Serie("Niklas "),
                new Serie("Niklas "),
                new Serie("Niklas "),
                new Serie("Niklas "),
                new Serie("Niklas "),
                new Serie("Niklas "),
                new Serie("Niklas "),
                new Serie("Niklas "),
                new Serie("Niklas "),
                new Serie("Niklas "),
                new Serie("Niklas "),
                new Serie("Niklas "),
                new Serie("Niklas "),
                new Serie("Niklas "),
                new Serie("Niklas "),
                new Serie("Niklas ")
        ));

        new MainFrame(sammlung);
    }
}
