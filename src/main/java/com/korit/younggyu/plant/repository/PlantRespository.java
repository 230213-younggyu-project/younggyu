package com.korit.younggyu.plant.repository;

import com.korit.younggyu.plant.web.dto.PlantAllDto;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface PlantRespository {
    public List<PlantAllDto> getAllPlant(PlantAllDto plantAllDto);
}
