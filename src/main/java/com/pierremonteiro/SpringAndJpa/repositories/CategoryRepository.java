package com.pierremonteiro.SpringAndJpa.repositories;

import com.pierremonteiro.SpringAndJpa.entities.Category;
import com.pierremonteiro.SpringAndJpa.entities.Order;
import org.springframework.data.jpa.repository.JpaRepository;


public interface CategoryRepository extends JpaRepository<Category,Long> {


}
