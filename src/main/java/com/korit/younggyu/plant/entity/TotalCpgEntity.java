package com.korit.younggyu.plant.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Data
public class TotalCpgEntity {
    private int totalTpg;
    private int totalMpg;
    private long totalCpg;
}
