package com.zaghir.project.jcococ.hellojcoco.dao;

import com.zaghir.project.jcococ.hellojcoco.dto.Product;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.Map;

public class ProductDaoImpl implements ProductDao{

    Map<Integer , Product> products = new HashMap<>();

    @Override
    public void create(Product product) {
        products.put(product.getId() , product);
    }

    @Override
    public Product read(int id) {
        return products.get(id);
    }

    @Override
    public void update(Product product) {

    }

    @Override
    public void delete(int id) {

    }
}
