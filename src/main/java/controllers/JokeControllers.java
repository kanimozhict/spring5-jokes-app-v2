package controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import services.Jokeservices;

@Controller
public class JokeControllers {
    private final Jokeservices jokeservices;
    @Autowired

    public JokeControllers(Jokeservices jokeservices) {
        this.jokeservices = jokeservices;
    }
    @RequestMapping({"/ ",""})

        public String showJoke(Model model) {

        model.addAttribute("joke", jokeservices.getJoke());

        return "index";
    }
}
