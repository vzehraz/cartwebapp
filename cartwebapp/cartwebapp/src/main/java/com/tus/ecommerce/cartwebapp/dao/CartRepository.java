package com.tus.ecommerce.cartwebapp.dao;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tus.ecommerce.cartwebapp.entity.Cart;

@Repository
public interface CartRepository extends JpaRepository<Cart, Integer>{

	}

