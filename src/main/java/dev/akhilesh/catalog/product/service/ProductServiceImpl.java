package dev.akhilesh.catalog.product.service;

import dev.akhilesh.catalog.product.entity.Product;
import dev.akhilesh.catalog.product.repository.ProductRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;

@Service
public class ProductServiceImpl implements  ProductService{

    private final ProductRepository productRepository;
    ProductServiceImpl(ProductRepository productRepository){
        this.productRepository=productRepository;
    }
    @Override
    public Product saveProduct(Product product) {
        return productRepository.save(product);
    }

    @Override
    public List<Product> getAllProducts() {
        return productRepository.findAll();
    }

    @Override
    public Product getProduct(Long id) {
        return productRepository.findById(id).get();
    }

    @Override
    public Product updateProduct(Long id, Product product) {

        Product dbRecord= productRepository.findById(id).get();
        if(Objects.nonNull(dbRecord)) {
            dbRecord.setCode(product.getCode());
            dbRecord.setName(product.getName());
            dbRecord.setDescription(product.getDescription());
        }
        return  productRepository.save(dbRecord);
    }
}
