package com.demo.Dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.demo.Beans.Product;

@Repository
public interface ProductDao extends JpaRepository<Product, Integer>{

}
