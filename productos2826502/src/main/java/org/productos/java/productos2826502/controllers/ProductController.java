package org.productos.java.productos2826502.controllers;


import java.util.List;

import org.productos.java.productos2826502.entities.Product;
import org.productos.java.productos2826502.services.ProductService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;





@RestController
@RequestMapping("/api/products")
public class ProductController {

    //Inyectando servicio
    private ProductService service = new ProductService();

    //Primer endpoint // -> metodo en un controlador 
    @GetMapping("saludo")
    public String saludo(){
        return "Hola .... "; 
    }
    //Segundo endpoint
    //Get: Obtener datos informacion sin alterar (INMUTABLE)
    @GetMapping("/{idproducto}")
    public String findProductById(@PathVariable String idproducto) {
        return "Aqui se va a mostrar el producto cuyo id es:" + idproducto;
    }

    @GetMapping
    public List<Product>finAllProducts(){
        //Utilizo el servico 
        return service.findAllProducts();
    }
    

}
