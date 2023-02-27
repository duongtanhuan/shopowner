package com.shopowner.dto;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Entity
@Table(name="item")
@Setter
@Getter
public class ItemResponseDTO{

    @Id
    @GeneratedValue
    private Integer id;

    @OneToMany(mappedBy = "itemResponseDTO")
    private List<OrderDetailResponseDTO> orderDetailResponseDTOList;

    @OneToMany(mappedBy = "itemResponseDTO")
    private List<CartDetailResponseDTO> cartDetailResponseDTOList;

    private String name;

    private double price;

}
