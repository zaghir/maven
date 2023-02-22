package com.zaghir.project.jcococ.hellojcoco.service;

import com.zaghir.project.jcococ.hellojcoco.dto.Product;

public interface ProductService {

    public void create (Product product);

    public Product findProduct(int id);
}
