package dev.akhilesh.catalog.product.repository;

import dev.akhilesh.catalog.product.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends JpaRepository<Product,Long> {
    @Query(value="Select * from Product where name like %?1% ",nativeQuery = true)
    public Product findByName(String Name);
}
