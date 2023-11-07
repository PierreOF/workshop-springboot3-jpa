package com.pierremonteiro.SpringAndJpa.repositories;

import com.pierremonteiro.SpringAndJpa.entities.OrderItem;
import com.pierremonteiro.SpringAndJpa.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;


public interface OrderItemRepository extends JpaRepository<OrderItem,Long> {


}
