package org.launchcode.cheesemvc.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;




@Controller
@RequestMapping("cheese")
public class CheeseController {

    // Request path /cheese
    @RequestMapping(value = "")
    public String index(Model model) {

        ArrayList<String> cheeses = new ArrayList<>();
        cheeses.add("chedder");
        cheeses.add("parmesan");
        cheeses.add("munster");

        model.addAttribute("cheeses", cheeses);
        model.addAttribute("title", "My Cheese");

        return "cheese/index";
    }

}
