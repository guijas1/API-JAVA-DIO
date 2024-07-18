package com.dio.desafioAPI_dio.Controller;

import com.dio.desafioAPI_dio.Model.Product;
import com.dio.desafioAPI_dio.Service.ProductService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

public class ProductController {

    @Autowired
    private ProductService produtoService;

    @Operation(summary = "Obter todos os produtos", description = "Retorna uma lista de produtos.")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Lista de produtos retornada com sucesso")
    })
    @GetMapping
    public List<Product> getAll() {
        return produtoService.findAll();
    }

    @Operation(summary = "Obter um produto por ID", description = "Retorna um produto baseado no ID fornecido.")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Produto retornado com sucesso"),
            @ApiResponse(responseCode = "404", description = "Produto não encontrado")
    })
    @GetMapping("/{id}")
    public Product getById(@PathVariable Long id) {
        return produtoService.findById(id);
    }

    @Operation(summary = "Criar um novo produto", description = "Cria um novo produto.")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "201", description = "Produto criado com sucesso")
    })
    @PostMapping
    public Product create(@RequestBody Product produto) {
        return produtoService.save(produto);
    }

    @Operation(summary = "Deletar um produto por ID", description = "Deleta um produto baseado no ID fornecido.")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "204", description = "Produto deletado com sucesso")
    })
    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable Long id) {
        produtoService.deleteById(id);
    }

}
