package net.trpcp.komunikator.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class IndexController {

    @GetMapping({"","/","index","index.html"})
    public ModelAndView getIndex(){
        ModelAndView mav = new ModelAndView("index");
        return mav;
    }
}
