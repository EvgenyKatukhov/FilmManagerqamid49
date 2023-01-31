package ru.netology.manager;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.domain.Poster;
import ru.netology.manager.FilmManager;

public class FilmManagerTest {
    Poster film1 = new Poster("Бладшот", 1, "боевик");
    Poster film2 = new Poster("Вперед", 2, "мультфильм");
    Poster film3 = new Poster("Отель Белград", 3, "комедия");
    Poster film4 = new Poster("Джентельмены", 4, "боевик");
    Poster film5 = new Poster("Человек-невидимка", 5, "ужасы");
    Poster film6 = new Poster("Тролли.Мировой тур", 6, "мультфильм");
    Poster film7 = new Poster("Номер один", 7, "комедия");
    Poster film8 = new Poster("Брат", 8, "драма");
    Poster film9 = new Poster("Один дома", 9, "комедия");
    Poster film10 = new Poster("Зеленая миля", 10, "драма");
    Poster film11 = new Poster("Сумерки", 11, "фантастика");

    @Test
    public void whenAddFilm() {
        FilmManager manager = new FilmManager();

        manager.addFilm("Film 1");
        manager.addFilm("Film 2");

        String[] expected = {"Film 1", "Film 2"};
        String[] actual = manager.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void FindLast() {
        FilmManager manager = new FilmManager();

        manager.addFilm("Film 1");
        manager.addFilm("Film 2");
        manager.addFilm("Film 3");
        manager.addFilm("Film 4");
        manager.addFilm("Film 5");
        manager.addFilm("Film 6");
        manager.addFilm("Film 7");
        manager.addFilm("Film 8");
        manager.addFilm("Film 9");
        manager.addFilm("Film 10");


        String[] expected = {"Film 10", "Film 9", "Film 8", "Film 7", "Film 6", "Film 5", "Film 4", "Film 3", "Film 2", "Film 1"
        };
        String[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void FindFourLast() {
        FilmManager manager = new FilmManager();

        manager.addFilm("Film 1");
        manager.addFilm("Film 2");
        manager.addFilm("Film 3");
        manager.addFilm("Film 4");


        String[] expected = {"Film 4", "Film 3", "Film 2", "Film 1"};
        String[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void FindLastMoreTen() {
        FilmManager manager = new FilmManager(11);

        manager.addFilm("Film 1");
        manager.addFilm("Film 2");
        manager.addFilm("Film 3");
        manager.addFilm("Film 4");
        manager.addFilm("Film 5");
        manager.addFilm("Film 6");
        manager.addFilm("Film 7");
        manager.addFilm("Film 8");
        manager.addFilm("Film 9");
        manager.addFilm("Film 10");
        manager.addFilm("Film 11");


        String[] expected = {"Film 11", "Film 10", "Film 9", "Film 8", "Film 7", "Film 6", "Film 5", "Film 4", "Film 3", "Film 2", "Film 1"
        };
        String[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }




}








