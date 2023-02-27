package com.shopowner.dto;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Entity
@Table(name="customer")
@Setter
@Getter
public class CustomerResponseDTO{

    @Id
    @GeneratedValue
    private Integer id;

    @OneToOne(mappedBy = "customerResponseDTO")
    private CartResponseDTO cartResponseDTO;

    @OneToMany(mappedBy = "customerResponseDTO")
    private List<OrderResponseDTO> orderResponseDTOList;
}
