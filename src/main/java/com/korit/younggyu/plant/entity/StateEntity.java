package com.korit.younggyu.plant.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Data
public class StateEntity {
    private String state;      // 상태 (정상,경고 등)
    private int stateCount;    // 상태별 개수
}
