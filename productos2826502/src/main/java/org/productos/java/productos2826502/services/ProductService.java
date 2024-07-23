package org.productos.java.productos2826502.services;

import java.util.List;

import org.productos.java.productos2826502.entities.Product;
import org.productos.java.productos2826502.repositories.ProductRepository;
import org.springframework.stereotype.Service;

@Service
public class ProductService {

    //Inyectar la dependencia al repositorio 
    private ProductRepository repository = new ProductRepository();

    //Operaciones de logica de negocio 
    //Traemos los repositorios del repositorio 

    public List<Product> findAllProducts(){
        return repository.findAll();
    }

}
