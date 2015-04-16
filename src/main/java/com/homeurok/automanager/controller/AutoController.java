package com.homeurok.automanager.controller;

import com.homeurok.automanager.domain.Auto;
import com.homeurok.automanager.repository.AutoRepository;
import com.homeurok.automanager.validation.AutoValidator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

/**
 * Created by Aleh on 14.04.2015.
 */
@Controller
public class AutoController {

    private AutoRepository autoRepository;
    private AutoValidator autoValidator;

    @Autowired
    public AutoController(AutoRepository autoRepository,AutoValidator autoValidator){
        this.autoRepository=autoRepository;
        this.autoValidator=autoValidator;
    }

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String getAuto(Model model){

        List<Auto> autos = this.autoRepository.listAll();
        model.addAttribute("autos",autos);
        return "index";
    }
    @RequestMapping(value="addAuto", method = RequestMethod.GET)
    public String addAuto(Model model){
        model.addAttribute("auto",new Auto());
        return "addAuto";
    }

    @RequestMapping(value = "addAuto", method = RequestMethod.POST)
    public String addAuto(@ModelAttribute("auto") Auto auto,BindingResult bindingResult){

        this.autoValidator.validate(auto, bindingResult);

        if (bindingResult.hasErrors()){
            return "addAuto";
        }
        this.autoRepository.addAuto(auto);
        return "redirect:/";
    }

    @RequestMapping(value = "deleteAuto/{id}", method = RequestMethod.GET)
    public String deleteAuto(@PathVariable Integer id){

        this.autoRepository.removeAuto(id);
        return "redirect:/";
    }


    @RequestMapping(value="updateAuto/{id}", method = RequestMethod.GET)
    public String updateAuto(@PathVariable Integer id, Model model){
        Auto auto = this.autoRepository.getAutoById(id);
        model.addAttribute("auto", auto);
        return "updateAuto";
    }
    @RequestMapping(value="updateAuto/updateAuto/{id}", method = RequestMethod.POST)
    public String updateAuto(@ModelAttribute("auto") Auto auto,BindingResult bindingResult,@PathVariable Integer id){
        this.autoValidator.validate(auto, bindingResult);

        if (bindingResult.hasErrors()){
            return "updateAuto";
        }
        auto.setId(id);
        this.autoRepository.updateAuto(auto);
        return "redirect:/";
    }


}
