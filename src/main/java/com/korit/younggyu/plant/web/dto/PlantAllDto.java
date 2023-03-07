package com.korit.younggyu.plant.web.dto;

import com.korit.younggyu.plant.entity.BusinessEntity;
import com.korit.younggyu.plant.entity.StateEntity;
import com.korit.younggyu.plant.entity.TotalCpgEntity;
import com.korit.younggyu.plant.entity.TotalPlantEntity;
import lombok.Data;

import java.util.List;

@Data

public class PlantAllDto {
    private List<BusinessEntity> businessEntities;
    private List<StateEntity> stateEntities;
    private TotalCpgEntity getTotalCpgEntity;
    private TotalPlantEntity getPlantEntity;

}
