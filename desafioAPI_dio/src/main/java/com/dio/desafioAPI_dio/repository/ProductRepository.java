package com.dio.desafioAPI_dio.repository;

import com.dio.desafioAPI_dio.Model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
