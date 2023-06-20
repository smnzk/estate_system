package com.estate.estatesystem.controllers;

import com.estate.estatesystem.services.WlascicielService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("api")
public class WlascicielController {

    @Autowired
    private final WlascicielService wlascicielService;

    public WlascicielController(WlascicielService wlascicielService) {
        this.wlascicielService = wlascicielService;
    }

    @GetMapping("owners")
    String getOwners(Model model) {
        var owners = wlascicielService.getOwners();
        model.addAttribute("owners", owners);
        return "owners";
    }
}
