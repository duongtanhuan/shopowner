package com.shopowner.dto;


import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class GenerateIdDTO {
    @Id
    @GeneratedValue
    private Integer id;
}
