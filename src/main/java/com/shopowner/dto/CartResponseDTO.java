package com.shopowner.dto;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Entity
@Table(name="cart")
@Setter
@Getter
public class CartResponseDTO{

    @Id
    @GeneratedValue
    private Integer id;
    @OneToOne
    @JoinColumn(name = "customer_id")
    private CustomerResponseDTO customerResponseDTO;

    @OneToMany(mappedBy = "cartResponseDTO")
    private List<CartDetailResponseDTO> cartDetailResponseDTOList;
}
