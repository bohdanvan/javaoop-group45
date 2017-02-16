package com.bvan.oop.lesson8.iteration;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @author bvanchuhov
 */
public class Films implements Iterable<Film> {

    private final List<Film> films = new ArrayList<>();

    public void add(Film film) {
        films.add(film);
    }

    @Override
    public Iterator<Film> iterator() {
        return films.iterator();
    }

    // other operations with films
}
