package com.kodilla.stream.beautifier;

public interface PoemDecorator {
    public void beautify(String beautifyText, PoemDecorator poemDecorator) {
        String result = poemDecorator.decorate(beautifyText);
        System.out.println(result);
    }
}
