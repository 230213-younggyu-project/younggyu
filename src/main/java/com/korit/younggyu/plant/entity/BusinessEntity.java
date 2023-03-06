package com.korit.younggyu.plant.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Data
public class BusinessEntity {
    private String business;
    private int businessCount;
}
