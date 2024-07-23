package org.productos.java.productos2826502.repositories;

import java.util.List;

import org.productos.java.productos2826502.entities.Product;
import org.springframework.stereotype.Repository;

@Repository
public class ProductRepository {

    List<Product> productos = List.of(
        Product.builder()
                .id(01L)
                .nombreProduct("Esfero")
                .precio(100.2)
                .build(), 
        new Product(04L, "borrador", 600.00)
    );
    // Metodo para consultar todos  
    //los productos de repositorio 
    public List<Product> findAll(){
        return this.productos;
    }
}
