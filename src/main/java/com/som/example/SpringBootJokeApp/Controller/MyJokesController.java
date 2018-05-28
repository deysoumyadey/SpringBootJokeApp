package com.som.example.SpringBootJokeApp.Controller;

import com.som.example.SpringBootJokeApp.Service.ChuckNorrisRandomQuotes;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MyJokesController {

    private ChuckNorrisRandomQuotes chuckNorrisRandomQuotes;

    public MyJokesController(ChuckNorrisRandomQuotes chuckNorrisRandomQuotes) {
        this.chuckNorrisRandomQuotes = chuckNorrisRandomQuotes;
    }

    @RequestMapping("/jokes")
    public String getJokes(Model model){
        model.addAttribute("jokes", chuckNorrisRandomQuotes.getRandomQuote());
        return "jokes";
    }
}
