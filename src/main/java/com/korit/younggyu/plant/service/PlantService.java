package com.korit.younggyu.plant.service;

import com.korit.younggyu.plant.entity.BusinessEntity;
import com.korit.younggyu.plant.entity.StateEntity;
import com.korit.younggyu.plant.entity.TotalCpgEntity;
import com.korit.younggyu.plant.entity.TotalPlantEntity;
import com.korit.younggyu.plant.repository.PlantRepository;
import com.korit.younggyu.plant.web.dto.PlantAllDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PlantService {

    @Autowired
    private PlantRepository plantRepository;

    public PlantAllDto getBusiness() {
        List<BusinessEntity> businessEntities = plantRepository.getBusiness();
        List<StateEntity> stateEntities = plantRepository.getState();
        TotalCpgEntity getTotalCpgEntity = plantRepository.getTotalCpgEntity();
        TotalPlantEntity getPlantEntity = plantRepository.getPlantEntity();

        System.out.println(businessEntities);
        System.out.println(stateEntities);
        System.out.println(getTotalCpgEntity);
        System.out.println(getPlantEntity);

        PlantAllDto plantAllDto = new PlantAllDto();
        plantAllDto.setBusinessEntities(businessEntities);
        plantAllDto.setStateEntities(stateEntities);
        plantAllDto.setGetTotalCpgEntity(getTotalCpgEntity);
        plantAllDto.setGetPlantEntity(getPlantEntity);

        return plantAllDto;
    }
}