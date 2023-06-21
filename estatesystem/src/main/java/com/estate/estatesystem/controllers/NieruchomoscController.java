package com.estate.estatesystem.controllers;

import com.estate.estatesystem.models.utility.SellInfo;
import com.estate.estatesystem.models.utility.NieruchomoscGuiData;
import com.estate.estatesystem.services.NieruchomoscService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("api")
public class NieruchomoscController {

    @Autowired
    private final NieruchomoscService nieruchomoscService;

    public NieruchomoscController(NieruchomoscService nieruchomoscService) {
        this.nieruchomoscService = nieruchomoscService;
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
        model.addAttribute("sellInfo", sellInfo);
        return "sell_estate";
    }
}
