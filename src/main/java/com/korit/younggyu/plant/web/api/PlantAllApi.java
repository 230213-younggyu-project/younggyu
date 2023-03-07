package com.korit.younggyu.plant.web.api;

import com.korit.younggyu.plant.service.PlantService;
import com.korit.younggyu.plant.web.dto.CMRespDto;
import com.korit.younggyu.plant.web.dto.PlantAllDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/plant")
public class PlantAllApi {

    @Autowired
    private PlantService plantService;

    @GetMapping("/all")
    private ResponseEntity<CMRespDto<?>> getAllPlant(PlantAllDto plantAllDto) {
        return ResponseEntity.ok().body(new CMRespDto<>(HttpStatus.OK.value(), "plant all", plantService.getBusiness()));
    }


}
