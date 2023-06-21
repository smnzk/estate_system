package com.estate.estatesystem.controllers;

import com.estate.estatesystem.models.other.Ogloszenie;
import com.estate.estatesystem.models.utility.OprowadzajacyGuiData;
import com.estate.estatesystem.models.utility.SellInfo;
import com.estate.estatesystem.models.utility.Status;
import com.estate.estatesystem.services.NieruchomoscService;
import com.estate.estatesystem.services.OgloszenieService;
import com.estate.estatesystem.services.OprowadzajacyService;
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

    public OprowadzajacyController(OgloszenieService ogloszenieService, NieruchomoscService nieruchomoscService, OprowadzajacyService oprowadzajacyService) {
        this.ogloszenieService = ogloszenieService;
        this.nieruchomoscService = nieruchomoscService;
        this.oprowadzajacyService = oprowadzajacyService;
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
        System.out.println(sellInfo.getNieruchomoscId());
        System.out.println(sellInfo.getData());

        var estateOpt = nieruchomoscService.getEstateById(sellInfo.getNieruchomoscId());
        var estate = estateOpt.get();

        var oprowadzajacyOpt = oprowadzajacyService.getOprowadzajacyById(agentId);
        var oprowadzajacy = oprowadzajacyOpt.get();

        Ogloszenie ogloszenie = new Ogloszenie(LocalDate.now(), LocalDate.now().plusMonths(4), Status.W_TRAKCIE_REALIZACJI);
        ogloszenie.setOprowadzajacy(oprowadzajacy);
        ogloszenie.setNieruchomosc(estate);
        ogloszenie.setOpis(sellInfo.getData());

        ogloszenieService.addOgloszenie(ogloszenie);

        return "confirmation";
    }
}
