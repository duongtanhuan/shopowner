package com.shopowner.dto;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;
@Entity
@Table(name="order_detail")
@Setter
@Getter
public class OrderDetailResponseDTO{

    @Id
    @GeneratedValue
    private Integer id;
    @ManyToOne
    @JoinColumn(name="order_id")
    private OrderResponseDTO orderResponseDTO;
    @ManyToOne
    @JoinColumn(name="item_id")
    private ItemResponseDTO itemResponseDTO;

    private int quantity;

}
