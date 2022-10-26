package com.microserviceitem.dao.feign;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.microserviceitem.entities.Product;

/* -------------------------------------------------------------------------- */
/*                      CLIENTE REST CON FEIGN DE NETFLIX                     */
/* -------------------------------------------------------------------------- */

//Indicamos el nombre del microservicio que vamos a consumir y su puerto
@FeignClient(name = "micreoservice-products", url = "localhost:8081")
public interface IProductClientFeign {

    @GetMapping("/")
    public List<Product> findAll();

    @GetMapping("/{id}")
    public Product detail(@PathVariable Long id);

}