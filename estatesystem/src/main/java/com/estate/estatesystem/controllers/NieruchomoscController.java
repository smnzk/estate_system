package com.estate.estatesystem.controllers;

import com.estate.estatesystem.services.NieruchomoscService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("api")
public class NieruchomoscController {

    @Autowired
    private final NieruchomoscService nieruchomoscService;

    public NieruchomoscController(NieruchomoscService nieruchomoscService) {
        this.nieruchomoscService = nieruchomoscService;
    }


    @GetMapping(path = "estates")
    String getEstates(Model model) {
        model.addAttribute("something", "THIS IS THE VALUE");
        var estates = nieruchomoscService.getEstates();
        model.addAttribute("something2", estates);
        return "estates";
    }

    @GetMapping("/{nazwisko}")
    String getYe(Model model, @PathVariable String nazwisko) {
        return "index";
    }
}
