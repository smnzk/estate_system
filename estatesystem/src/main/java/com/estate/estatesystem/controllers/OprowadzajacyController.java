package com.estate.estatesystem.controllers;

import com.estate.estatesystem.models.other.Ogloszenie;
import com.estate.estatesystem.models.other.WpisNaStronie;
import com.estate.estatesystem.models.utility.OprowadzajacyGuiData;
import com.estate.estatesystem.models.utility.SellInfo;
import com.estate.estatesystem.models.utility.Status;
import com.estate.estatesystem.services.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;

@Controller
@RequestMapping(path = "api")
public class OprowadzajacyController {

    @Autowired
    private final OgloszenieService ogloszenieService;

    @Autowired
    private final NieruchomoscService nieruchomoscService;

    @Autowired
    private final OprowadzajacyService oprowadzajacyService;

    @Autowired
    private final StronaService stronaService;

    @Autowired
    private final WpisService wpisService;

    public OprowadzajacyController(OgloszenieService ogloszenieService, NieruchomoscService nieruchomoscService, OprowadzajacyService oprowadzajacyService, StronaService stronaService, WpisService wpisService) {
        this.ogloszenieService = ogloszenieService;
        this.nieruchomoscService = nieruchomoscService;
        this.oprowadzajacyService = oprowadzajacyService;
        this.stronaService = stronaService;
        this.wpisService = wpisService;
    }

    @PostMapping("agents/selectAgent")
    public String selectAgent(Model model, @ModelAttribute("sellInfo") SellInfo sellInfo){
        var agents = oprowadzajacyService.getAllOprowadzajacy();
        var agentsGui = agents.stream().map(a -> new OprowadzajacyGuiData("add/" + a.getId(), a)).toList();
        model.addAttribute("agentsGui", agentsGui);
        model.addAttribute("sellInfo", sellInfo);
        return "select_agent";
    }

    @PostMapping("agents/add/{agentId}")
    public String createNotice(Model model, @ModelAttribute("sellInfo") SellInfo sellInfo, @PathVariable Long agentId){

        var estateOpt = nieruchomoscService.getEstateById(sellInfo.getNieruchomoscId());
        var estate = estateOpt.get();

        var oprowadzajacyOpt = oprowadzajacyService.getOprowadzajacyById(agentId);
        var oprowadzajacy = oprowadzajacyOpt.get();

        if (oprowadzajacy.isZbytZajety()) {
            return "agent_cannot";
        }

        Ogloszenie ogloszenie = new Ogloszenie(LocalDate.now(), LocalDate.now().plusMonths(4), Status.W_TRAKCIE_REALIZACJI);
        ogloszenie.setOprowadzajacy(oprowadzajacy);
        ogloszenie.setNieruchomosc(estate);
        ogloszenie.setOpis(sellInfo.getData());

        var website = stronaService.getWebsiteByAddress(sellInfo.getWebsite());

        var wpis = WpisNaStronie.create(ogloszenie, sellInfo.getWebsite(), website.get(0).getOplata());

        wpisService.saveWpis(wpis);
        ogloszenieService.addOgloszenie(ogloszenie);

        return "confirmation";
    }

    @GetMapping("agents/out")
    String out() {
        return "out";
    }
}
