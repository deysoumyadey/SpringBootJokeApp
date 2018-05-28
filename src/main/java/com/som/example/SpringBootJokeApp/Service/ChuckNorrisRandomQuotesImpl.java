package com.som.example.SpringBootJokeApp.Service;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import org.springframework.stereotype.Service;

@Service
public class ChuckNorrisRandomQuotesImpl implements ChuckNorrisRandomQuotes {

    private final ChuckNorrisQuotes chuckNorrisQuotes;

    public ChuckNorrisRandomQuotesImpl() {
        this.chuckNorrisQuotes =  new ChuckNorrisQuotes();
    }

    @Override
    public String getJoke() {
        return chuckNorrisQuotes.getRandomQuote();
    }

}
