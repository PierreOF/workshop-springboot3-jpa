package com.pierremonteiro.SpringAndJpa.repositories;

import com.pierremonteiro.SpringAndJpa.entities.Order;
import com.pierremonteiro.SpringAndJpa.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;


public interface OrderRepository extends JpaRepository<Order,Long> {


}
