package app.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import static org.springframework.web.bind.annotation.RequestMethod.*;


@Controller
public class HelloController {

  @RequestMapping(method = GET, value = "/")
  public String show(Model model) {
    model.addAttribute("message", "My message super text!!!");
    return "index";
  }
}
