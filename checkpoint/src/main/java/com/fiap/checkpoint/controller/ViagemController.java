package com.fiap.checkpoint.controller;


import com.fiap.checkpoint.DTO.TempoDTO;
import com.fiap.checkpoint.DTO.ViagemDTO;
import com.fiap.checkpoint.service.ViagemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;


@Controller
public class ViagemController {



    @GetMapping("/viagem/calcular")
    public ModelAndView calcular(){
        ModelAndView model = new ModelAndView("viagem/calcular");
        ViagemDTO viagemDTO = new ViagemDTO();
        model.addObject("viagem",viagemDTO);
        return model;
    }

    @PostMapping("/viagem/calcular")
    public ModelAndView calcular(@ModelAttribute("viagem") ViagemDTO viagemDTO){
        ModelAndView model = new ModelAndView("viagem/result");
        ViagemService viagemService = new ViagemService();
        TempoDTO response = viagemService.calculaTempoViagem(viagemDTO);
        model.addObject("tempo", response);
        return model;
    }
}
