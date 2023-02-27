package com.shopowner.dto;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name="cart_detail")
@Setter
@Getter
public class CartDetailResponseDTO{

    @Id
    @GeneratedValue
    private Integer id;
    @ManyToOne
    @JoinColumn(name = "item_id")
    private ItemResponseDTO itemResponseDTO;

    @ManyToOne
    @JoinColumn(name = "cart_id")
    private CartResponseDTO cartResponseDTO;

}
