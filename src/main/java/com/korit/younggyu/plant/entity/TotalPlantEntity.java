package com.korit.younggyu.plant.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Data
public class TotalPlantEntity {

    private int totalPlant;    // 발전소 전체개수
    private int totalCapacity; // 용량
}
