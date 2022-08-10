package com.kodilla.stream.beautifier;

public class PoemBeautifier {
    public String beautify(String textToDecorate, PoemDecorator decorator) {
        return decorator.decorate(textToDecorate);
    }
}
