package com.Service;

import com.ModelRepo.LocationRepo;
import com.Models.Location;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ModelsService
{
    @Autowired
    public LocationRepo locationRepo;

    public Location newLocation(Location locationModels)
    {
        return locationRepo.save(locationModels);

    }


    public List<Location> readLocation(){
        return locationRepo.findAll();
    }

}
