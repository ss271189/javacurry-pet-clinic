package jc.springframework.controller;

import jc.springframework.service.OwnerService;
import org.dom4j.rule.Mode;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class OwnerController {

    private final OwnerService ownerService;

    public OwnerController(OwnerService ownerService) {
        this.ownerService = ownerService;
    }

    @RequestMapping({"/owners","/owners/index.html","/owners/index"})
    public String listAllOwners(Model model){
        model.addAttribute("owners",ownerService.findAll());
        return "owners/index";
 }
}
