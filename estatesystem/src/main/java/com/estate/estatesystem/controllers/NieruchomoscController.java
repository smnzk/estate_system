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


    @GetMapping("{ownerId}")
    String getEstates(Model model, @PathVariable long ownerId) {
        System.out.println("HERE");
        var estates = nieruchomoscService.getEstatesByOwnerId(ownerId);
        model.addAttribute("something2", estates);
        return "estates";
    }
}
