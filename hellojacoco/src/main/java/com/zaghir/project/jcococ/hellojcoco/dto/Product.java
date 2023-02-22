package com.zaghir.project.jcococ.hellojcoco.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Product {

    private int id ;
    private String name ;
    private String description;
    private int price;

}
