package com.zaghir.project.jcococ.hellojcoco.service;

import com.zaghir.project.jcococ.hellojcoco.dto.Product;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProductServiceImplTest {

    private  ProductService service = new ProductServiceImpl();


    @Test
    void create() {
        Product product = new Product( 1 , "banana","fruits", 1) ;
        service.create(product);
        Product productCreated = service.findProduct(1);

        Assertions.assertNotNull(productCreated);
        Assertions.assertEquals("banana", productCreated.getName());

    }

    @Test
    void findProduct() {
        Product product = new Product( 1 , "banana","fruits", 1) ;
        service.create(product);
        Product productCreated = service.findProduct(1);

        Assertions.assertNotNull(productCreated);
        Assertions.assertEquals("banana", productCreated.getName());
    }
}