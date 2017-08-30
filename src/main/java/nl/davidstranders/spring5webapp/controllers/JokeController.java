package nl.davidstranders.spring5webapp.controllers;

import nl.davidstranders.spring5webapp.services.JokeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Dell on 30-8-2017.
 */
@Controller
public class JokeController {

    private JokeService jokeService;

    public JokeController(JokeService jokeService) {
        this.jokeService = jokeService;
    }

    @RequestMapping({"/",""})
    public String getJoke(Model model){

        model.addAttribute("joke", jokeService.getJoke());

        return "chucknorris";
    }

}
