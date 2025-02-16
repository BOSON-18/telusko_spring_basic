package com.clumsy.ecommerce.repository;

import com.clumsy.ecommerce.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

// JpaRepository<ClassType,PrimaryKey DataType>
@Repository
public interface ProductRepo extends JpaRepository<Product,Integer> {
    //JPQL-> JPA Query Language

    @Query("SELECT p from Product p WHERE "+"LOWER(p.name) LIKE LOWER(CONCAT('%',:keyword,'%') OR"+)
    List<Product> searchProduct(String keyword);

}
