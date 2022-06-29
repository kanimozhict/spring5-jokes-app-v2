package controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import services.Jokeservices;

public class JokeControllers {
    private final Jokeservices jokeservices;

    public JokeControllers(Jokeservices jokeservices) {
        this.jokeservices = jokeservices;
    }
    @RequestMapping({"/ "," "})
    public String showJoke(Model model){
    model.addAttribute("joke",jokeservices.getJoke());
    return "index";

    }
}
