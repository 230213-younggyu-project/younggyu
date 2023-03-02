package com.korit.younggyu.plant.web.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class CMRespDto<T> {
    private int status;
    private String message;
    private T data;
}
