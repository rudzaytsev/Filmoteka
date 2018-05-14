package app.controllers;

import app.services.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import static org.springframework.web.bind.annotation.RequestMethod.*;


@Controller
public class MovieController {

  @Autowired
  MovieService movieService;

  @RequestMapping(method = GET, value = "/")
  public String show(Model model) {
    model.addAttribute("message", "My message super text!!!");
    return "index";
  }
}
