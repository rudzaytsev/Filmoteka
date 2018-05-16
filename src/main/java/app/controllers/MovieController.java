package app.controllers;

import app.services.MovieService;
import app.services.SearchParams;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import static org.springframework.web.bind.annotation.RequestMethod.GET;
import static org.springframework.web.bind.annotation.RequestMethod.POST;


@Controller
public class MovieController {

  @Autowired
  MovieService movieService;

  @RequestMapping(method = GET, value = "/")
  public String show(Model model) {
    model.addAttribute("message", "My message super text!!!");
    return "index";
  }

  @RequestMapping(method = POST, value = "/movies")
  public String showMovies(SearchParams params,Model model) {
    model.addAttribute("movies", movieService.findMoviesBy(params));
    return "index";
  }
}
