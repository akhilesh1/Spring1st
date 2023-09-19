package dev.akhilesh.catalog.product.controllers;

import dev.akhilesh.catalog.product.entity.Product;
import dev.akhilesh.catalog.product.service.ProductService;
import jakarta.validation.Valid;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProductController {

    private final ProductService ps;
    private final Logger LOGGER;
    public ProductController(ProductService ps) {
        this.ps = ps;
        this.LOGGER= LoggerFactory.getLogger(ProductController.class);
    }

    @PostMapping("/Products")//If we do not add @Valid the error message will be very cryptic not meaning full
    public Product saveProduct(@Valid @RequestBody Product product){
        LOGGER.info("Product Saved");
        return ps.saveProduct(product);

    }

    @GetMapping("/Products")
    public List<Product> getProducts(){
        LOGGER.info("Product Got");
        return ps.getAllProducts();
    }
    @GetMapping("/Products/{id}")
    public Product getProduct(@PathVariable("id") Long Id){
        return ps.getProduct(Id);
    }
    @PutMapping("/Products/{id}")
    public Product updateProduct(@PathVariable("id") Long id,@RequestBody Product product){
        return ps.updateProduct(id,product);
    }

    @GetMapping("/Products/name/{name}")
    public Product getProduct(@PathVariable("name") String searchString){
        return ps.getProductByName(searchString);
    }

}
