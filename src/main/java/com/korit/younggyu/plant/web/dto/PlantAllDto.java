package com.korit.younggyu.plant.web.dto;

import lombok.Data;

@Data

public class PlantAllDto {
    private int totalPlant;    // 발전소 전체개수
    private int totalCapacity; // 설치용량
    private int totalTpg;       // 금일발전량
    private int totalMpg;       // 금월발전량
    private int totalCpg;       // 누적발전량
    private String business;    // 사업(RPS, 융복합 등)
    private int businessCount;  // 사업별 개수
    private String state;       // 상태 (정상,경고 등)
    private int statsCount;     // 상태별 개수

}
