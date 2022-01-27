package com.example.Gpro;

import com.example.Gpro.model.inquiry;
import com.example.Gpro.service.HomeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class HomeController {

    @Autowired
    private HomeService homeService;

    @GetMapping("/")
    public String index(Model model){
        model.addAttribute("inquiry", new inquiry());
        return "index";
    }

    @GetMapping("/about")
    public String about(Model model){

        homeService.getStaff();

        model.addAttribute("staff",homeService.getStaff());

        return "about";
    }

    @PostMapping("/about")
    public String searchStaff(Model model, @ModelAttribute inquiry inquiry){

        String name = inquiry.getSearchString();

        model.addAttribute("staff",homeService.searchStaff(name));

        return "about";
    }


}
