package com.controller;


import com.Models.Location;
import com.Service.ModelsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
public class LocationController
{

    @Autowired
    public ModelsService modelsService;


    @GetMapping("/")
    public List<Location> findAll(){
    	return modelsService.readLocation();
    }
    
    @PostMapping("/")
    public void saveLocation(@RequestBody Location locationModels) {
    	  modelsService.newLocation(locationModels);
    }

}
