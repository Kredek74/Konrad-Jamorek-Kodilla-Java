package com.kodilla.good.patterns.challenges;

import java.util.stream.Collectors;

public class MovieStoreStream {

    public static void main(String[] args) {

        MovieStore movieStore = new MovieStore();
        String signChain = movieStore.getMovies().entrySet().stream()
                .flatMap(n -> n.getValue().stream())
                .collect(Collectors.joining("!"));
        System.out.println(signChain);
    }
}