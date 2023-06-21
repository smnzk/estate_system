package com.estate.estatesystem.controllers;

import com.estate.estatesystem.models.utility.SellInfo;
import com.estate.estatesystem.models.utility.NieruchomoscGuiData;
import com.estate.estatesystem.services.NieruchomoscService;
import com.estate.estatesystem.services.StronaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;

@Controller
@RequestMapping("api")
public class NieruchomoscController {

    @Autowired
    private final NieruchomoscService nieruchomoscService;

    @Autowired
    private final StronaService stronaService;

    public NieruchomoscController(NieruchomoscService nieruchomoscService, StronaService stronaService) {
        this.nieruchomoscService = nieruchomoscService;
        this.stronaService = stronaService;
    }


    @GetMapping("estates/{ownerId}")
    String getEstates(Model model, @PathVariable long ownerId) {
        var estates = nieruchomoscService.getEstatesByOwnerId(ownerId);
        var estatesGui = estates.stream()
                .map(e -> new NieruchomoscGuiData(e, "sell/" + e.getId())).toList();
        model.addAttribute("something2", estatesGui);
        return "estates";
    }

    @GetMapping("estates/sell/{estateId}")
    String sellEstate(Model model, @PathVariable long estateId) {
        SellInfo sellInfo = new SellInfo();
        sellInfo.setNieruchomoscId(estateId);
        var listWebsites = stronaService.getAllWebsites();
        model.addAttribute("listWebsites", listWebsites);
        model.addAttribute("sellInfo", sellInfo);
        model.addAttribute("estateId", estateId);
        return "sell_estate";
    }

    @GetMapping("estates/out")
    String out() {
        return "out";
    }

    @GetMapping("estates/sell/out")
    String out2() {
        return "out";
    }
}
