package com.ModelRepo;


import org.springframework.data.jpa.repository.JpaRepository;

import com.Models.Location;

public interface LocationRepo extends JpaRepository<Location, Integer>
{

}
