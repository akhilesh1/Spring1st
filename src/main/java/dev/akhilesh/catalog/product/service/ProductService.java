package dev.akhilesh.catalog.product.service;

import dev.akhilesh.catalog.product.entity.Product;

import java.util.List;

public interface ProductService {
    Product saveProduct(Product product);

    List<Product> getAllProducts();

    Product getProduct(Long id);

    Product updateProduct(Long id, Product product);

    Product getProductByName(String searchString);
}
