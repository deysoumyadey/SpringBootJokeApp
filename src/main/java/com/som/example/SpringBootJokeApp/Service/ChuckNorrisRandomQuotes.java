package com.som.example.SpringBootJokeApp.Service;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import org.springframework.stereotype.Service;

@Service
public class ChuckNorrisRandomQuotes extends ChuckNorrisQuotes {

    @Override
    public String getRandomQuote() {
        return super.getRandomQuote();
    }
}
