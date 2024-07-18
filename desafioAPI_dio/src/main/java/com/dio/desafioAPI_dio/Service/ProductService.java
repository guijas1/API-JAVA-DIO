package com.dio.desafioAPI_dio.Service;

import com.dio.desafioAPI_dio.Model.Product;
import com.dio.desafioAPI_dio.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class ProductService {

    @Autowired
    private ProductRepository produtoRepository;

    public List<Product> findAll() {
        return produtoRepository.findAll();
    }

    public Product findById(Long id) {
        return produtoRepository.findById(id).orElse(null);
    }

    public Product save(Product produto) {
        return produtoRepository.save(produto);
    }

    public void deleteById(Long id) {
        produtoRepository.deleteById(id);
    }

}
