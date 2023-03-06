package com.korit.younggyu.plant.repository;

import com.korit.younggyu.plant.entity.BusinessEntity;
import com.korit.younggyu.plant.entity.StateEntity;
import com.korit.younggyu.plant.entity.TotalCpgEntity;
import com.korit.younggyu.plant.entity.TotalPlantEntity;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface PlantRespository {
    public List<BusinessEntity> getBusiness();

    public List<StateEntity> getState();

    public TotalCpgEntity getTotalCpgEntity();

    public TotalPlantEntity getPlantEntity();


}
