package com.example.controllers;

import com.example.models.PlantInventoryEntry;
import com.example.models.PlantInventoryEntryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

/**
 * Created by Amelie on 5/9/2017.
 */
@Controller
public class PlantInventoryEntryController {
    @Autowired
    PlantInventoryEntryRepository repo;

    @GetMapping("/plants")
    public String list(Model model){
        model.addAttribute("plants", repo.findAll());
        return "plants/list";
    }

    @GetMapping(value="/plants/form")
    public String form(Model model){
        model.addAttribute("plant", new PlantInventoryEntry());
        return "plants/create";
    }

    @PostMapping(value="/plants")
    public String create(PlantInventoryEntry plant){
        repo.save(plant);
        return "redirect:/plants";
    }
}
