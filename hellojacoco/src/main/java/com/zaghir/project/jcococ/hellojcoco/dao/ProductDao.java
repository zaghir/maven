package com.zaghir.project.jcococ.hellojcoco.dao;

import com.zaghir.project.jcococ.hellojcoco.dto.Product;

public interface ProductDao {

    void create(Product product);

    Product read(int id);

    void update(Product product) ;

    void delete(int id);
}
