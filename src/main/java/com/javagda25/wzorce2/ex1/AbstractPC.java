package com.javagda25.wzorce2.ex1;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public abstract class AbstractPC {
    private String name;
    private double cpuPower;
    private double gpuPower;
    private boolean isOverclocked;
    private ComputerBrand computerBrand;

}
