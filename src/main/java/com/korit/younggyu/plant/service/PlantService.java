package com.korit.younggyu.plant.service;

import com.korit.younggyu.plant.repository.PlantRespository;
import com.korit.younggyu.plant.web.dto.PlantAllDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PlantService {

    @Autowired
    private PlantRespository plantRepository;

    public List<?> getAllPlant(PlantAllDto plantAllDto){

        return plantRepository.getAllPlant(plantAllDto);
    }
}
