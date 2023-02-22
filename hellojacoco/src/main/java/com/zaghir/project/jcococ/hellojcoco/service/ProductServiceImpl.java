package com.zaghir.project.jcococ.hellojcoco.service;

import com.zaghir.project.jcococ.hellojcoco.dao.ProductDao;
import com.zaghir.project.jcococ.hellojcoco.dao.ProductDaoImpl;
import com.zaghir.project.jcococ.hellojcoco.dto.Product;

public class ProductServiceImpl implements ProductService{

    private static ProductDao dao = new ProductDaoImpl();
    @Override
    public void create(Product product) {
        dao.create(product);
    }

    @Override
    public Product findProduct(int id) {
        return dao.read(id);
    }
}
