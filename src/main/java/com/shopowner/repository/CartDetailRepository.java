package com.shopowner.repository;

import com.shopowner.dto.CartDetailResponseDTO;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CartDetailRepository extends JpaRepository<CartDetailResponseDTO, Integer> {
}
