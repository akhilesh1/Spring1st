package dev.akhilesh.catalog.product.controllers;

import dev.akhilesh.catalog.product.entity.Product;
import dev.akhilesh.catalog.product.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProductController {

    private final ProductService ps;

    public ProductController(ProductService ps) {
        this.ps = ps;
    }

    @PostMapping("/Products")
    public Product saveProduct(@RequestBody Product product){
        return ps.saveProduct(product);
    }

    @GetMapping("/Products")
    public List<Product> getProducts(){
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
