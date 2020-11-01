package com.kodilla.stream.beautifier;

public class StreamMainBeautifer {

    public static void main(String[] args) {

        PoemBeautifier poemBeautifier = new PoemBeautifier();

        System.out.println("\nPoem Beautifier Examples");
        poemBeautifier.beautify("Java Rules", text -> "ABC" + text + "ABC");
        poemBeautifier.beautify("Java Rules", text -> text.toUpperCase());
        poemBeautifier.beautify("Java Rules", text -> text.toLowerCase());
        poemBeautifier.beautify("Java Rules", text -> text.replaceAll("a", "@"));
        poemBeautifier.beautify("Java Rules", text -> text.replace("", " ").trim());
        poemBeautifier.beautify("Java Rules", text -> new StringBuilder(text).reverse().toString());
    }
}
