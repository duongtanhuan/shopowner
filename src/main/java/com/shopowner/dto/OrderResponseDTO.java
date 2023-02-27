package com.shopowner.dto;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;
import java.util.List;

@Entity
@Table(name="orders")
@Setter
@Getter
public class OrderResponseDTO{

    @Id
    @GeneratedValue
    private Integer id;

    @OneToMany(mappedBy = "orderResponseDTO")
    private List<OrderDetailResponseDTO> orderDetailResponseDTOList;

    @ManyToOne
    @JoinColumn(name = "customer_id")
    private CustomerResponseDTO customerResponseDTO;

    @Column(name = "create_date")
    private Date createDate;
}
