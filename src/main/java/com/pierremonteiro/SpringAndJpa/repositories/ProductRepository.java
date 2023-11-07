package com.pierremonteiro.SpringAndJpa.repositories;

import com.pierremonteiro.SpringAndJpa.entities.Category;
import com.pierremonteiro.SpringAndJpa.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;


public interface ProductRepository extends JpaRepository<Product,Long> {


}
